package com.shb.interfaceEx_Toy;

public class Poo implements MovearmsAndLegs {

//	디폴트 생성자
	public Poo() {
		// TODO Auto-generated constructor stub
//		생성하기만 하면 아래 로직을 구현한다.
		System.out.println("곰돌이 푸");
//		this.MovearmsAndLegs(); this를 생략하고 아래처럼 사용가
		MovearmsAndLegs();
		System.out.println("=================");
	}
	@Override
	public void MovearmsAndLegs() {
		// TODO Auto-generated method stub
		System.out.println("팔다리움직임가능");
		
	}

}
