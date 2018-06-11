import static java.lang.System.out;

/*	
 * 
 * 	Throw выбрасывет ошибку
 * 
 * 	Если в блоке try ошибка то остальной код блока try не выполнится, НО программа продолжит выполняться после блока catch
 */

public class Program {

	public static void test(String s1, String s2)
		throws MyException
	{
		
		try
		{
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
			
			if (n1 < 0 || n1 > 100)
				//throw new IllegalArgumentException("n1 out of [0, 100]");
				throw new MyException("out of [0, 100]", n1);
				
			
			int n = n1 / n2;
			out.println(n);
		}
		catch(NumberFormatException ex) // Параметры класса Exceptions
		{
			out.println("не число");
			throw new RuntimeException("Invalid data",ex); // Цепочка ошибок
		}	
		finally // В блоке finaly надо писать все завершающие действия, закрытей файлов, потоков ввода вывода и т.д.
		{
			out.println("finally");
		}
		/*catch(Exception ex)
		{
			out.println(ex.getMessage());
		}*/
		/*catch(NumberFormatException | ArithmeticException ex)
		{
			out.println(ex.getMessage());
		}*/
		/*catch(ArithmeticException ex)
		{
			out.println("Деление на ноль");
		}*/
		
		out.println("продолжение работы test");
	}
	
	public static void main(String[] args)
		throws MyException
	{
		try
		{
			test("55", "5");
		}
		catch(ArithmeticException ex)
		{
			out.println("Деление на ноль");
		}
		
		out.println("продолжение работы main");
	}

}
