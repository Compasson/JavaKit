package ru.vasichkin.convertdate;

public class ConvertDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2000;
		int dayNum=309;
		int dayOrig=dayNum;
		int[] daysInMonth = new int[12];
		for(int i=0;i<12;i++)
		{
			if(i==0 || i==2 || i==4 || i==6 || i==7 || i==9 || i==11) 
				daysInMonth[i]=31;
			else
			{
				if(i==1)
					daysInMonth[i]=28;
				else
					daysInMonth[i]=30;
					
			}
		}
		String[] month = {
				"January",
				"February",
				"March",
				"April",
				"May",
				"June",
				"July",
				"August",
				"September",
				"October",
				"November",
				"Desember"
		};
		int monthNum=0;
		boolean isLeapYear;
		
		if((year%4==0)&&(year%100!=0||year%400==0)) 
			isLeapYear=true;
		else 
			isLeapYear=false;
		
		//In year and dayNum
		//Out month and day
		if(isLeapYear==true) daysInMonth[1]++;
		for(int days: daysInMonth)
		{
			if(dayNum>days)
			{
				dayNum-=days;
				monthNum++;
			}
			else break;
		}
		System.out.printf("Year = %d  dayOrig = %d  %s  %d",year,dayOrig,month[monthNum],dayNum);
		
	}

}
