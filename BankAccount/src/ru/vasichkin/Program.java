package ru.vasichkin;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount pa = new BankAccount("Pasha");
		BankAccount eg = new BankAccount("Egor");
		
		System.out.println(pa.toString());
		System.out.println(eg.toString());
		
		pa.deposite(100f);
		eg.deposite(1000f);
		
		System.out.println(pa.toString());
		System.out.println(eg.toString());
		
		pa.deposite(250f);
		eg.withdraw(60f);
		
		System.out.println(pa.toString());
		System.out.println(eg.toString());
		
		BankAccount.transfer(eg, pa, 500f);
		
		System.out.println(pa.toString());
		System.out.println(eg.toString());
	}

}
