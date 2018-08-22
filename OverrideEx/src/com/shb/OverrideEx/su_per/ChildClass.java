package com.shb.OverrideEx.su_per;

public class ChildClass extends parrentClass {
//	디폴트 생성자
	public ChildClass() {
		// TODO Auto-generated constructor stub
		System.out.println("ChildClass");
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
//		오버라이드 를 하고 나서 상위 클래스의 메소드를 사용하고 싶을때는 super키워드를 사용하면  상위에 정의 된 로직을 실행뒤
//		오버라이드 한 로직을 실행 한다
		super.method1();
		System.out.println("ChildClass의 method1 실행");
	}

}
