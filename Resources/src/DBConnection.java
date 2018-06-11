import java.io.*;


public class DBConnection implements Closeable 
{
	public DBConnection()
	{
		System.out.println("Open connection");
	}
	
	public void executeCommand()
	{
		System.out.println("execute command");
	}
	
	/*@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Close connection");
	}*/
	
	
	boolean isClosed = false; 
	@Override
	public void close()
	{
		if (!isClosed)
		{
			System.out.println("Close connection");
			isClosed = true;
		}
	}
	
}
