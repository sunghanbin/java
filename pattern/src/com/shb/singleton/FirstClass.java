package com.shb.singleton;

public class FirstClass {
//	디폴트 생성자
	public FirstClass(){
//		싱글턴 클래스 에서는 생성자가 프라이빗 이기 때문에 객체를 외부에서 생성 하지 못하게 막아 놓았다.
//		이럴때 싱글턴 클래스를 사용할수 있는 방법은 객체가 생성 되기전인 static 으로 클래스 메모리 영역에 있을 때
//		할당 해주면 사용이 가능하다 
//		이렇게 사용하는 이유는 여러곳에서 객체를 마구 생성하지 못하도록 막아두는 것이다.
		SingletonClass singletonclass = SingletonClass.getSingletonClass();
		System.out.println("FirstClass");
		System.out.println("i="+ singletonclass.getI());
		singletonclass.setI(100);
		System.out.println("i="+ singletonclass.getI());
		
		
	}

}
