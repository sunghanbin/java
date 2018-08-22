package com.shb.interfaceEx;
//                       클래스에서 인터페이스를 사용하고 자할때 implements
//                  implements는 extends(상속) 과 다르게 여러가지를 사용할수있다.
public class InterfaceClass implements Interface1,Interface2 {
// 두 인터페이스에서 정의한 추상클래스 들이다.
//	추상클래스는 무조건 재정의 후 사용가능하다
	@Override
	public String getStr() {
		System.out.println("실제 구현은 여기서");
//		반환값이 스트링 으로 정해져 있기 때문에  void와 달리 무조건 어떠한 스트링 값을 반환해줘야한다
//		그래서 널값을 반환해 준것이다.
		return null;
	}

	@Override
	public void calculate() {
		System.out.println("실제 구현은 여기서");
		
		
	}
	
	
	
	

}
