package com.shb.Strategy_Pattern;

import com.shb.Strategy_Pattern_Ex.MisilYes;

public class MainClass {
	
	public static void main(String[]args) {
		
		BasicRobot lowRobot = new LowRobot();
		lowRobot.Shape();
		lowRobot.ActionWalk();
		lowRobot.ActionRun();
		lowRobot.ActionFly();
//		seter ����  ��ü�� �����Ͽ� �Ķ���Ϳ� �־���
		lowRobot.setMisil(new MisilYes());
		lowRobot.ActionKnife();
		lowRobot.ActionMisil();
		
	}

}
