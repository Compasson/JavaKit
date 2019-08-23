package ru.vasichkin.logger;

import java.util.Date;

public class Event implements EventLogger {

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

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("Message: %1$-50s  Data and Time:  %2$tY %2$td %2$tb %2$tT. \n", message, date);
	}

	@Override
	public void logEvent(Event event) {
		
		System.out.println(event.toString());
	}
}
