package ru.vasichkin.logger;

import java.util.ArrayList;
import java.util.List;

public class CashFileEventLogger extends FileEventLogger {

	private final static int CASHSIZE = 5;
	
	private List<Event> listLoggers = new ArrayList<>(CASHSIZE);
	
	
	@Override
	public void logEvent(Event event) {
		if(listLoggers.size() < CASHSIZE) {
			listLoggers.add(event); 
		}
		else {
			writeLogEvent();
		}
			
	}
	
	public void writeLogEvent() {
		listLoggers.forEach(super::logEvent); //Именно здесь используется наследование. Метод logEvent именно от класса FileEventLogger. listLoggers.forEach(event->super.logEvent(event));
		listLoggers.clear();
		System.out.println("CASH CLEARED!");
	}

	public List<Event> getListLoggers() {
		return listLoggers;
	}
	
	
}
