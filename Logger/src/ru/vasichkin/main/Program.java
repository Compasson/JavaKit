package ru.vasichkin.main;

import ru.vasichkin.logger.ConsoleEventLogger;
import ru.vasichkin.logger.Event;
import ru.vasichkin.logger.FileEventLogger;

public class Program {

	public static void main(String[] args) {
		
	Event e = new Event("Hello!");	
	ConsoleEventLogger cel = new ConsoleEventLogger();
	cel.logEvent(e);
	
	FileEventLogger f = new FileEventLogger();
	f.logEvent(e);
	}
}
