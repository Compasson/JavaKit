
/*
 * 	�������������� ����� ����� ������� ���� ���� ������ ����
 * ����������� ��� � ������� Generic
 * 
 * 		MyType - ��� �������������(��������) �� ����� �������� ����� ������������� �������� ���
 * 
 * 		����� isGreate() ���������� ���������� Object  � ���� � ������������ ��������. ����� ������� �����������(�������� ������ ����������� ��������� Comparable)
 * 
 * 		Comparable - ������ ���� ����������� ����� <MyType> .����� ���������� ����� ���, � �� ������ ������ ����������� ��������� Comparable (��� ����� ������� �����������, ��� �����������)
 * 
 * 		<? super MyType> ������� ������� �����������.  ��� �������� MyType �������� MyType
 */

public class ReadonlyStorage<MyType extends Comparable<? super MyType>> // <? super MyType,T1,T2,T3>
	
{
	private MyType data;
	
	public boolean isGreater(MyType c)
	{
		return data.compareTo(c) > 0;
	}
	
	public ReadonlyStorage(MyType data) {
		this.data = data;
	}

	public MyType getData() {
		return data;
	}

}
