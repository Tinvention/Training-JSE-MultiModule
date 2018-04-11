package net.tinvention.training.jse.jpms.repository.model;

import java.util.Date;

public class Message {

	private Long id;
	private String body;
	private Date created;

	public Message() {
		super();
	}

	public Message(String body) {
		super();
		this.body = body;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "id:" + id + "; body:" + body + "; created:" + created;
	}

	
}
