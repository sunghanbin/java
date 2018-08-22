package com.shb.singleton;

public class SingletonClass {
//	�ܺο��� ����Ҽ� ����
//			�޸𸮿� �����ϴ� ��ü�� �������� �ʾƵ� �ٷλ�밡���ϰ� ��üŸ���� �ƴ� Ŭ���� Ÿ��
//	               	Ÿ���� �ڽ��� Ŭ������ �̱���Ŭ������ ���
//	�ڽ��� Ŭ���� Ÿ������ �ܺο��� ����Ҽ� ���� ��ü�� �������� �ʾƵ� ����Ҽ� �ִ� ������ �ڱ��ڽ��� �����Ѵ�.
//	�� �� ������ ����Ű�� �ִ� ���� �̱��� Ŭ���� �κ��� ���� ��ü�� ����Ų��
	private static SingletonClass SINGLETON_CLASS_INSTANCE = new SingletonClass();
	public int i = 10;
//	����Ʈ������
//	����Ʈ �����ڰ� private �̱� ������ ��ü�� �ܺο����� ������ �Ҽ� ����.
	private SingletonClass() {
		
	}
	
//	�޼��带 �ܺο��� ��ü�� �������� �ʾƵ� ����Ҽ��ְ�  �ڱ��ڽ� Ŭ���� Ÿ������ �����Ͽ� �����.
//	               	�̱���Ŭ����Ÿ������ ��ȯ
	public static SingletonClass getSingletonClass() {
//		���� �̱��� Ŭ���� �ν��Ͻ��� �� �̶�� 
//		�̱��� Ŭ���� �ν��Ͻ��� �̱���Ŭ������ �����Ѵ� 
		if(SINGLETON_CLASS_INSTANCE ==null) {
//			���⼭ ��ü�� ����,�Ҵ��Ѵ�.
			SINGLETON_CLASS_INSTANCE = new SingletonClass();
		}
		return SINGLETON_CLASS_INSTANCE;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
//		���ڽ��� I�� ���� i�� �Ҵ�
		this.i = i;
	}
	

}
