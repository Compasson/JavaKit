package ru.vasichkin;

import ru.vasichkin.SimpleParser;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String[] keys= {"r","w","?","a","d"};           // �����
	    String[] delim= {"/","-"};     // �����������  "/", "-"
		SimpleParser sp = new SimpleParser(keys,delim);
		
		String[] ars = {"-rInFileName","-wOutFileName","-?"};
		sp.Parse(ars);
		System.out.printf("KeyValue = ", sp.getInFile());
	}

}
