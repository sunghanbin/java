package com.shb.Timer_ex;

import java.util.Timer;
import java.util.TimerTask;

public class TimerEx {
//	 ����Ʈ ������             ����ó��
	public TimerEx() throws InterruptedException {
		// TODO Auto-generated constructor stub
		
		System.out.println("^^");
//		Ÿ�̸� �޼ҵ带 ����ϱ� ���� ��ü ����
		Timer timer = new Timer();
//		�������� Ÿ�̸��׽�ũ�� �����쿡 �ø��� ���� ��ü ����
		TimerTask job1 = new ExTimerTask1();
		TimerTask job2 = new ExTimerTask2();
		
//		���� �ð��� �Ǹ� �۾��� ���� �ǰ� �ϴ� schedule�޼ҵ�
		timer.schedule(job1,2000);// �����ٿ����� �и������ �Ű������� �ޱ� ������ 2000/1000 = 2��
		timer.schedule(job2, 10000);// 10000/1000 = 10��

		Thread.sleep(11000);
		System.out.println("**");
		
		
	}

}
