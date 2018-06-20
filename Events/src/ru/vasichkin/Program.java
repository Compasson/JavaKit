package ru.vasichkin;

/*
 * 		������ �������������� ��������
 */

// ��� ���� ����� ������� ����� ������ ������� �������� - �����! ����� ��������� ����� �����.
// ������� ���� ����� ����� ������� ���������
/*class Abc implements ElectricityListener {
	@Override
	public void electricity() {
		System.out.println("�����");
	}
}*/

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switcher sw = new Switcher();
		
		Lamp lamp = new Lamp();
		TvSet tv = new TvSet();
		AirCondition ac = new AirCondition(); // �������� AirCondition �� ��������� ��������� Electricitylistener
		
		sw.addElecricityListener(lamp);
		sw.addElecricityListener(tv);
		/*sw.addElecricityListener(new ElectricityListener() {
			@Override
			public void electricity(Object sender) {				
				System.out.println("�����");
			}
		});*/
		
		final String message = "�����"; // ��������� - ��� ���������� ��������� � ���������, �.�. ������������ ��������� ������� � ������� ������. 
		// ��� ���������� ����� ����� ��������������, ��� ��� ��� ��������� � ��������� , �� ������ ������!
		//��� ����������� ���������� ������ ����� ��������� � ������� ��������������� ����������(��� ��������� ������� ���� ����������� ����� � ���)
		sw.addElecricityListener(
			 s -> System.out.println(message) // s ��� �������� , ��� ��� �� ���� ������ ����� ��������, ��� ��������� �� �����������.
		); // ������ ������������ ������ � ������ Person
		
		//sw.addElecricityListener(s->ac.on(s)); ����� ��������� � ������ ���������� ��������
		sw.addElecricityListener(ac::on); // ����� on ��� ��������, ��� ��� �� ���������� �� � ������ ������, � ����� � ���� ������ switchON
		
		sw.switchOn();
		sw.removeElecricityListener(tv);
		sw.switchOn();
	}

}


