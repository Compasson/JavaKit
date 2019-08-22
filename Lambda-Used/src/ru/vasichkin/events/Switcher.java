package ru.vasichkin.events;

import java.util.ArrayList;
import java.util.List;

public class Switcher {

	public List<ElectricityConsumer> listeners = new ArrayList<>();
	
	public void addElectrisityListener(ElectricityConsumer listener) {
		listeners.add(listener);
	}
	
	public void removeElectricityListener(ElectricityConsumer listener) {
		listeners.remove(listener);
	}
	
	
	
	public void switchOn() {
		System.out.println("Switcher ON!");
		//if(listeners != null)
			//listeners.electrisityOn();
		for(ElectricityConsumer listener : listeners) {
			listener.electrisityOn(this);
			System.out.printf("          Хеш-код (int-овое значение): %2$15d.     Хеш-код в 16-ричной кодировке: %1$40s \n\n",listener.toString(), listener.hashCode());
		}
	}
}
