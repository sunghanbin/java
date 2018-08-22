package com.shb.CalendarAPI;

import java.util.Calendar;

public class Calendar_Ex {
	
	public static void main(String[] args) {
//		캘린더 함수는 아마 싱글턴 패턴 인듯하다.
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);//현재 년도
		int month = calendar.get(Calendar.MONTH);//현재 달
		int day = calendar.get(Calendar.DAY_OF_MONTH);//현재 일
		int hour = calendar.get(Calendar.HOUR_OF_DAY);//현재 
		int minute = calendar.get(Calendar.MINUTE);//현재 분
		int second = calendar.get(Calendar.SECOND);// 현재 초
		
		System.out.println(year + "년" + month + "월" + day + "일");
		System.out.println(hour + "시" + minute + "분" + second + "분");
		
	}

}
