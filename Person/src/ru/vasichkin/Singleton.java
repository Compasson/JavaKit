package ru.vasichkin;

// Простейшая реализация singleton
public class Singleton {
	
	private Singleton() {}
	private static Singleton instance=null;
	
	public static Singleton getIntance() {
		if(instance==null)
			instance=new Singleton();
		return instance;
	}
}
