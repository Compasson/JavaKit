
public class Program {
	
	
	
	public static <T extends Comparable<? super T2>, T2> boolean  	
		isGreater(T a, T2 b)
	{
		return a.compareTo(b) > 0;	
	}
	
	public static <T extends Comparable<? super T>> boolean isGreater(T a, T b)
	{
		return a.compareTo(b) > 0;
	}	
	
	public static void main(String[] args) 
	{
		System.out.println(isGreater(1,2));
		
		System.out.println(isGreater(2.5,2.3));
		
		
		ReadonlyStorage<Integer> r1 = 
				new ReadonlyStorage<Integer>(5);
		
		ReadonlyStorage<Double> r2 = 
				new ReadonlyStorage<Double>(2.5);

		ReadonlyStorage<String> r3 = 
				new ReadonlyStorage<String>("abc");
		
		System.out.println(r1.getData());
		System.out.println(r2.getData() + r1.getData());
		System.out.println(r3.getData());
				
	}

}
