package com.shb.StringTOkenizer;

import java.util.StringTokenizer;

public class tokenizer_ex {
	
	public static void main(String[]args) {
//		StringTokenizer 문자열 을 나누어 주는 클래스
		
		String str1 = "오늘 날씨는 춥고, 눈이 많이 오고 있습니다.";
		String str2 = "2018/08/09";
		
		System.out.println(str1);
		System.out.println(str2);
		
//		스트링토크나이저 클래스로 객체를 생성할때  파라미터에 문자열만 넣어 주면 디폴트인 띄어쓰기 를 기준으로 나눠준다.
		StringTokenizer tokenizer1 = new StringTokenizer(str1);
//		파라미터에 문자열 과 나눌 기준을 넣어주면 그기준을 통해 나누어준다
		StringTokenizer tokenizer2 = new StringTokenizer(str2,"/");
//		countTokens()는 나누어준 토큰이 몇개인지 몇개로 문자열이 나뉘었는 정수로 알려준다
		System.out.println("tokenizer1 문자열 수:" + tokenizer1.countTokens());
		System.out.println("tokenizer2 문자열 수:" + tokenizer2.countTokens());
//		반복문인 while문 통해서 하나 하나 프린트를 찍어볼것이다.
//		hasMoreTokens() 다음토큰이 있으면 true를 반환해준다. 이경우 tokenizer1은 7개의 토큰이 있다  
		while(tokenizer1.hasMoreTokens()) {
//			토큰이 있다면 다음토큰을 찍어라
			System.out.println(tokenizer1.nextToken());
		}
		
		while(tokenizer2.hasMoreTokens()) {
//			와일문을 통과한 토큰을  출력한다.
			System.out.println(tokenizer2.nextToken());
		}
		
	}

}
