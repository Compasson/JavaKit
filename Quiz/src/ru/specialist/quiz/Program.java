package ru.specialist.quiz;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

public class Program {
	
	public static final int MAX_ATTEMPTS = 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int x = r.nextInt(100)+1;
		out.println(x);
		
		int y;
		int counter = 0;
		do {
			out.print("������ ����� (1-100): ");
			y = sc.nextInt();
			counter++;
			
			if (y == 0) break;
			if (y > x) out.println("�����");
			if (y < x) out.println("����");
		}
		while (y != x && counter < MAX_ATTEMPTS);
		
		if (y == x)
			out.printf("�� ��������. ����� �������: %d\n", counter);
		else
			out.println("�� ���������");
		
		
		sc.close();

	}

}
