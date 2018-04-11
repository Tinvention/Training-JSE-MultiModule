%JAVA_HOME%/bin/java ^
--module-path ^ training-jse-multimodule-repository/target/training-jse-multimodule-repository-1.0-SNAPSHOT.jar;^
training-jse-multimodule-logic/target/training-jse-multimodule-logic-1.0-SNAPSHOT.jar;^
training-jse-multimodule-ui/target/training-jse-multimodule-ui-1.0-SNAPSHOT.jar; ^
-m ^ net.tinvention.training.jse.jpms.ui/net.tinvention.training.jse.jpms.ui.console.MainMessageUiComponent  
