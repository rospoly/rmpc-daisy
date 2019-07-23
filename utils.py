'''
method: checkInput (dictionary F, dictionary G, dictionary HXK, int NumControllers, int dimensions)

Checks that matrices from MATLAB are consistent. 
Usefull to figure out eventual bugs in the parser.
'''
def checkInput(F, G, HXK, NumControllers, dimensions):
	if len(F)!=NumControllers:
		exit("F != NumControllers")
	if len(G)!=len(F):
		exit("G != NumControllers != F")
	if len(G)!=len(HXK):
		exit("G != HXK != F")
	if len(F[0])!=dimensions:
		exit("F[0] != dimensions")
	if isinstance(G, basestring):
		exit("G[0] is not a string")
	return

'''
method: checkforAllZeros(string res, int dimensions)

It looks for the string 0*X0 + 0*X1 + ... + 0*Xn <= 0 used for padding the matrix in MATLAB.
'''
def checkforAllZeros(res, dimensions):
	if res.count("0*")==dimensions and (("(0)" in res) or ("(0.000000000000000)" in res) or ("(0.0)" in res)):
		return True
	return False

'''
method: getNumberofHyperplanes(dictionary HXK)

It counts the total number of borders for all regions.
'''
def getNumberofHyperplanes(HXK):
	tot=0
	for key in HXK:
		for equation in HXK[key]:
			tot=tot + 1
	return tot
