package ru.vasichkin;

import java.util.ArrayList;
import java.util.List;

public class ReadOnly<LampType extends Comparable<? super LampType>> {
	
	
	private LampType data;
	
	/*private static List<ReadOnly> listReadOnly = new ArrayList<>();
	
	public static void createReadOnly(LampType data) {
		ReadOnly<LampType> ro = new ReadOnly<>(data);
		listReadOnly.add(ro);
	}
	
	public static List<ReadOnly> getListLamp() {
		return listReadOnly;
	}*/

	public ReadOnly(LampType data){
		this.data=data;
	}
	
	public LampType getData() {
		return data;
	}
	
	
	
	
	
}
