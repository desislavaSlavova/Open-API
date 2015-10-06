gatling-gradle open api performance tests
=========================================

Use gradle to run gatling tests

## Config

Global gatling configs can be set in conf/gatling.conf file

Data files for Feeds should be put in data/ dir


### Basic
`gradle gatling`

or

`gradle clean gatling`

### Advanced

#### With JavaOpts

If your gatling tests expect JavaOpt arguments

`gradle clean gatling -PjvmArgs="-Dusers=10"`


#### Single Simulation
By default all simulations are run, if you want to only run a single simulation**

`gradle clean gatling -Psim="{simulation}"`

#### Listing all Simulations

`gradle listSims`

#### Running All Simulations except one or more Simulations

`gradle gatling -PignoreSims={sim}`

or 

`gradle gatling -PignoreSims={sim},{sim}`


#### Running All Simulations and generating a single report

Just get simulation.log files written:

`gradle gatling -PnoReport`

Collect all the simulation logs and write a single report for all:

`gradle mergeReport`

The `ignoreSims` works with this command as well:

`gradle gatling -PignoreSims={sim},{sim} -PnoReport`

Using them all together:

`gradle gatling -PignoreSims={sim},{sim} -PnoReport mergeReport`


## Report location

All reports are saved in `build/reports/`

If using the `mergeReport` feature the files will by default be in `build/reports/mergedSimulationLogs/`


## Configuration Options

### Gradle Tasks

 - `gatling`
 - `listSims`
 - `mergeReport`

### Modifications

To use add `-P` before the modification.

- `ignoreSims`
- `noReport`
- `sim`

## Setup in IDEs

`gradle eclipse`

or

`gradle idea`

