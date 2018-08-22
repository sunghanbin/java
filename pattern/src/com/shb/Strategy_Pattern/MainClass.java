package com.shb.Strategy_Pattern;

import com.shb.Strategy_Pattern_Ex.MisilYes;

public class MainClass {
	
	public static void main(String[]args) {
		
		BasicRobot lowRobot = new LowRobot();
		lowRobot.Shape();
		lowRobot.ActionWalk();
		lowRobot.ActionRun();
		lowRobot.ActionFly();
//		seter 에서  객체를 생성하여 파라미터에 넣어줌
		lowRobot.setMisil(new MisilYes());
		lowRobot.ActionKnife();
		lowRobot.ActionMisil();
		
	}

}
