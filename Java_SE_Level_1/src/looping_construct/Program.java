package looping_construct;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {
			if (i == 4)
				continue; // ��������� ��������, �� �� ����
			if (i == 8)
				break; // ��������� ����
			System.out.println(i);
		}

		// 1 2 3 4 ...10
		// 2 4 6 8....10

		// ����� ����� �� ����� �� �����! ����� �������� ��� ������ �� �������� ����
		// �����
		metka: for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (j == 5)
					break metka;
				System.out.printf("%4d", i * j); // ����� ������ ������ %4d ���������� �������� 4, ���� ������
													// ����������� �������
			}
			System.out.println();
		}

		// ���� � �������� do - while ���� ��� ����������� �����������, ���� ����
		// ������� �����
		int a = 2;
		while (a < 1000) {
			System.out.println(a);
			a *= 2;
		}

		int b = 2;
		while ((b *= 2) < 2000)
			System.out.println(b);

		// ������ ������� ��� ����� �������� ������ ������
		// 0 1 2 3 5 8 13 21
		int f1 = 0;
		int f2 = 1;
		int f = 0;
		do {
			System.out.printf("%d ", f);
			f1 = f2;
			f2 = f;
		} while ((f = f1 + f2) < 1000);
	}

}
