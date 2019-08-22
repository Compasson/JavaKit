package ru.vasichkin.events;

public class Lamp implements ElectricityConsumer {

	public void lampOn() {
		System.out.println("Lamp ON!");
	}

	@Override
	public void electrisityOn(Object sender) {
		lampOn();
		
	}
}
