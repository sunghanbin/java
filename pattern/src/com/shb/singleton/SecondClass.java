package com.shb.singleton;

public class SecondClass {
	
	public SecondClass() {
		// TODO Auto-generated constructor stub
//		�̱��� Ŭ�������� ��ü�� �����Ҽ� �ִ� ������ ������� public static SingletonClass getSingletonClass
//		�� ����ߴ�. getSingletonClass ��  static �̶�� ���� ��ü �̱� ������ ��ü�� ������ ���� FirstŬ������
//		singletonclass �� �ּҰ��� ����Ű�� �������̴�. �׷���
//		�Ʒ� �� ���� getI �� ����Ʈ �غ��ٸ� 100�̳��ð��̴�
		SingletonClass singletonclass = SingletonClass.getSingletonClass();

		System.out.println("secondClass");
		System.out.println("i="+ singletonclass.getI());
	}

}
