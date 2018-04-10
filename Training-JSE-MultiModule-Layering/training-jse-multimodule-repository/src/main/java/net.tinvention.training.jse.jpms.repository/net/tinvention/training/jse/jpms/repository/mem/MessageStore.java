package net.tinvention.training.jse.jpms.repository.mem;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import net.tinvention.training.jse.jpms.repository.model.Message;

public class MessageStore {

	private Map<Long, Message> storeStatus = new HashMap<>();
	private Long lastId = 0L ; //Last Generated Id

	public Long add(Message msg) {
		Long newId = lastId + 1 ;
		
		msg.setId(newId);
		storeStatus.put(newId, msg);
		
		lastId = newId;
		return newId;
	}	

	public Message get(Long id) {		
		return storeStatus.get(id);
	}
	
	public Set<Long> getIds() {		
		return storeStatus.keySet();
	}

}
