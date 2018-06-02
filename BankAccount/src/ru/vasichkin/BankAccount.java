package ru.vasichkin;

public class BankAccount {

	private String owner;
	private double balance;

	public static boolean transfer(BankAccount source, BankAccount dest,double summa) {
		
		if(source.withdraw(summa) && summa>0) {
			dest.deposite(summa);
			return true;
		}
		else {
			System.out.println("Перевод не выполнен");
			return false;
		}
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public BankAccount(String owner) {
		this.owner=owner;
	}
	
	public void deposite(double summa) {
		if(summa>=0)
			setBalance(getBalance()+summa);
		else
			throw new RuntimeException("summa<0");
	}
	
	public boolean withdraw(double summa) {
		boolean bool;
		if(getBalance()<=summa && summa>0) {
			System.out.println("Недостаточно средств для снятия");
			bool=false;
		}
		else
			setBalance(getBalance()-summa);
			bool=true;
		return bool;
	}
	
	@Override
	public String toString() {
		return String.format("Owner: %s   balance = %f\n", getOwner(),getBalance());
	}
}
