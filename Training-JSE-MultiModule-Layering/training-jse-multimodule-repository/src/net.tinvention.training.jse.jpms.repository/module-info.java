module net.tinvention.training.jse.jpms.repository {
	exports net.tinvention.training.jse.jpms.repository.model 
							to net.tinvention.training.jse.jpms.logic;
	exports net.tinvention.training.jse.jpms.repository.mem 
							to net.tinvention.training.jse.jpms.logic;
}