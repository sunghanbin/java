package com.shb.interfaceEx;
//                       Ŭ�������� �������̽��� ����ϰ� ���Ҷ� implements
//                  implements�� extends(���) �� �ٸ��� ���������� ����Ҽ��ִ�.
public class InterfaceClass implements Interface1,Interface2 {
// �� �������̽����� ������ �߻�Ŭ���� ���̴�.
//	�߻�Ŭ������ ������ ������ �� ��밡���ϴ�
	@Override
	public String getStr() {
		System.out.println("���� ������ ���⼭");
//		��ȯ���� ��Ʈ�� ���� ������ �ֱ� ������  void�� �޸� ������ ��� ��Ʈ�� ���� ��ȯ������Ѵ�
//		�׷��� �ΰ��� ��ȯ�� �ذ��̴�.
		return null;
	}

	@Override
	public void calculate() {
		System.out.println("���� ������ ���⼭");
		
		
	}
	
	
	
	

}
