package com.shb.OverrideEx.su_per;

public class ChildClass extends parrentClass {
//	����Ʈ ������
	public ChildClass() {
		// TODO Auto-generated constructor stub
		System.out.println("ChildClass");
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
//		�������̵� �� �ϰ� ���� ���� Ŭ������ �޼ҵ带 ����ϰ� �������� superŰ���带 ����ϸ�  ������ ���� �� ������ �����
//		�������̵� �� ������ ���� �Ѵ�
		super.method1();
		System.out.println("ChildClass�� method1 ����");
	}

}
