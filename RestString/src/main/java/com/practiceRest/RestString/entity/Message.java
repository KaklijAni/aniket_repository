package com.practiceRest.RestString.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {
    
	@Id
	private String responseMessage;

	public Message(String responseMessage) {
		super();
		this.responseMessage = responseMessage;
	}

	@Override
	public String toString() {
		return "Message [responseMessage=" + responseMessage + "]";
	}

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
}
