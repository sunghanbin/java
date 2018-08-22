package com.shb.Timer_ex;

import java.util.Timer;
import java.util.TimerTask;

public class TimerEx {
//	 디폴트 생성자             예외처리
	public TimerEx() throws InterruptedException {
		// TODO Auto-generated constructor stub
		
		System.out.println("^^");
//		타이머 메소드를 사용하기 위해 객체 생성
		Timer timer = new Timer();
//		내가만든 타이머테스크를 스케쥴에 올리기 위해 객체 생성
		TimerTask job1 = new ExTimerTask1();
		TimerTask job2 = new ExTimerTask2();
		
//		일정 시간이 되면 작업이 실행 되게 하는 schedule메소드
		timer.schedule(job1,2000);// 스케줄에서는 밀리언세컨즈를 매개변수로 받기 때문에 2000/1000 = 2초
		timer.schedule(job2, 10000);// 10000/1000 = 10초

		Thread.sleep(11000);
		System.out.println("**");
		
		
	}

}
