package com.shb.interfaceEx_Toy;

public class airPlaToy implements MisileLaunch,LiteLaunch {
	
	public airPlaToy() {
		// TODO Auto-generated constructor stub
		System.out.println("������峭��");
		LiteLaunch();
		MisileLaunch();
		System.out.println("=========================");
	}

	@Override
	public void LiteLaunch() {
		// TODO Auto-generated method stub
		System.out.println("�Һ��߻� ���");
		
	}

	@Override
	public void MisileLaunch() {
		// TODO Auto-generated method stub
		System.out.println("�̻��Ϲ߻� ���");
		
	}

}
