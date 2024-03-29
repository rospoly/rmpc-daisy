# rmpc - Daisy: an algorithm for space-efficient implementations of explicit MPC for robust control of LTI systems

## Publications

* Memory-Efficient Mixed-Precision Implementations for Robust Explicit Model Predictive Control, M. Salamati, R. Salvia, E. Darulova, S. Soudjani and R. Majumdar. (EMSOFT 2019)

## Requirements

* Python (tested with Python 2.7.12 on Debian GNU/Linux 9.9):

	* Python libraries `numpy` and `cdd`: `pip install numpy cdd`

* Install [simple build tool (sbt)](http://www.scala-sbt.org/).

* Install Matlab (tested with  Matlab R2016b 9.1.0.441655 64bit) and the following libraries:
	
	* Clone YALMIP-master ([repo](https://github.com/yalmip/YALMIP)).
	
	* Install Multi-Parametric Toolbox 3 ([tbxmanager](https://www.mpt3.org/Main/Installation)).
	
* Replace the string `<put-your-path-here>` in files `RMPC_Aircraft.m`, `RMPC_DoubleIntegrator.m` and `RMPC_Pendulum.m`:
	
	* Replace `addpath(genpath('/<put-your-path-here>/YALMIP-master'))` with your local path to `YALMIP` directory.
	
	* Replace `addpath(genpath('/<put-your-path-here>/rmpc-daisy/matlab_lib'))` with your local path to `rmpc-daisy` directory.
	
	* Replace `addpath(genpath('/<put-your-path-here>/tbxmanager'))` with your local path to `tbxmanager` directory.

## Setup

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
