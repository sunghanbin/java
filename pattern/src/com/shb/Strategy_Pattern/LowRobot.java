package com.shb.Strategy_Pattern;

import com.shb.Strategy_Pattern_Ex.FlyNo;
import com.shb.Strategy_Pattern_Ex.IFly;
import com.shb.Strategy_Pattern_Ex.IKnife;
import com.shb.Strategy_Pattern_Ex.IMisil;
import com.shb.Strategy_Pattern_Ex.KnifeEmpty;
import com.shb.Strategy_Pattern_Ex.MisilNo;

public class LowRobot extends BasicRobot {

public LowRobot() {
	// TODO Auto-generated constructor stub
//	만약 메인메서드에서실행 할때 seter를 이용해 할당을 하지 않고 실행 했을때 의 상황을 대비하기위해 디폴트값으로 설정해줌
	fly = new FlyNo();
	misil = new MisilNo();
	knife = new KnifeEmpty();
	
}

@Override
public void Shape() {
	// TODO Auto-generated method stub
	System.out.println("저렴한로봇입니다.팔다리,머리,몸통있음");
}

}
