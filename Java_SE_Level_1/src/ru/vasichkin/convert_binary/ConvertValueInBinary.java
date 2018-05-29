package ru.vasichkin.convert_binary;

public class ConvertValueInBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val=134;
		System.out.println(getBinary(val));

	}

	public static String getBinary(int num)
	{
		StringBuilder str = new StringBuilder();
		
		for(int i=1;i<=32;i++)
		{
			int x=num&1;
			if(x==1)
				str.append(1);
			else
				str.append(0);
			num>>=1;
			if(i==7 || i==15 || i==23)
			{
				str.append(" ");
			}
		}
		//развернуть строку
		str=str.reverse();
		
		return str.toString();
	}
}
