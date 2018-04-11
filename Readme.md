
# Examples of Java Multi-Module projects [ Pure JDK build ] 

* On *master* branch there is the "pure" jdk version  
* On *maven* branch there is the maven version

## Contents
There are two projects:
* *Training-JSE-MonoModule-HelloWorld* is a mono module application, an HelloWorld using java modules way.
* *Training-JSE-MultiModule-Layering* is an example of layered applicaiton composed by three modules where modularization are used for layering the architecture. There also is a really simple example of the use of the Service provider interface (SPI) way, to select run-time a service implementation. The service implementation it is in the same module, only for simplicity.

## Notes
* Below it is used the "/" char for "cd" commands, on *Windows* you need to use "\\" in place of "/"

### Requirements

Only the __JDK ( 9 or above)  is needed__

## Training-JSE-MultiModule-HelloWorld

### Hints to manually compile it

```
cd [your-path]/Training-JSE-MonoModule-HelloWorld 

javac --module-path mod -d mod/net.tinvention.training.jse.jpms \
src/net/tinvention/training/jse/jpms/module-info.java  \
src/net/tinvention/training/jse/jpms/hw/HelloWorld.java 

```
### Hints for running it

```
cd [your-path]/Training-JSE-MultiModule-HelloWorld 

java --module-path mod  -m net.tinvention.training.jse.jpms/net.tinvention.training.jse.jpms.hw.HelloWorld

```

## Training-JSE-MultiModule-Layering

### Hints to manually compile it

```
cd [your-path]/Training-JSE-MultiModule-Layering 

javac --module-path mod -d mod/net.tinvention.training.jse.jpms.repository \
training-jse-multimodule-repository/src/net.tinvention.training.jse.jpms.repository/module-info.java \
training-jse-multimodule-repository/src/net.tinvention.training.jse.jpms.repository/net/tinvention/training/jse/jpms/repository/model/Message.java \
training-jse-multimodule-repository/src/net.tinvention.training.jse.jpms.repository/net/tinvention/training/jse/jpms/repository/mem/MessageStore.java

javac --module-path mod -d mod/net.tinvention.training.jse.jpms.logic \
training-jse-multimodule-logic/src/net.tinvention.training.jse.jpms.logic/module-info.java \
training-jse-multimodule-logic/src/net.tinvention.training.jse.jpms.logic/net/tinvention/training/jse/jpms/logic/MessageLogic.java \
training-jse-multimodule-logic/src/net.tinvention.training.jse.jpms.logic/net/tinvention/training/jse/jpms/logic/trivial/MessageLogicImpl.java \
training-jse-multimodule-logic/src/net.tinvention.training.jse.jpms.logic/net/tinvention/training/jse/jpms/logic/model/MessageModel.java 

javac --module-path mod -d mod/net.tinvention.training.jse.jpms.ui \
training-jse-multimodule-ui/src/net.tinvention.training.jse.jpms.ui/module-info.java \
training-jse-multimodule-ui/src/net.tinvention.training.jse.jpms.ui/net/tinvention/training/jse/jpms/ui/console/MainMessageUiComponent.java 

```

### Hints for running it

```
cd [your-path]/Training-JSE-MultiModule-Layering 

java --module-path mod \-m net.tinvention.training.jse.jpms.ui/net.tinvention.training.jse.jpms.ui.console.MainMessageUiComponent

```


