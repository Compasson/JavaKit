package ru.vasichkin;

import ru.vasichkin.SimpleParser;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String[] keys= {"r","w","?","a","d"};           // ключи
	    String[] delim= {"/","-"};     // разделители  "/", "-"
		SimpleParser sp = new SimpleParser(keys,delim);
		
		sp.Parse(args);
		System.out.printf("Name InFile = %s,   Name Out File = %s\n", sp.getInFile(),sp.getOutFile());
	}

}
