package com.shb.Wrapper_;

public class Wrapper_ex {
	
//	Wrapper 기초데이터를 객체데이터로 변환 합니다.
	
//	기초데이터에 상응하는 객체 데이터 클래스
	
//	   기초데이터    |  객체데이터
/*    byte     |    Byte
 * 	  short    |   Short
 *    int      |   Integer
 *    long     |   Long
 *    double   |   Double
 *    float    |   Float
 *    boolean  |   Boolean
 *    char     |   Character
 *  
 */
	public static void main(String[] args) {
		Integer integer = new Integer(10);
		
		int i = integer.intValue();
		System.out.println(i);
		
//		형변환 
		String str = "123";
		int j = Integer.parseInt(str);
		System.out.println(j+1);
	}
}
