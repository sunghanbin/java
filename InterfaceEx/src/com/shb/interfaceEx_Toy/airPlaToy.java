package com.shb.interfaceEx_Toy;

public class airPlaToy implements MisileLaunch,LiteLaunch {
	
	public airPlaToy() {
		// TODO Auto-generated constructor stub
		System.out.println("비행기장난감");
		LiteLaunch();
		MisileLaunch();
		System.out.println("=========================");
	}

	@Override
	public void LiteLaunch() {
		// TODO Auto-generated method stub
		System.out.println("불빛발사 기능");
		
	}

	@Override
	public void MisileLaunch() {
		// TODO Auto-generated method stub
		System.out.println("미사일발사 기능");
		
	}

}
