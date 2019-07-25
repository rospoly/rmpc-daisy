# rmpc - Daisy

## Prerequisites

* Python (tested with Python 2.7.12):

	* Python libraries `numpy` and `cdd`: `pip install numpy cdd`

* [simple build tool (sbt)](http://www.scala-sbt.org/).

* Matlab (tested with  Matlab R2016b 9.1.0.441655 64bit):
	
	* YALMIP-master (clone [repo](https://github.com/yalmip/YALMIP)).
	
	* tbxmanager (toolbox) [install](https://www.mpt3.org/Main/Installation).
	
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

## How to run

Type in rmpc-daisy's home directory:

`python executor.py RMPC_Pendulum <delta> <epsilon>`

`python executor.py RMPC_Aircraft <delta> <epsilon>`

`python executor.py RMPC_DoubleIntegrator <horizon>`
