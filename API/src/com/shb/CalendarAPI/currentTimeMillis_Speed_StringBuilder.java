package com.shb.CalendarAPI;

public class currentTimeMillis_Speed_StringBuilder {
	
	public static void main(String[] args) {
//		속도 테스트 시 사용 함수
//		System.currentTimeMillis()는 현재 시간을 1/1,000초 단위로 표시합니다.거의 속도 테스트 용도로 쓰인다.
		System.out.println(System.currentTimeMillis());
		
		StringBuilder str1 = new StringBuilder("A");
		long startNum = System.currentTimeMillis();
		
		for ( int i = 0; i <5000; i++) {
			str1 = str1.append("A");
		}
		
		long endNum = System.currentTimeMillis();
		System.out.println("경과시간:" +(endNum - startNum));
	}

}
