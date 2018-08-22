package com.shb.interfaceEx;

public class MainClass {
	
	public static void main(String[]args) {
//		데이터 타입을 자기자신 으로
//		클래스에는 두가지 추상메서드가 재정의 되어 둘다 사용가능하지만
		InterfaceClass interfaceClass = new InterfaceClass();
		interfaceClass.calculate();
		interfaceClass.getStr();
		
//		데이터 타입을 인터페이스로
//		아래같은경우 인터페이스 객체 타입으로 생성했기 때문에 각각 인터페이스에 있는 메서드만 사용가능하다.
//		메서드의 접근을 제한 할수있다.
		Interface1 inter1 = new InterfaceClass();
		Interface2 inter2 = new InterfaceClass();
		
		inter1.calculate();
		inter2.getStr();
//		사용할수 X
//		inter1.getStr();
//		inter2.calculate();
		
	}

}
