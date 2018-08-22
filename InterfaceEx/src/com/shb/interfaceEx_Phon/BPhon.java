package com.shb.interfaceEx_Phon;

public class BPhon implements iFunction {

	@Override
	public void callSendReceive() {
		// TODO Auto-generated method stub
		System.out.println("전화 가능");
	}

	@Override
	public void canLTE() {
		// TODO Auto-generated method stub
		System.out.println("4G");
	}

	@Override
	public void tvRemoteController() {
		// TODO Auto-generated method stub
		System.out.println("리모컨 불가능");
	}

}
