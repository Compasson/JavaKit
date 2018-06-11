package ru.vasichkin;

public class TvSet implements ElectricityListener {

	@Override
	public void electricity(Object sender) {
		
		System.out.println("Телевизор включен");
	}

}
