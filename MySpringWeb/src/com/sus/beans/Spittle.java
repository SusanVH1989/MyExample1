package com.sus.beans;

import java.util.Date;

public class Spittle {
	private final Long id;
	private final String message;
	private final Date time;
	private Double latitude;
	private Double longitude;
	public Spittle(String message, Date time,long id) {
	this(message, time, null, null,id);
	}
	public Spittle(
	String message, Date time, Double longitude, Double latitude,long id) {
	this.id = id;
	this.message = message;
	this.time = time;
	this.longitude = longitude;
	this.latitude = latitude;
	}
	public long getId() {
	return id;
	}
	public String getMessage() {
	return message;
	}
	public Date getTime() {
	return time;
	}

}
