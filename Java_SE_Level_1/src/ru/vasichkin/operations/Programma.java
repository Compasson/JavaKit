package ru.vasichkin.operations;

public class Programma {

	public static void main(String[] args) {
		
		
		//�������� ����. ?: -�������� if
		int n=0;
		/*
		 * String s;
		 * if(n==0)
		 * 		s="����";
		 * else
		 * 		s="�� ����";
		 */
		String s = (n==0)?"����":"�� ����";
		
		//Switch (� 7 ������ �������� �� ��������)
		int x=2;
		final int y =1;
		switch(x) {
			case -1:  // � -1 � 1 ��������� � ������� "����"
			case 1:
				System.out.println("����");
				break;
			case y+1: // y - final (�������� ��������� �� ����� ����������)
				System.out.println("���");
				break;
			case 3:
				System.out.println("���");
				break;
			default:
				System.out.println("�� ���������");			
		}
		
		//1) ������� ���������� ����� �� �����
		
		
			
	}

}
