package com.shb.StringApi;

public class String_ex {
	
	public static void main(String[]args) {
		
//		String 은 앞글자가 대문자이기 때문에 객체 자료형이다 
		String string = "helloWorld~~";
//		string 은 기초자료형 이 아님에도 불구하고 new연산자를 사용하지 않고 기초데이터를 만들 때 처럼 초기화 하고 있다.
		int i = 1;
//		String 객체데이터가 자주사용하는 클래스 이므로 편의성을 위해 이렇게 만들어 둔것 같다
//		그렇기 때문에 위와 같이 기초자료형 처럼 초기화 할수도 있고 기존에 객체자료형 처럼 new연산자를 통해 만들수도있다.
		String newstring = new String("helloworld~~");
				
	}

}
