package com.shb.CalendarAPI;

public class currentTimeMillis_Speed {
	
	public static void main(String[] args) {
//		속도 테스트 시 사용 함수
//		System.currentTimeMillis()는 현재 시간을 1/1,000초 단위로 표시합니다.거의 속도 테스트 용도로 쓰인다.
		System.out.println(System.currentTimeMillis());
		
		String str1 = "A";
		long startNum = System.currentTimeMillis();
		
		for ( int i = 0; i <5000; i++) {
			str1 = str1 + "a";
		}
		
		long endNum = System.currentTimeMillis();
		System.out.println("경과시간:" +(endNum - startNum));
	}

}
