package ru.vasichkin;

public class Lamp implements ElectricityListener {
	@Override
	public void electricity(Object sender) {
		System.out.println("Лампа зажглась");
	}
}
