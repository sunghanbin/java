package com.shb.singleton;

public class SecondClass {
	
	public SecondClass() {
		// TODO Auto-generated constructor stub
//		싱글턴 클래스에서 객체를 생성할수 있는 유일한 방법으로 public static SingletonClass getSingletonClass
//		을 사용했다. getSingletonClass 는  static 이라는 공유 객체 이기 때문에 객체를 생성해 놓은 First클래스의
//		singletonclass 의 주소값을 가르키고 있을것이다. 그래서
//		아래 와 같이 getI 를 프린트 해본다면 100이나올것이다
		SingletonClass singletonclass = SingletonClass.getSingletonClass();

		System.out.println("secondClass");
		System.out.println("i="+ singletonclass.getI());
	}

}
