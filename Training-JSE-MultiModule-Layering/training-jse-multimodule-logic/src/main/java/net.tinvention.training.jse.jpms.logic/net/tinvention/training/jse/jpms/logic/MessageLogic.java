package net.tinvention.training.jse.jpms.logic;

import java.util.List;

import net.tinvention.training.jse.jpms.logic.model.MessageModel;

public interface MessageLogic {

	public Long sendMessage(MessageModel m);

	public List<MessageModel> getMessages();

}
