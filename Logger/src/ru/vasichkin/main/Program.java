package ru.vasichkin.main;

import java.util.ArrayList;
import java.util.List;

import ru.vasichkin.logger.CashFileEventLogger;
import ru.vasichkin.logger.ConsoleEventLogger;
import ru.vasichkin.logger.Event;
import ru.vasichkin.logger.EventLogger;
import ru.vasichkin.logger.FileEventLogger;

public class Program {

	public static void main(String[] args) {
	
	List<EventLogger> listEvent = new ArrayList<>();
		
	final Event event = new Event("Hello");	
	ConsoleEventLogger cel = new ConsoleEventLogger();
	FileEventLogger fel = new FileEventLogger();
	
	listEvent.add(cel);
	listEvent.add(fel);
	listEvent.add(e -> System.out.println("≈вент создан не был, поэтому просто сообшение"));
	listEvent.stream().forEach(e -> e.logEvent(event));
	
	//----------------------------------------------------------------------------------------
	
	CashFileEventLogger cfl = new CashFileEventLogger();
	Program p = new Program();
	p.logEvents(cfl);
	if(!cfl.getListLoggers().isEmpty()) cfl.writeLogEvent();
	
	}
	
	public void logEvents(EventLogger elogger) {
				
		for(int i=1; i<=100; i++) {
			Event e = new Event("Ёвент номер " + String.valueOf(i));
			elogger.logEvent(e);
		}
	}
}
