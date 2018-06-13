package ru.vasichkin;

import java.util.Collections;
import java.util.Comparator;

public abstract class DocLamp implements Lamp,Comparable<DocLamp> {
	private String nameLamp;
	private int Power;
	private int Lumen;
	
	@Override
	public void LightRoom() {	
		System.out.printf("Освещение лампой типа : %s, мощьностью %d люмен.\n",this.getClass(),this.getLumen());
	}
	
	@Override
	public int compareTo(DocLamp o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String getNameLamp() {
		return nameLamp;
	}
	public int getPower() {
		return Power;
	}
	public int getLumen() {
		return Lumen;
	}
	public void setNameLamp(String nameLamp) {
		this.nameLamp = nameLamp;
	}
	public void setPower(int power) {
		Power = power;
	}
	public void setLumen(int lumen) {
		Lumen = lumen;
	}
}
