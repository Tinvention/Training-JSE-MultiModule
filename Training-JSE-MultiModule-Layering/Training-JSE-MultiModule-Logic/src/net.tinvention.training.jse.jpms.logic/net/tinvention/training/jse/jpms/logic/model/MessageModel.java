package net.tinvention.training.jse.jpms.logic.model;

import java.util.Date;

import net.tinvention.training.jse.jpms.repository.model.Message;

public class MessageModel {

	private Message message;
	private boolean createdToday;

	public MessageModel(String body, Long id, Date created) {
		message = new Message(body);
		message.setId(id);
		message.setCreated(created);
	}

	public MessageModel() {
		super();
	}

	public MessageModel(String body) {
		this(body, null, null);
	}

	public Long getId() {
		return message.getId();
	}

	public String getBody() {
		return message.getBody();
	}

	public void setBody(String body) {
		message.setBody(body);
	}

	public Date getCreated() {
		return message.getCreated();
	}

	public void setCreated(Date created) {
		message.setCreated(created);
	}

	public boolean isCreatedToday() {
		return createdToday;
	}

	public void setCreatedToday(boolean createdToday) {
		this.createdToday = createdToday;
	}

	@Override
	public String toString() {
		return message.toString() + " ; createdToday:" + createdToday;
	}

}
