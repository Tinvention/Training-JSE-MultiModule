package net.tinvention.training.jse.jpms.logic.trivial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import net.tinvention.training.jse.jpms.logic.MessageLogic;
import net.tinvention.training.jse.jpms.logic.model.MessageModel;
import net.tinvention.training.jse.jpms.repository.mem.MessageStore;
import net.tinvention.training.jse.jpms.repository.model.Message;

public class MessageLogicImpl implements MessageLogic {
	
	private  MessageStore store = new MessageStore();
	
	public Long sendMessage(MessageModel m) {
		// some logic... here ..
		Message mForStore = new Message(m.getBody());
		mForStore.setCreated(new Date());
		return store.add(mForStore);
	}
	
	public List<MessageModel> getMessages() {
		// some logic... here ..
		// example of some trivial logic ...
		Set<Long> ids = store.getIds();
		
		// it retrieves messages as list of Message type items
		List<MessageModel> result = ids.stream()
		        .map(id -> getMessageModelById(id))
		        .collect(Collectors.toCollection(ArrayList::new));
		
		return result;
	}
	
	private MessageModel getMessageModelById(Long id) {
		Message m = store.get(id);
		MessageModel result = new MessageModel(m.getBody(), m.getId(), m.getCreated());
		result.setCreatedToday(isToday(m.getCreated()));		
		return result;
	}
	
	private boolean isToday(Date dateToCheck) {
		//Add the logic ...this is a stub
		return true; //TODO
	}

}
