package ru.vasichkin;

public class Engine implements ListenerCar {
	
	private boolean state;
	
	@Override
	public void stateModule(Object sender) {
		System.out.printf("",state);
	}

	@Override
	public void moduleOn(Object sender) {
		
	}

	@Override
	public void moduleOff(Object sender) {
		
	}

}
