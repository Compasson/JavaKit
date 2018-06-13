package ru.vasichkin;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GalogenLamp gl = new GalogenLamp();
		gl.setLumen(500);
		ReadOnly<GalogenLamp> rn1 = new ReadOnly<>(gl);
		

		CouldLightLamp cll = new CouldLightLamp();
		cll.setLumen(1000);
		ReadOnly<CouldLightLamp> rn2 = new ReadOnly<>(cll);
		
		
		rn1.getData().LightRoom();
		rn2.getData().LightRoom();
	}
}
