package com.shb.singleton;

public class FirstClass {
//	����Ʈ ������
	public FirstClass(){
//		�̱��� Ŭ���� ������ �����ڰ� �����̺� �̱� ������ ��ü�� �ܺο��� ���� ���� ���ϰ� ���� ���Ҵ�.
//		�̷��� �̱��� Ŭ������ ����Ҽ� �ִ� ����� ��ü�� ���� �Ǳ����� static ���� Ŭ���� �޸� ������ ���� ��
//		�Ҵ� ���ָ� ����� �����ϴ� 
//		�̷��� ����ϴ� ������ ���������� ��ü�� ���� �������� ���ϵ��� ���Ƶδ� ���̴�.
		SingletonClass singletonclass = SingletonClass.getSingletonClass();
		System.out.println("FirstClass");
		System.out.println("i="+ singletonclass.getI());
		singletonclass.setI(100);
		System.out.println("i="+ singletonclass.getI());
		
		
	}

}
