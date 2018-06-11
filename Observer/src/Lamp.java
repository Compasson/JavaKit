
public class Lamp implements ElectricityListener 
{

	private int electricityOn;
	
	@Override
	public void electricityOn() {
		System.out.println("Лампа включилась");
	}

}
