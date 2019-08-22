package ru.vasichkin.logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;


public class FileEventLogger implements EventLogger {

	private String filename = ".." + File.separator + "Logger/loggerEvents.txt";
	private File file;
	
	private FileOutputStream fos = null;
	private PrintWriter writer;
	
	
	
	public FileEventLogger() {
		super();
		this.file = new File(filename);
		if(!this.file.exists())
			try {
				this.file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Override
	public void logEvent(Event event) {
		
		try {
			this.fos = new FileOutputStream(file, true);
			this.writer = new PrintWriter(fos);
			writer.printf("%s", event.toString());
			writer.close();
			System.out.println("Writing in file succsess!" + event.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			if (this.fos != null)
				try {
					this.fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}	
	}	
}
