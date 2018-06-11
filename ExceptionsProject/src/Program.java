import static java.lang.System.out;

/*	
 * 
 * 	Throw ���������� ������
 * 
 * 	���� � ����� try ������ �� ��������� ��� ����� try �� ����������, �� ��������� ��������� ����������� ����� ����� catch
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
		catch(NumberFormatException ex) // ��������� ������ Exceptions
		{
			out.println("�� �����");
			throw new RuntimeException("Invalid data",ex); // ������� ������
		}	
		finally // � ����� finaly ���� ������ ��� ����������� ��������, �������� ������, ������� ����� ������ � �.�.
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
			out.println("������� �� ����");
		}*/
		
		out.println("����������� ������ test");
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
			out.println("������� �� ����");
		}
		
		out.println("����������� ������ main");
	}

}
