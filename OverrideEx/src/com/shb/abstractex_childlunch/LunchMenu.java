package com.shb.abstractex_childlunch;
//  추상클래스로 선언
public abstract class LunchMenu {
//	데이터 선언
	public int bulgogi;
	public int rice;
	public int milk;
	public int amond;
	public int banana;
//	 생성자에서  파라미터로 받을 값 설정
	public LunchMenu(int bulgogi,int rice,int milk,int amond,int banana) {
		// TODO Auto-generated constructor stub
//		같은 클래스에서 가지고 있는데이터 를 생성자 안에서 할당
		this.bulgogi = bulgogi;
		this.rice = rice;
		this.milk = milk;
		this.amond = amond;
		this.banana = banana;
	}
//	아이들이 먹은 음식이 각자 다르기 때문에 상속받은 클래스에서 반드시 재정의 하여 계산 할수있게  추상클래스로 선언
	public abstract int cacul();

}
