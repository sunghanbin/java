package com.shb.interfaceEx_Toy;

public class Poo implements MovearmsAndLegs {

//	����Ʈ ������
	public Poo() {
		// TODO Auto-generated constructor stub
//		�����ϱ⸸ �ϸ� �Ʒ� ������ �����Ѵ�.
		System.out.println("������ Ǫ");
//		this.MovearmsAndLegs(); this�� �����ϰ� �Ʒ�ó�� ��밡
		MovearmsAndLegs();
		System.out.println("=================");
	}
	@Override
	public void MovearmsAndLegs() {
		// TODO Auto-generated method stub
		System.out.println("�ȴٸ������Ӱ���");
		
	}

}
