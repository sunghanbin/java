package com.shb.interfaceEx_Toy;

public class mazinger implements MisileLaunch,MovearmsAndLegs {

	
	public mazinger() {
		// TODO Auto-generated constructor stub
		System.out.println("마징가");
		MovearmsAndLegs();
		MisileLaunch();
		System.out.println("================");
	}
	@Override
	public void MovearmsAndLegs() {
		// TODO Auto-generated method stub
		System.out.println("팔다리움직임가능");
		
	}

	@Override
	public void MisileLaunch() {
		// TODO Auto-generated method stub
		System.out.println("미사일발사 기능");
		
	}

}
