package com.shb.Timer_ex;

import java.util.TimerTask;
// TimerTask 상속받기
public class ExTimerTask1 extends TimerTask {
// 추상메서드 를 오버라이드 한다.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ExTimerTask1 : 이곳의 작업이 실행 됩니다.");
	}

}
