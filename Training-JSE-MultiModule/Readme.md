
# Examples of Java Multi-Module projects

There are two projects:
* *Training-JSE-MonoModule-HelloWorld* is a mono module application, an HelloWorld using java modules way.
* *Training-JSE-MultiModule-Layering* is an example of layered applicaiton composed by three modules where modularization are used for layering the architecture. There also is a really simple example of the use of the Service provider interface (SPI) way, to select run-time a service implementation. The service implementation it is in the same module, only for simplicity.


### Requirements

Only the __JDK ( 9 or above)  is needed__

## Training-JSE-MultiModule-HelloWorld

### Hints to manually compile it

```
cd [your-path]/Training-JSE-MultiModule-HelloWorld 

javac --module-path mod -d mod/net.tinvention.training.jse.jpms \
  src/net/tinvention/training/jse/jpms/module-info.java \ 
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
  Training-JSE-MultiModule-Repository/src/net.tinvention.training.jse.jpms.repository/module-info.java \
  Training-JSE-MultiModule-Repository/src/net.tinvention.training.jse.jpms.repository/net/tinvention/training/jse/jpms/repository/model/Message.java \
  Training-JSE-MultiModule-Repository/src/net.tinvention.training.jse.jpms.repository/net/tinvention/training/jse/jpms/repository/mem/MessageStore.java

javac --module-path mod -d mod/net.tinvention.training.jse.jpms.logic \
  Training-JSE-MultiModule-Logic/src/net.tinvention.training.jse.jpms.logic/module-info.java \
  Training-JSE-MultiModule-Logic/src/net.tinvention.training.jse.jpms.logic/net/tinvention/training/jse/jpms/logic/MessageLogic.java \
  Training-JSE-MultiModule-Logic/src/net.tinvention.training.jse.jpms.logic/net/tinvention/training/jse/jpms/logic/trivial/MessageLogicImpl.java \
  Training-JSE-MultiModule-Logic/src/net.tinvention.training.jse.jpms.logic/net/tinvention/training/jse/jpms/logic/model/MessageModel.java 

javac --module-path mod -d mod/net.tinvention.training.jse.jpms.ui \
  Training-JSE-MultiModule-UI/src/net.tinvention.training.jse.jpms.ui/module-info.java  \
  Training-JSE-MultiModule-UI/src/net.tinvention.training.jse.jpms.ui/net/tinvention/training/jse/jpms/ui/console/MainMessageUiComponent.java 

```

### Hints for running it

```
cd [your-path]/Training-JSE-MultiModule-Layering 

java --module-path mod  \ 
  -m net.tinvention.training.jse.jpms/net.tinvention.training.jse.jpms.ui.console.MainMessageUiComponent

```


