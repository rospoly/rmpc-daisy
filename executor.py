import sys
import shlex
import shutil
import subprocess
import time
import os
import decimal

from decimal import *
from utils import *

from error_computation_tool import *
from parser_output_from_MATLAB import *

########################################################################
#### INPUT PARAMETERS ##################################################
########################################################################

if len(sys.argv)<3:
	print "Wrong number of arguments.\n"
	print "Arg-1 MATLAB name of the script\n"
	print "Arg-2 First Parameter ('delta' for Aircraft and Pendolum, 'horizon' for double integrator)\n"
	print "Arg-3 Second Parameter ('eps' for Aircraft and Pendolum, N/A for double integrator)\n"
	exit("Please provide input parameters. \n\nEx. python executor.py RMPC_Pendulum 0.1 0.001\n\nEx. python executor.py RMPC_DoubleIntegrator 5")

try:
	matlabNamefile=str(sys.argv[1]) #matlab script name
	matlabDelta=str(sys.argv[2]) #max disturbance input to Matlab

	if "RMPC_DoubleIntegrator" in matlabNamefile:
		epsilon="N/A"
	else:
		epsilon=str(sys.argv[3]) #size of the tubes

	filename="TMP_"+matlabNamefile

	print "\n\nMax iterations = +infinite (until convergence)\n\n"
	maxIterations=1000
	outputFile="outputMatlab.txt"
	epsilonSAFE="0.001"
	spaceForFPError="N/A"
	iteration=0
except:
	print "Error while parsing input arguments.\n\n"
	print "Arg-1 MATLAB name of the script\n"
	print "Arg-2 First Parameter ('delta' for Aircraft and Pendolum, 'horizon' for double integrator)\n"
	print "Arg-3 Second Parameter ('eps' for Aircraft and Pendolum, N/A for double integrator)\n"
	exit("Please provide input parameters. \nEx. python executor.py RMPC_Pendulum 0.1 0.001\nEx. python executor.py RMPC_DoubleIntegrator 5")

########################################################################
########################################################################

print "###START###\n\n"

start = time.time()

while True:
	
	if "RMPC_DoubleIntegrator" in matlabNamefile:
		print "Horizon: "+str(matlabDelta)
	else:
		print "Robustness coefficient (delta) given to MATLAB: " + matlabDelta + "\n\n"
		print "Size of the tubes (epsilon): " + epsilon + "\n\n"	

	if os.path.exists("./output/"):
		shutil.rmtree("./output/", ignore_errors=True)
	os.mkdir('./output/')
	if os.path.exists("./inputFiles/"):
		shutil.rmtree("./inputFiles/", ignore_errors=True)
	os.mkdir('./inputFiles/')
		
	try:
		exe="matlab -nodisplay -nosplash -nodesktop -r \""+matlabNamefile+"("+str(matlabDelta)+","+str(epsilon)+"); quit\" > " + str(outputFile)
		exe=shlex.split(exe)
		p=subprocess.Popen(exe, shell=False)
		p.wait()
	except:
		print "Error while calling matlab"
		exit(0)
	
	#this is for the scalability experiment
	if "RMPC_DoubleIntegrator" in matlabNamefile:
		matlabDelta="0.1"
		epsilon="0.001"
	
	X=scanOutputMatlabFor_X_(outputFile, epsilon)
	F=scanOutputMatlabFor_F(outputFile)
	G=scanOutputMatlabFor_G(outputFile)
	dimensions=int(len(F[0]))
	numControllers=int(len(F))
	#HXK=scanOutputMatlabFor_HX_lt_K_Nc(outputFile, dimensions, epsilon)
	HXK=scanOutputMatlabFor_HX_lt_K_Line_Range(outputFile, dimensions, epsilon)
	#HXK=scanOutputMatlabFor_HX_lt_K_X_Range(outputFile, X, dimensions, epsilon)
	#computedRangeForX = computeRangeFor_X_From_H_K(outputFile, dimensions, epsilon)
	maxUiUj= scanOutputMatlabForMaxUiUj(outputFile)
	checkInput(F, G, HXK, numControllers, dimensions)
	
	if (Decimal(matlabDelta)>=Decimal(maxUiUj)):
		spaceForFPError=str(Decimal(matlabDelta)-Decimal(maxUiUj))
		PrecisionTuningForFXG(filename, dimensions, numControllers, X, F, G, precision="0", delta=spaceForFPError)
		PrecisionTuningForHXK(filename, numControllers, dimensions, HXK, precision="0", delta=epsilon)
		failureC, maxErrorFailureC, maxValueCtr=readMaxUniformPrecisionController(filename, numControllers)
		totPrecCtr, totNumberInstructionsCtr = readMixedPrecisionConfigController(filename, numControllers)
		failureB, maxErrorFailureB, maxValueBrd=readMaxUniformPrecisionBorders(filename, numControllers, HXK)
		totPrecBrd, totNumberInstructionsBrd=readMixedPrecisionConfigBorders(filename, numControllers, HXK)
		if not failureC and not failureB:
			break
		else:
			print "UNABLE to satisfy the matlab bound (even with with Float64 precision). Asking MATLAB for new controller."
			matlabDelta=str(Decimal(Decimal(matlabDelta) + max(Decimal(maxErrorFailureB),Decimal(maxErrorFailureC))))
	else:
		print "UNABLE to satisfy the matlab bound because of max|Ui-Uj| = " + str(maxUiUj) + " > " + matlabDelta + ". Asking MATLAB for new controller."
		matlabDelta=str(Decimal(maxUiUj)+Decimal(epsilonSAFE))
	
	iteration=iteration + 1
	if iteration>=maxIterations:
		print "Reached max number of iterations. Exit."
		break
				
end = time.time()

#try:
print "\n\nRESULTS: \n"
print "Execution time of the analysis: " + str((end - start)/60.0) + " min"
print "Delta = " + str(matlabDelta)
print "Epsilon = " + str(epsilon)
print "Max |Ui - Uj| = " + str(maxUiUj)
print "Number of regions = " + str(len(F))
print "Number of hyperplanes = " + str(getNumberofHyperplanes(HXK))
print "State Space X bounds: " + str(scanOutputMatlabForMax_X(outputFile, dimensions))
print "Space for FP error = " + str(spaceForFPError)
print "\n\n"
print "Total number of instructions controllers: "+str(totNumberInstructionsCtr)
print "Precision for Controllers(F and G) UNIFORM: Fixed32, Total number of bits: " + str(32*totNumberInstructionsCtr) + "\n"
print "Precision for Controllers(F and G) UNIFORM: Fixed" + str(maxValueCtr) + ", Total number of bits: " + str(maxValueCtr*totNumberInstructionsCtr)
print "Precision for Controllers(F and G) MIX: total number of bits: " + str(totPrecCtr)
print "Mixed uses " + str(100.0-(float(totPrecCtr)/(maxValueCtr*totNumberInstructionsCtr))*100.0) + "% less than uniform\n\n"
print "Total number of instructions borders: "+str(totNumberInstructionsBrd)
print "Precision for Controllers(H and K) UNIFORM: Fixed32, Total number of bits: " + str(32*totNumberInstructionsBrd)
print "Precision for Controllers(H and K) UNIFORM: Fixed" + str(maxValueBrd) + ", Total number of bits: " + str(maxValueBrd*totNumberInstructionsBrd)
print "Precision for Controllers(H and K) MIX: total number of bits: " + str(totPrecBrd)
print "Mixed uses " + str(100.0-(float(totPrecBrd)/(maxValueBrd*totNumberInstructionsBrd))*100.0) + "% less than uniform"
print "\n\n###COMPLETE###"
#except:
#	print "Exception while printing statistics."

exit(0)
