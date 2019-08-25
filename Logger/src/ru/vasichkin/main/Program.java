package ru.vasichkin.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.vasichkin.logger.CashFileEventLogger;
import ru.vasichkin.logger.ConsoleEventLogger;
import ru.vasichkin.logger.Event;
import ru.vasichkin.logger.EventLogger;
import ru.vasichkin.logger.SysMessage;

public class Program {

	private Map<SysMessage, List<EventLogger>> sysMapTable;
	private ConsoleEventLogger cel;
	private static CashFileEventLogger cfl;
	
	public static void main(String[] args) {
	
	
	//------------------------------------------------------------
	// Использование generics. Квадрат, круг,треугольник. И их методы нарисовать, уменьшить, увеличить. 
		
		
		
	//------------------------------------------------------------
	//Пример использования сообшений с типом INFO, WARNING, ERROR замапиным в HashTable
	Program p = new Program();
	p.logEvents();
	if(!cfl.getListLoggers().isEmpty()) cfl.writeLogEvent();
	
	
	
	/*
	//----------------------------------------------------------------------------------------
	// Использование CashFileLoggers, запись после наполнения кеша.
	
	CashFileEventLogger cfl = new CashFileEventLogger();
	Program p = new Program();
	p.logEvents(cfl);
	if(!cfl.getListLoggers().isEmpty()) cfl.writeLogEvent();
	
	*/
	
	
	/*
	//--------------------------------------------------------------
	// Пример использования лямбда выражения 
	 
	List<EventLogger> listEvent = new ArrayList<>();
		
	final Event event = new Event("Hello");	
	ConsoleEventLogger cel = new ConsoleEventLogger();
	FileEventLogger fel = new FileEventLogger();
	
	listEvent.add(cel);
	listEvent.add(fel);
	listEvent.add(e -> System.out.println("Евент создан не был, поэтому просто сообшение"));
	listEvent.stream().forEach(e -> e.logEvent(event));
	 */
	}
		
	public Program() {
		super();
		//Мапинг типов сообщений
		this.sysMapTable = new HashMap<>();
		this.cel = new ConsoleEventLogger();
		this.cfl = new CashFileEventLogger();
		
		ArrayList<EventLogger> dm = new ArrayList<>();
		dm.add(cel);
		this.sysMapTable.put(SysMessage.DEFAULT_MESSAGE, dm);
		
		ArrayList<EventLogger> w = new ArrayList<>();
		w.add(cfl);
		this.sysMapTable.put(SysMessage.WARNING, w);
		
		ArrayList<EventLogger> e = new ArrayList<>();
		e.add(cel);
		e.add(cfl);
		this.sysMapTable.put(SysMessage.ERROR, e);
		//-------------------------------------------

	}
	
	public void logEvents() {
		
		for (int i=1; i<=50; i++) {
			Event eventInfo = new Event("Эвент номер:  " + String.valueOf(i) + "   Тип сообщения: INFO");
			sysMapTable.get(SysMessage.INFO).forEach(logger -> logger.logEvent(eventInfo));
			
			Event eventWar = new Event("Эвент номер:  " + String.valueOf(i) + "   Тип сообщения: WARNING");
			sysMapTable.get(SysMessage.WARNING).forEach(logger -> logger.logEvent(eventWar));
			
			Event eventError = new Event("Эвент номер:  " + String.valueOf(i) + "   Тип сообщения: ERROR");
			sysMapTable.get(SysMessage.ERROR).forEach(logger -> logger.logEvent(eventError));
		}
	}


	public void logEvents(EventLogger elogger) {
				
		for(int i=1; i<=100; i++) {
			Event e = new Event("Эвент номер:  " + String.valueOf(i));
			elogger.logEvent(e);
		}
	}
	
	
}
