package com.shb.interfaceEx_Toy;

public class mazinger implements MisileLaunch,MovearmsAndLegs {

	
	public mazinger() {
		// TODO Auto-generated constructor stub
		System.out.println("��¡��");
		MovearmsAndLegs();
		MisileLaunch();
		System.out.println("================");
	}
	@Override
	public void MovearmsAndLegs() {
		// TODO Auto-generated method stub
		System.out.println("�ȴٸ������Ӱ���");
		
	}

	@Override
	public void MisileLaunch() {
		// TODO Auto-generated method stub
		System.out.println("�̻��Ϲ߻� ���");
		
	}

}
