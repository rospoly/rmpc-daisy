# rmpc - Daisy

## Prerequisites

* Python: tested with Python 2.7.12;

	* Python libraries `numpy` and `cdd`: `pip install numpy cdd`

* [simple build tool (sbt)](http://www.scala-sbt.org/).

* Matlab: tested with  Matlab R2016b
	
	* YALMIP-master repository
	
	* tbxmanager (toolbox)
	
	* configure addpath in matlab scripts

## Installing

Type in rmpc-daisy's home directory:

```
$ sbt compile
```

Then:

```
$ sbt script
```

which will generate a script called 'daisy' which includes all the necessary files.

