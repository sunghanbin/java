package com.shb.abstractex_childlunch;
//      런치 메뉴를 상속 받음
public class Child1 extends LunchMenu {
//                객체 생성시 파라미터로 받을 값
	public Child1(int bulgogi, int rice, int milk, int amond, int banana) {
//		부모의 데이터를 사용하기 위해 super키워드를 써준다
		super(bulgogi, rice, milk, amond, banana);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int cacul() {
		// TODO Auto-generated method stub
		return rice + bulgogi + banana;
	}
	
	

}
