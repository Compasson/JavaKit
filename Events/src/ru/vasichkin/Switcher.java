package ru.vasichkin;

import java.util.ArrayList;

public class Switcher {
	
	private ArrayList<ElectricityListener> listeners = new ArrayList<>();
	
	public void addElecricityListener(ElectricityListener l) {
		listeners.add(l);
	}
	public void removeElecricityListener(ElectricityListener l) {
		listeners.remove(l);
	}
	
	public void switchOn() {
		System.out.println("����������� �������");
		for(ElectricityListener l : listeners)
			l.electricity(this);// �������� this ��� ��� �� �������� ���������� �������
	}
}
