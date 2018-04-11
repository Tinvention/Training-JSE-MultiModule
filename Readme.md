# Examples of Java Multi-Module projects [ Maven Build ] 

* On *master* branch there is the "pure" jdk version  
* On *maven* branch there is the maven version

## Contents
There are two projects:

* *Training-JSE-MonoModule-HelloWorld* is a mono module application, an HelloWorld using java modules way.
* *Training-JSE-MultiModule-Layering* is an example of layered applicaiton composed by three modules where modularization are used for layering the architecture. There also is a really simple example of the use of the Service provider interface (SPI) way, to select run-time a service implementation. The service implementation it is in the same module, only for simplicity.

## Note
* This example do not use *Apache Maven JMod Plugin* or *Apache Maven JLink Plugin* . Currently the are in alpha version.
* Below it is used the "/" char for "cd" commands, on *Windows* you need to use "\\" in place of "/"

### Requirements

* the __JDK ( 9 or above)  is needed__
* the __Maven ( 3.3.3 or above ) is needed__

## Training-JSE-MultiModule-HelloWorld

### Hints to compile it

```
cd [your-path]/Training-JSE-MonoModule-HelloWorld 

mvn compile

```
### Hints for running it

```
cd [your-path]/Training-JSE-MultiModule-HelloWorld 

mvn exec:exec

```

## Training-JSE-MultiModule-Layering

### Hints to compile it

```
cd [your-path]/Training-JSE-MultiModule-Layering 

mvn compile

```

### Hints for running it

```
cd [your-path]/Training-JSE-MultiModule-Layering
 
mvn package

```

On Linux
```
./run.sh 

```

On Windows
```
run.cmd 

```


