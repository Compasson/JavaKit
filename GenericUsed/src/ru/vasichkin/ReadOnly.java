package ru.vasichkin;

public class ReadOnly<LampType extends Comparable<? super LampType>> {
	
	
	private LampType data;
	
	public ReadOnly(LampType data){
		this.data=data;
	}
	
	public LampType getData() {
		return data;
	}
	
	
	
	
	
}
