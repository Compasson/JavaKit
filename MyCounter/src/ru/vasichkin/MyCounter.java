package ru.vasichkin;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Collections;

public class MyCounter {

    public static void main(String[] args) throws IOException {
        SimpleParser sp=new SimpleParser();  
        sp.Parse(args);
        
        //System.out.println(sp.getInFile()+"\t"+sp.getOutFile());
        
        WordCounter wc=new WordCounter(sp.getInFile(),sp.getOutFile());
        wc.countWords();
        
        Enumeration<String> keys = wc.getWords().keys();
        while(keys.hasMoreElements()){
           String w=keys.nextElement().toString(); 
           int n= (int)wc.getWords().get(w);
           System.out.println(w+"\t"+n);
        }
        
        String teststring = "available";
        System.out.printf("Слово: %s в hashtable - %s\n",teststring , wc.getWords().containsKey(teststring));
        
        
    }
}
