from decimal import *
import numpy
from numpy import array, hstack, ones, vstack, zeros
import cdd

'''
method: getMatrix(list<string> linesKickOff)

Read a matrix line by line until the first empty line.
'''
def getMatrix(linesKickOff):
	ret=[]
	guard=False
	for line in linesKickOff:
		if not line.isspace():
			ret.append(line)
			guard=True
		elif not guard:
			continue
		else:
			break
	return ret

'''
method: getMatrixFromPattern(string pattern, list<string> lines)

Look for a pattern (e.g. 'F = ' or 'G = ') and then read the corresponding matrix.
'''
def getMatrixFromPattern(pattern, lines):
	mat=[]
	for i in range(0, len(lines)):
		if pattern in lines[i]:
			mat=getMatrix(lines[i + 1:])
			break
	return mat

'''
method: encodeEdgeFor_H_(int index, int dimensions, list<string> values)

It builds the expression for H*X
'''
def encodeEdgeFor_H_(i, dimensions, values):
	res=""
	X="X"
	for index, value in enumerate(values[i:i + dimensions]):
		res=res + "(" + value + "*" + X + str(index) + ")+"
	res=res[:-1]
	return res
	
def getCoeffsFor_H_(i, dimensions, values):
	res=[]
	for index, value in enumerate(values[i:i + dimensions]):
		res.append(float(value))
	return res

'''
method: encodeEdgeFor_K_(string prev_from_H, string K_val , list<string> values)

Given the expression previously encoded with 'encodeEdgeFor_H_',
it builds the final expression H*X (symbol) K

default: H*X <= K
'''
def encodeEdgeFor_K_(prev_from_H, K_val, symbol="<="):
	res=prev_from_H + " " + symbol + " (" + K_val + ")"
	return res

'''
method: processBounds(list<string> listBounds, string epsilon, int dimensions)

Given a list of region bounds in the form: min_X0 max_X0 min_X1 max_X1 ...
It builds a safe range for variable X in the input format of Daisy.

'''
def processBounds(listBounds, epsilon, dimensions):
	x_i=0
	i=0
	X="X"
	finalList=[]
	while i<len(listBounds):
		finalList.append(X + str(x_i) + ">= " + listBounds[i] + "-" + epsilon)
		finalList.append(X + str(x_i) + "<= " + listBounds[i + 1] + "+" + epsilon)
		i=i + 2
		x_i=x_i + 1
	return finalList
		
'''
method: scanOutputMatlabFor_HX_lt_K(string namefile, int dimensions)

It builds a dictionary for the region bounds (H * X <= K).
The output dictionary is in the form:
	region_number -> [(equation_of_the_border,[bounds]), (equation_of_the_border,[bounds]), ...]
	
'region_pointer' maps each set of borders to a specific region (first_set -> region 0, second_set -> region 1,...) 
'LINE_RANGE' contains the equations of the borders
'''

def scanOutputMatlabFor_HX_lt_K_Line_Range(namefile, dimensions, epsilon):
	f= open(namefile)
	lines=f.readlines()
	f.close()
	HK={}
	HK_raw=getMatrixFromPattern("LINE_RANGE = ", lines)
	reg_Lim=getMatrixFromPattern("region_pointer =", lines)
	region=0
	start=0
	for reg_line_raw in reg_Lim:
		reg_line=reg_line_raw.strip()
		end=int(float(reg_line))
		for index, line in enumerate(HK_raw[start:end + 1]):
			values=line.split()
			res=encodeEdgeFor_H_(0, dimensions, values)
			res=encodeEdgeFor_K_(res, values[dimensions], symbol="-")
			bounds=processBounds(values[dimensions + 1:], epsilon, dimensions)
			if region in HK:
				HK[region].append((res, bounds))
			else:
				HK[region]=[(res, bounds)]
		region=region + 1
		start=end + 1
	return HK

def scanOutputMatlabFor_HX_lt_K_X_Range(namefile, X, dimensions, epsilon):
	f= open(namefile)
	lines=f.readlines()
	f.close()
	HK={}
	H_raw=getMatrixFromPattern("H = ", lines)
	K_raw=getMatrixFromPattern("K =", lines)
	for index_h_line, h_line in enumerate(H_raw):
		index_h=0
		index_k=0
		K_line=K_raw[index_h_line]
		K_line=K_line.strip()
		K_line=K_line.split()
		h_line=h_line.strip()
		h_line_elems=h_line.split()
		while index_h<len(h_line_elems):
			res=encodeEdgeFor_H_(index_h, dimensions, h_line_elems)
			es=encodeEdgeFor_K_(res, K_line[index_k], symbol="-")
			bounds=X[index_h_line]
			if index_h_line in HK:
				HK[index_h_line].append((res, bounds))
			else:
				HK[index_h_line]=[(res, bounds)]
			index_k=index_k+1
			index_h=index_h+dimensions
	
	return HK


'''
method: scanOutputMatlabForMax_X(string namefile, int dimensions)

It looks for min and max values for each dimension in state vector x
'''
def scanOutputMatlabForMax_X(namefile, dimensions):
	f= open("./"+namefile)
	lines=f.readlines()
	f.close()
	X_raw=getMatrixFromPattern("X =", lines)
	MAX_X={}
	for i in range(0, dimensions):
		MAX_X["X" + str(i) + "_0"]=Decimal("+Infinity")
		MAX_X["X" + str(i) + "_1"]=Decimal("-Infinity")
	for index, line in enumerate(X_raw):
		values=line.split()
		i=0
		index_x=0
		while i < len(values):
			if MAX_X["X" + str(index_x) + "_0"]>Decimal(values[i]):
				MAX_X["X" + str(index_x) + "_0"]=Decimal(values[i])
				
			if MAX_X["X" + str(index_x) + "_1"]<Decimal(values[i + 1]):
				MAX_X["X" + str(index_x) + "_1"]=Decimal(values[i + 1])
			i=i + 2
			index_x=index_x + 1
	return MAX_X

'''
method: scanOutputMatlabFor_F(string namefile)

It builds a dictionary for F
The output dictionary is in the form:
	region_number -> F1,F2,...,Fn
'''
def scanOutputMatlabFor_F(namefile):
	f= open(namefile)
	lines=f.readlines()
	f.close()
	F_raw=getMatrixFromPattern("F =", lines)
	F={}
	for index, line in enumerate(F_raw):
		values=line.split()
		for value in values:
			if index in F:
				F[index].append(value.strip())
			else:
				F[index]=[value.strip()]
	return F
	
'''
method: scanOutputMatlabFor_X_(string namefile, string epsilon)

It builds a dictionary for X
The output dictionary is in the form:
	region_number -> [X0 > lower_bound_X0 - epsilon, X0 < upper_bound_X0 + epsilon, X1 > lower_bound_X1 - epsilon, ...]

Using epsilon we build a safe bound around the region.
'''
def scanOutputMatlabFor_X_(namefile, epsilon):
	f= open(namefile)
	lines=f.readlines()
	f.close()
	X_raw=getMatrixFromPattern("X =", lines)
	X={}
	for index, line in enumerate(X_raw):
		values=line.split()
		strFinal=""
		X[index]=[]
		i=0
		j=0
		while j < len(values):
			X[index].append("X" + str(i) + ">= " + values[j] + " - (" + epsilon + ")")
			X[index].append("X" + str(i) + "<= " + values[j + 1] + " + (" + epsilon + ")")
			i=i + 1
			j=j + 2	
	return X

def compute_polytope_vertices(A, b):
    b = b.reshape((b.shape[0], 1))
    mat = cdd.Matrix(hstack([b, -A]), number_type='float')
    mat.rep_type = cdd.RepType.INEQUALITY
    P = cdd.Polyhedron(mat)
    g = P.get_generators()
    
    V = array(g)
    vertices = []
    for i in range(V.shape[0]):		
        if V[i, 0] != 1:  # 1 = vertex, 0 = ray
            raise Exception("Polyhedron is not a polytope")
        elif i not in g.lin_set:
			vertices.append((V[i, 1:]))
	
    return vertices

def computeRangeFor_X_From_H_K(namefile, dimensions, epsilon):
	f= open(namefile)
	lines=f.readlines()
	f.close()
	H_raw=getMatrixFromPattern("H = ", lines)
	K_raw=getMatrixFromPattern("K =", lines)
	
	X={}
	
	for i in range(0, len(H_raw)):
		X[i]=[]
		
	for index_h_line, h_line in enumerate(H_raw):
		K_line=K_raw[index_h_line]
		K_line=K_line.strip()
		K_line=K_line.split()
		
		h_line=h_line.strip()
		h_line_elems=h_line.split()
		num_edges=len(h_line_elems)/dimensions
		index_h=0
		index_k=0
		H_encode = numpy.zeros((num_edges,dimensions), numpy.float64)
		K_encode = numpy.zeros((num_edges,1), numpy.float64)
		
		while index_h<len(h_line_elems):
			HLine_vector=numpy.asarray(getCoeffsFor_H_(index_h, dimensions, h_line_elems))
			KLine_vector=numpy.asarray(float(K_line[index_k]))
			H_encode[index_k]=HLine_vector
			K_encode[index_k]=KLine_vector					
			index_k=index_k+1
			index_h=index_h+dimensions
		
		array_vertices_raw=compute_polytope_vertices(H_encode,K_encode)
		MAX_X={}
		for i in range(0, dimensions):
			MAX_X["X" + str(i) + "_0"]=Decimal("+Infinity")
			MAX_X["X" + str(i) + "_1"]=Decimal("-Infinity")
			
		for array_raw in array_vertices_raw:
			values=array_raw.tolist()
			index_x=0
			while index_x < len(values):
				if MAX_X["X" + str(index_x) + "_0"]>values[index_x]:
					MAX_X["X" + str(index_x) + "_0"]=values[index_x]
					
				if MAX_X["X" + str(index_x) + "_1"]<values[index_x]:
					MAX_X["X" + str(index_x) + "_1"]=values[index_x]
				index_x=index_x + 1

		for i in range(0, dimensions):
			X[index_h_line].append("X" + str(i)+">="+str(MAX_X["X" + str(i) + "_0"])+" - ("+epsilon+")")
			X[index_h_line].append("X" + str(i)+"<="+str(MAX_X["X" + str(i) + "_1"])+" + ("+epsilon+")")
			
	return X

'''
method: scanOutputMatlabFor_G(string namefile)

It builds a dictionary for G
The output dictionary is in the form:
	region_number -> G1,G2,...,Gn
'''
def scanOutputMatlabFor_G(namefile):
	f= open(namefile)
	lines=f.readlines()
	f.close()
	G_raw=getMatrixFromPattern("G =", lines)
	G={}
	for index, line in enumerate(G_raw):
		G[index]=line.strip()
	return G
	
'''
method: scanOutputMatlabForMaxUiUj(string outputFile)

It looks in file outputFile for the value max |Ui-Uj|
'''	
def scanOutputMatlabForMaxUiUj(outputFile):
	f= open(outputFile)
	lines=f.readlines()
	f.close()
	maxUiUj_raw=getMatrixFromPattern("error_ij =", lines)
	maxUiUj=maxUiUj_raw[0].strip()
	try:
		float(maxUiUj)
	except:
		print "error_ij in wrong format"
		exit(0)
	return maxUiUj
