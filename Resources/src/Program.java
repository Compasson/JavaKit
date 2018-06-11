import java.io.IOException;


public class Program
{

	public static void main(String[] args) 
	{
		/*
		DBConnection c = new DBConnection();
		try{
			c.executeCommand();
		}
		finally
		{
			c.close();
		}*/
		try(DBConnection c = new DBConnection())
		{
			c.executeCommand();	
		} // c.close()
		
	}

}
