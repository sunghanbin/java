package com.shb.interfaceEx_Phon;

public class APhon implements iFunction {

	@Override
	public void callSendReceive() {
		// TODO Auto-generated method stub
		System.out.println("전화가능");
		
	}

	@Override
	public void canLTE() {
		// TODO Auto-generated method stub
		System.out.println("3G");
		
	}

	@Override
	public void tvRemoteController() {
		// TODO Auto-generated method stub
		System.out.println("리모컨 가능");
		
	}

}
