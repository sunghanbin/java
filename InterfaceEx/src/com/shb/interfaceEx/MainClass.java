package com.shb.interfaceEx;

public class MainClass {
	
	public static void main(String[]args) {
//		������ Ÿ���� �ڱ��ڽ� ����
//		Ŭ�������� �ΰ��� �߻�޼��尡 ������ �Ǿ� �Ѵ� ��밡��������
		InterfaceClass interfaceClass = new InterfaceClass();
		interfaceClass.calculate();
		interfaceClass.getStr();
		
//		������ Ÿ���� �������̽���
//		�Ʒ�������� �������̽� ��ü Ÿ������ �����߱� ������ ���� �������̽��� �ִ� �޼��常 ��밡���ϴ�.
//		�޼����� ������ ���� �Ҽ��ִ�.
		Interface1 inter1 = new InterfaceClass();
		Interface2 inter2 = new InterfaceClass();
		
		inter1.calculate();
		inter2.getStr();
//		����Ҽ� X
//		inter1.getStr();
//		inter2.calculate();
		
	}

}
