package power_2_teat;

public class Power2Tast {

	public static void main(String[] args) {
		// �������� �� ����� �������� ������?
		
		// 0000..1...000 - ��� ����� ������� ������ . � ��� ������ 1 ��� true.
		// 0000..0111111 - ���� ������� �������, �� ��� ����������� ���� ���������� � 1;
		// 0000000000000 - & ������������ ���� ���� ����� ����� 0;
		for(int x=0;x<1024;x++) {
			//if((x&(x-1))==0)
			//if((x&-x)==x)
			System.out.println(x);
		}	
	}

}
