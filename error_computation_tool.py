import sys
import shlex
import subprocess
import os
import multiprocessing
from multiprocessing.pool import ThreadPool

'''
method: encodeInputVector(string letter, int dimensions)

Encode a new vector variable with name 'letter' using the format of Daisy.
'''
def encodeInputVector(letter, dimensions):
	finalStr=""
	for index in range(0, dimensions):
		finalStr=finalStr+letter+str(index)+":Real, "
	finalStr=finalStr[:-2]
	return finalStr

'''
method: encodeRangeInputVector(list<string> X)

Encode the range for each variable.
X is list of string, ready to be encoded in Daisy.
'''
def encodeRangeInputVector(X):
	finalStr=""
	for val in X:
		finalStr=finalStr + val + " && "
	finalStr=finalStr[:-4]
	return finalStr

'''
method: defineControllerU_i(int i, int dimensions, list<string> X, list<string> F, list<string> G, string delta="0"):

Given in input the domain of variables X, coefficients F and G,
it encodes the controller i in Daisy: U_i= F*X + G
'''
def defineControllerU_i(i, dimensions, X, F, G, delta="0"):
	finalStr=""
	index=0
	finalStr=finalStr + "def U" + str(i) + "_" + str(index) + "(" + encodeInputVector("X",dimensions) + "):Real={\n"
	finalStr=finalStr + "require(" + encodeRangeInputVector(X) + ")\n\n"
	tmp=""
	for j in range(0, dimensions):
		tmp=tmp + "(" + F[j] + ")*X" + str(j) + "+"
	tmp=tmp + "(" + G + ")"
	finalStr=finalStr + tmp + "\n\n"		
	finalStr=finalStr + "\n}"
	if delta!="0":
		finalStr=finalStr + "ensuring (res => res +/- " + delta + ")\n\n"
	else:
		finalStr=finalStr + "\n\n"
	return finalStr

'''
method: defineLine(int U_id, int Line_id, string boundlineEquation, int dimensions, list<string> X, string delta="0"):

Given in input the id of the controller (U_id), the id of the line for controller U_id,
the line equation, and the bounds for X: it encodes the bound equation H_i*X + G_i in Daisy.
'''
def defineLine(U_id, Line_id, boundlineEquation, dimensions, X, delta="0"):
	finalStr=""
	index=0
	finalStr=finalStr + "def U_" + str(U_id) + "_Line_" + str(Line_id) + "(" + encodeInputVector("X", dimensions) + "):Real={\n"
	finalStr=finalStr + "require(" + encodeRangeInputVector(X) + ")\n\n"
	lineEquation=boundlineEquation.replace("<=", "-")
	finalStr=finalStr + lineEquation + "\n\n"		
	finalStr=finalStr + "\n}"
	if delta!="0":
		finalStr=finalStr + "ensuring (res => res +/- " + delta + ")\n\n"
	else:
		finalStr=finalStr + "\n\n"
	return finalStr

def get_filename_controller_i(filename, i):
	filename_controller_i = filename + "_controllers_" + str(i)
	return filename_controller_i


def executor(cmd,outfile):
    """ This runs in a separate thread. """
    p = subprocess.Popen(shlex.split(cmd), stdout=outfile)
    p.wait()
    outfile.close()
    return

'''
method: PrecisionTuningForFXG(filename, dimensions, NumControllers, X, F, G, precision="0", delta="0"):

Given in input the id of the controller (U_id), the id of the line for controller U_id,
the line equation, and the bounds for X: it encodes the bound equation H_i*X + G_i in Daisy.
'''
def PrecisionTuningForFXG(filename, dimensions, NumControllers, X, F, G, precision="0", delta="0"):
	
	pool = ThreadPool(multiprocessing.cpu_count())
	
	for i in range(0, NumControllers):
		
		print "Quantization of Controller_" + str(i)
		
		X_final=X[i]
		
		filename_controller_i = get_filename_controller_i(filename, i)
		
		encoding_i="import daisy.lang._\nimport Real._\nobject " + filename_controller_i + " {\n\n"
		encoding_i=encoding_i + defineControllerU_i(i, dimensions, X_final, F[i], G[i], delta) + "\n"
		encoding_i=encoding_i + "}"
		
		f= open("./inputFiles/" + filename_controller_i + ".scala", "w+")
		f.write(encoding_i)
		f.close()
		
		if precision!="0":
			exe="./daisy --precision=" + precision + " --results-csv=tmp_" + filename_controller_i + ".txt ./inputFiles/" + filename_controller_i + ".scala"
		else:
			lineUNI="./daisy --mixed-fixedpoint --choosePrecision=fixed --precision=Fixed64 --results-csv=UNI_" + filename_controller_i + ".txt ./inputFiles/" + filename_controller_i + ".scala"
			lineMIX="./daisy --mixed-tuning --precision=Fixed64 --results-csv=MIX_" + filename_controller_i + ".txt ./inputFiles/" + filename_controller_i + ".scala"

			traceUNI=open("./output/UNI_Trace_" + filename_controller_i + ".txt", "w")
			#pUNI=subprocess.Popen(exeUNI, shell=False, stdout=traceUNI)
			pool.apply_async(executor,[lineUNI,traceUNI])
		
			traceMIX=open("./output/MIX_Trace_" + filename_controller_i + ".txt", "w")
			#pMIX=subprocess.Popen(exeMIX, shell=False, stdout=traceMIX)
			pool.apply_async(executor,[lineMIX,traceMIX])

	pool.close()
	pool.join()	
	print "\n\nDone with quantization of controllers"

def get_filename_ctr_id_line_id (filename, U_id, Line_id):
	filename_ctr_id_line_id= filename + "_U_" + str(U_id) + "_Line_" + str(Line_id)
	return filename_ctr_id_line_id

def PrecisionTuningForHXK(filename, numControllers, dimensions, HXK, precision="0", delta="0"):
	pool = ThreadPool(multiprocessing.cpu_count())
	
	for U_id, listLines in HXK.iteritems():
		for Line_id, tupleLineBounds in enumerate(listLines):
			
			print "Quantization of bound: Line U_" + str(U_id) + "_" + str(Line_id)
			
			filename_ctr_id_line_id = get_filename_ctr_id_line_id(filename, U_id, Line_id)
			
			line=str(tupleLineBounds[0])
			bounds= tupleLineBounds[1]
			encoding_i="import daisy.lang._\nimport Real._\nobject " + filename_ctr_id_line_id + " {\n\n"
			encoding_i=encoding_i + defineLine(U_id, Line_id, line, dimensions, bounds, delta) + "\n"
			encoding_i=encoding_i + "}"
			
			f= open("./inputFiles/" + filename_ctr_id_line_id + ".scala", "w+")
			f.write(encoding_i)
			f.close()
			
			lineUNI="./daisy --mixed-fixedpoint --choosePrecision=fixed --precision=Fixed64 --rangeMethod=interval --results-csv=UNI_" + filename_ctr_id_line_id + ".txt ./inputFiles/" + filename_ctr_id_line_id + ".scala"
			lineMIX="./daisy --mixed-tuning --precision=Fixed64 --rangeMethod=interval --results-csv=MIX_" + filename_ctr_id_line_id + ".txt ./inputFiles/" + filename_ctr_id_line_id + ".scala"
			
			#exeUNI=shlex.split(lineUNI)
			traceUNI=open("./output/UNI_Trace_" + filename_ctr_id_line_id + ".txt", "w")
			#pUNI=subprocess.Popen(exeUNI, shell=False, stdout=traceUNI)
			pool.apply_async(executor,[lineUNI,traceUNI])
									
			#exeMIX=shlex.split(lineMIX)
			traceMIX=open("./output/MIX_Trace_" + filename_ctr_id_line_id + ".txt", "w")
			#pMIX=subprocess.Popen(exeMIX, shell=False, stdout=traceMIX)
			pool.apply_async(executor,[lineMIX,traceMIX])
	
	pool.close()
	pool.join()	
	print "\n\nDone with quantization of borders"				
						
def getAbsErrorAfterFailure(line):
	if "Absolute error:" in line:
		values=line.split("Absolute error:")
		val=(values[1].strip()).split(".")[0]
		try:
			float(val)
			return val
		except:
			print "Problem during parsing of the absolute error"
			exit(0)
			
def readMaxUniformPrecisionController(filename, NumControllers):
	precision=""
	maxPrecision=0
	warningExists=False
	reachMaxPrec=False
	failure=False
	maxErrorFailure=""
	for i in range(0, NumControllers):
		filename_controller_i = get_filename_controller_i(filename, i)
		f= open("./output/UNI_Trace_" + filename_controller_i + ".txt")
		lines=f.readlines()
		for line in lines:
			if "trying precision Fixed" in line:
				val=(line.split("trying precision Fixed")[1])
				if int(val)>maxPrecision:
					maxPrecision=int(val)
			if "Warning" in line:
				warningExists=True
			if "Highest available precision Fixed64 is not sufficient" in line:
				reachMaxPrec=True
			if reachMaxPrec:
				maxErrorFailure=getAbsErrorAfterFailure(line)
		if warningExists and reachMaxPrec:
			failure=True
		f.close()
	return failure, maxErrorFailure, maxPrecision
		
def readMixedPrecisionConfigController(filename, NumControllers):
	precision=""
	totNumberBit=0
	totNumberInstructions=0
	for i in range(0, NumControllers):
		filename_controller_i = get_filename_controller_i(filename, i)
		f= open("./output/" + filename_controller_i + ".cpp")
		lines=f.readlines()
		for line in lines:
			if ";" in line and "<" in line and ">" in line:
				vals=line.split("<")[1]
				vals=vals.split(">")[0]
				val=vals.split(",")[0]
				totNumberInstructions=totNumberInstructions+1
				totNumberBit=totNumberBit + int(val)
		f.close()
	return totNumberBit, totNumberInstructions
	
def readMaxUniformPrecisionBorders(filename, NumControllers, HXK):
	precision=""
	maxPrecision=0
	totEdges=0
	warningExists=False
	reachMaxPrec=False
	failure=False
	maxErrorFailure=""
	for i in range(0, NumControllers):
		for j in range(0, len(HXK[i])):
			totEdges=totEdges + 1
			try:
				filename_ctr_id_line_id = get_filename_ctr_id_line_id(filename, i, j)
				f= open("./output/UNI_Trace_" + filename_ctr_id_line_id + ".txt")
				lines=f.readlines()
				for line in lines:
					#print line
					if "trying precision Fixed" in line:
						val=(line.split("trying precision Fixed")[1])
						if int(val)>maxPrecision:
							maxPrecision=int(val)
					if "Warning" in line:
						warningExists=True
					if "Highest available precision Fixed64 is not sufficient" in line:
						reachMaxPrec=True
					if reachMaxPrec:
						maxErrorFailure=getAbsErrorAfterFailure(line)
				if warningExists and reachMaxPrec:
					failure=True
				f.close()
			except:
				print "Error: ./output/UNI_Trace_" + filename_ctr_id_line_id + ".txt does not exist!!"
				exit(0)
	return failure, maxErrorFailure, maxPrecision
	
def readMixedPrecisionConfigBorders(filename, NumControllers, HXK):
	precision=""
	totNumberBits=0
	totNumberInstructions=0
	for i in range(0, NumControllers):
		for j in range(0, len(HXK[i])):
			try:
				filename_ctr_id_line_id = get_filename_ctr_id_line_id(filename, i, j)
				f= open("./output/" + filename_ctr_id_line_id + ".cpp")
				lines=f.readlines()
				for line in lines:
					if ";" in line and "<" in line and ">" in line:
						vals=line.split("<")[1]
						vals=vals.split(">")[0]
						val=vals.split(",")[0]
						totNumberBits=totNumberBits + int(val)
						totNumberInstructions=totNumberInstructions+1
				f.close()
			except:
				print "Error: ./output/" + filename_ctr_id_line_id + ".cpp does not exist!"
				exit(0)
	return totNumberBits, totNumberInstructions
