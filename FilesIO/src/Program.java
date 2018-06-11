import java.io.*;
import java.nio.charset.Charset;
import java.util.Date;
import static java.lang.System.out;

public class Program
{

	public static final String fileName1= // ../test1.txt
			".."+File.separator+"test1.txt";
	
	
	public static final String fileName2=
			".."+File.separator+"test2.txt";
	public static final String dir1=".."+File.separator; // ..\
	
	public static void main(String[] args) throws IOException
	{
		//out.println(File.separator);
		File f1 = new File(fileName1);
		if (!f1.exists())
			f1.createNewFile();
		
		Date lm = new Date(f1.lastModified());
		out.println(lm.toLocaleString());
		
		File d1 = new File(dir1);
		out.println(d1.getCanonicalPath());
		
		File[] files = d1.listFiles();
		for(File file : files)
		{
			Date l = new Date(file.lastModified());
			if (file.isDirectory())
				out.printf("%-20s %2$tH:%2$tM:%2$tS\n", 
						file.getName().toUpperCase(), l);
			
			if (file.isFile())
				out.printf("%-20s %2$tH:%2$tM:%2$tS\n", 
						file.getName().toLowerCase(), l);
		}
		
		
		
		FileInputStream fs = new FileInputStream(fileName1);
		//byte[] buf = new byte[1000];
		//fs.read(buf);
		//fs.close();
		
		try(BufferedReader reader = 
			new BufferedReader(
				new InputStreamReader(fs, Charset.forName("cp1251"))))
		{
			String line = null;
			int lineCounter = 0;
			int charCounter = 0;
			int wordCounter = 0;
			
			while ( (line = reader.readLine()) != null)
			{
				out.println(line);
				lineCounter++;
				charCounter += line.length();
				wordCounter += line.split("\\s").length;
			}
			out.println("-----------------------------------");
			out.printf("Total lines: %d, words: %d, chars: %d\n",
				lineCounter, wordCounter, charCounter);
		}
		
		//reader.close();
		
		
		
		/*
		FileOutputStream fos = null;
		try
		{
			fos = new FileOutputStream(fileName2);
			PrintWriter writer = new PrintWriter(fos);
			
			writer.printf("%-15s - %d\r\n", "Сергей", 35);
			writer.printf("%-15s - %d\r\n", "Наталия", 30);
			writer.printf("%-15s - %d\r\n", "Костя", 7);
			
			writer.close();
		}
		catch(IOException ex)
		{
			out.println(ex.getMessage());
			
		}
		finally
		{
			if (fos != null)
				fos.close();
		}
		
		try(RandomAccessFile rnd = new RandomAccessFile(fileName2, "rw"))
		{
			out.println(rnd.length());
		}
		
		//rnd.close();
			*/	
		
		

	}

}
