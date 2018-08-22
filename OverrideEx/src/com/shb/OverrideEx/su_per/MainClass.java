package com.shb.OverrideEx.su_per;

public class MainClass {
	
	public static void main(String[]args) {
//		상속받은 하위 클래스를 호출하게 되면 하위 클래스만 생성 되는것이 아니라 
//		상속해준 상위클래스가 먼저 호출,생성되고 그다음에 하위클래스가 생성된다
//		상속을 해줄 클래스가 먼저 생성되어야 하위에있는 클래스가  상속받은 로직을 사용할수 있게 되므로 당연한이야기
		parrentClass child = new ChildClass();
		child.method1();
	}

}
