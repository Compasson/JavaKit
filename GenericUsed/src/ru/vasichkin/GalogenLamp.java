package ru.vasichkin; 

public class GalogenLamp implements Lamp {
	private String nameLamp;
	private int Power;
	private int Lumen;
	public String getNameLamp() {
		return nameLamp;
	}
	public int getPower() {
		return Power;
	}
	public int getLumen() {
		return Lumen;
	}
	@Override
	public void LightRoom() {
		
	}
}
