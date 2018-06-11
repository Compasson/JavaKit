
enum Colors {	
	Red, Green, Blue, Grey;
	public final static Colors DEFAULT_COLOR = Colors.Green;
	
	public int z;
	
	private Colors()
	{
		this.z = 10;
	}
	
	public String upperName()
	{
		return this.name().toUpperCase();
		
	}	
}

//Colors extends Enum<Colors>


public class Program
{
	
	
	/*enum Colors 
	{ 
		Red, Green, Blue;
		
		public final static int DEFAULT_COLOR = 1;
		
		public String upperName()
		{
			return this.name().toUpperCase();
			
		}
		
	}*/
	
	
	/*
	class Colors extends Enum<Colors>
	{
		
	}*/
	
	
	public static void main(String[] args)
	{
		Colors c = Colors.Green;
		System.out.println(c);
		
		System.out.println(c.toString());
		System.out.println(c.name());
		System.out.println(c.upperName());
		int n = c.ordinal();
		System.out.println(n);
		
		Colors[] allColors = Colors.values();
		for(Colors color : allColors)
			System.out.println(color);
	}

}
