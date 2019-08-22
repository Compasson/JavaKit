package ru.vasichkin.logger;

import java.util.Date;

public class Event {

	private Date date;
	private String message;
		
	public Event(String message) {
		super();
		this.date = new Date();
		this.message=message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return String.format("Mesage: %1$s  Data and Time:  %2$tY %2$td %2$tb %2$tT. ", message, date);
	}
}
