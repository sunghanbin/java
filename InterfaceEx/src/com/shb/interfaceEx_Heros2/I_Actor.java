package com.shb.interfaceEx_Heros2;

public class I_Actor implements Cook,Police,FireFighter {

	@Override
	public void Fireoff() {
		// TODO Auto-generated method stub
		System.out.println("불끄기");
		
	}

	@Override
	public void Humanrescue() {
		// TODO Auto-generated method stub
		System.out.println("사람구출");
		
	}

	@Override
	public void findingcriminal() {
		// TODO Auto-generated method stub
		System.out.println("범인찾기");
	}

	@Override
	public void findingitem() {
		// TODO Auto-generated method stub
		System.out.println("물건찾기");
	}

	@Override
	public void makepizza() {
		// TODO Auto-generated method stub
		System.out.println("피자만들기");
	}

	@Override
	public void makespagetti() {
		// TODO Auto-generated method stub
		System.out.println("파스타만들기");
	}
	
	

}
