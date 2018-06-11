package ru.specialist;

import static java.lang.System.out;

import java.io.IOException;
import java.nio.file.*;

public class Program {
	
	public static final String filename = "test1.txt";

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		Files.readAllLines(Paths.get("..", filename)).
			forEach(out::println);
		
		
		
		Path dir = Paths.get("..");
		Files.newDirectoryStream(dir).
			forEach(out::println);
		
		
		WatchService watchDog = 
				FileSystems.getDefault().newWatchService();
		
		WatchKey key = 
				dir.register(watchDog, StandardWatchEventKinds.ENTRY_CREATE);
		
		key = watchDog.take();
		key.pollEvents().stream().
			forEach(e->out.println(((Path)e.context()).getFileName() ));
		
		/*
		for (WatchEvent<?> event: key.pollEvents()) {
	        WatchEvent<Path> ev = (WatchEvent<Path>)event;
	        Path filename = ev.context();
	        out.println(filename);
		}*/

	}
	
	
	

}
