package ru.vasichkin;


import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.runtime.regexp.RegExp;

public class WordCounter {
    String inFile,outFile;
    static String testString = "hello world, hello";
    
    Hashtable words = new Hashtable();

    public WordCounter(String inFile, String outFile) {
        this.inFile = inFile;
        this.outFile = outFile;
    }

    public Hashtable getWords() {
        return this.words;
    }
    
    public void countWords(){
        try (BufferedReader br = new BufferedReader(getReader())) {
            for(String line = br.readLine();line != null; line = br.readLine()) {
                StringTokenizer st = new StringTokenizer(line);
                while(st.hasMoreTokens())    {
                    String token = st.nextToken();
                    token = token.replaceAll("[^a-zA-Zà-ÿÀ-ß]", "");
                    if(!this.words.containsKey(token)) {
                        this.words.put(token, 1);
                    } else {
                        this.words.put(token,(int)this.words.get(token)+1);
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
    private Reader getReader() throws FileNotFoundException, UnsupportedEncodingException {
        if(inFile!=null && new File(this.inFile).exists() && new File(this.inFile).canRead()) {
            return  new InputStreamReader(new FileInputStream(this.inFile),"UTF-8");
        } else {
            return new StringReader(testString);
        }
    }
}
