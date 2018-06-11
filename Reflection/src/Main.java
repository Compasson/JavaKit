import java.lang.reflect.*;

import static java.lang.System.out;
import java.io.*;



public class Main {

	public static void main(String[] args) throws IOException, IllegalArgumentException, IllegalAccessException, ClassNotFoundException, InstantiationException 
	{
		BufferedReader reader = 
			new BufferedReader(new InputStreamReader(System.in));
		
		//Calculator c = new Calculator();
		//Class cInfo = c.getClass();
		
		String className = "Calculator";
		
		Class cInfo = Class.forName(className);
		
		
		Object c = cInfo.newInstance(); // new Calculator();
		
		Field[] fields = cInfo.getDeclaredFields();
		
		for(Field field : fields)
		{
			out.printf("%s = ", field.getName());
			int n = Integer.parseInt(reader.readLine());
			field.setInt(c, n); // c.n1 = n
		}
		
		Method[] methods = cInfo.getDeclaredMethods();
		
		for(Method method : methods)
		{
			if ( Modifier.isPublic(method.getModifiers()) )
				out.println(method.getName());
			
		}
		out.println("Выберите оператор:");
		String action = reader.readLine();
		
		Method mForAction;
		try {
			mForAction = cInfo.getMethod(action);
			Object result = mForAction.invoke(c); // c.add()
			out.println(result);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
