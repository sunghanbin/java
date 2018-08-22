package com.shb.singleton;

public class SingletonClass {
//	외부에서 사용할수 없는
//			메모리에 상주하는 객체를 생성하지 않아도 바로사용가능하고 객체타입이 아닌 클래스 타입
//	               	타입은 자신의 클래스인 싱글턴클래스를 사용
//	자신의 클래스 타입으로 외부에서 사용할수 없고 객체를 생성하지 않아도 사용할수 있는 변수에 자기자신을 생성한다.
//	즉 이 변수가 가리키고 있는 곳은 싱글턴 클래스 로부터 나온 객체를 가리킨다
	private static SingletonClass SINGLETON_CLASS_INSTANCE = new SingletonClass();
	public int i = 10;
//	디폴트생성자
//	디폴트 생성자가 private 이기 때문에 객체를 외부에서는 생성을 할수 없다.
	private SingletonClass() {
		
	}
	
//	메서드를 외부에서 객체를 생성하지 않아도 사용할수있고  자기자신 클래스 타입으로 선언하여 만든다.
//	               	싱글턴클래스타입으로 반환
	public static SingletonClass getSingletonClass() {
//		만약 싱글턴 클래스 인스턴스가 널 이라면 
//		싱글턴 클래스 인스턴스에 싱글턴클래스를 생성한다 
		if(SINGLETON_CLASS_INSTANCE ==null) {
//			여기서 객체를 생성,할당한다.
			SINGLETON_CLASS_INSTANCE = new SingletonClass();
		}
		return SINGLETON_CLASS_INSTANCE;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
//		나자신의 I의 값에 i를 할당
		this.i = i;
	}
	

}
