module net.tinvention.training.jse.jpms.logic {
	requires net.tinvention.training.jse.jpms.repository;

	exports net.tinvention.training.jse.jpms.logic 
					to net.tinvention.training.jse.jpms.ui;
	exports net.tinvention.training.jse.jpms.logic.model 
					to net.tinvention.training.jse.jpms.ui;
	
	provides net.tinvention.training.jse.jpms.logic.MessageLogic
			with net.tinvention.training.jse.jpms.logic.trivial.MessageLogicImpl;
}