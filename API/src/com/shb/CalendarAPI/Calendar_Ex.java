package com.shb.CalendarAPI;

import java.util.Calendar;

public class Calendar_Ex {
	
	public static void main(String[] args) {
//		Ķ���� �Լ��� �Ƹ� �̱��� ���� �ε��ϴ�.
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);//���� �⵵
		int month = calendar.get(Calendar.MONTH);//���� ��
		int day = calendar.get(Calendar.DAY_OF_MONTH);//���� ��
		int hour = calendar.get(Calendar.HOUR_OF_DAY);//���� 
		int minute = calendar.get(Calendar.MINUTE);//���� ��
		int second = calendar.get(Calendar.SECOND);// ���� ��
		
		System.out.println(year + "��" + month + "��" + day + "��");
		System.out.println(hour + "��" + minute + "��" + second + "��");
		
	}

}
