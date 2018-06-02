package ru.vasichkin.graphics;

/*
 * ��
 * 	������� ��������� move by
 * 		����� moveby
 * 		
 * � Shape static method tranferscen
 * 			����������	��� ������ � ����
 * 			��������� ��������� �� ������ ��������� moveby	
 *  		���� �� �� ������� ������� moveby
 */

public interface Scaleable {
	
	//��������� ��� ������ ��� ������ 
	
	//����� ���
	//��������� �����
	static final double pi=Math.PI;
	
	static final double DEFAULT_FACTOR=2;
	
	//������ ��������� public abstract
	void scale(double factor);
	
	// � Java 8 ��������� default ���������� � ������ ����������
	/**
	 * @since Java 1.8
	 */
	default void scale() {
		scale(DEFAULT_FACTOR);
	}
	
	/**
	 * @since Jva 1.9
	 */
	// private ������ �������� ������� ������� default ������
	/*private void scaleInner() {
		scale(DEFAULT_FACTOR);
		//...
		//...
	}*/
}

//���������� ����� ������������� ���� �� �����
interface Scaleable3D extends Scaleable{
	void scale3D(double fx, double fy, double fz);
}