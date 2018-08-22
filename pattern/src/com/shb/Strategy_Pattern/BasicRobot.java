package com.shb.Strategy_Pattern;

import com.shb.Strategy_Pattern_Ex.IFly;
import com.shb.Strategy_Pattern_Ex.IKnife;
import com.shb.Strategy_Pattern_Ex.IMisil;

public abstract class BasicRobot {
//	interface 타입으로 변수를 선언해 준다.
//	interface 로 선언한 변수는 인터페이스를 인플리먼트 하고 있는 클래스 까지 포함하여 사용할수 있기 때문이다
	IFly fly;
	IMisil misil;
	IKnife knife;
	
	public abstract void Shape();
	
	public void ActionRun() {
		System.out.println("달리기");
		
	}
	
	public void ActionWalk() {
		System.out.println("걷기");
	}

	
//	seter를 통해서 각각 제품에서 부품을 가져다 쓸 때 원하는 부품을 사용할수 있도록 만들기위해 사용
	
//	                   인터페이스인 IFly 타입만 파라미터가 받는다
	public void setFly(IFly fly) {
//		자기자신 변수 fly에 파라미터로 들어온 fly를 할당한다.
		this.fly = fly;
	}

	public void setMisil(IMisil misil) {
		this.misil = misil;
	}

	public void setKnife(IKnife knife) {
		this.knife = knife;
	}
	
	public void ActionFly() {
//		set을 이용해 원하는 부품을 할당해 준후 실행 해줄 메서드,실행부
		
//		자기자신의.변수 fly는 set을 이용해 바꿔주기 때문에 각각 부품의 메서드가 실행 된다.원하는 부품의 메서드
		this.fly.Fly();
	}
	
	public void ActionMisil() {
		this.misil.Misil();
	}
	public void ActionKnife() {
		this.knife.Knife();
	}

}
