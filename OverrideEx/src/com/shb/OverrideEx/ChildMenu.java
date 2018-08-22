package com.shb.OverrideEx;

public class ChildMenu extends ParentMenu {
	
	public void makeBeefcjdrnrwkd() {
		System.out.println("쇠고기청국장");
	}
	public void makeHotehlswkdrnr() {
		System.out.println("얼큰된장국");
	}
	public void makekongnamulguc() {
		System.out.println("콩나물국");
	}
	
//	부모에 있는 메서드나 데이터 를 같은이름의 변수로 선언하여 재정의,덮어쓰기 형식으로 상속받은 클래스에서 사용할수있다
//	사용할때는  @Override라는 키워드를 사용한다 
//	재정의 할시 자식클래스에서는 재정의한 대로 메서드,데이터가 실행된다
	@Override
	public void makecjdrnrwkd() {
		// TODO Auto-generated method stub
		System.out.println("냄새없는 청국장");
		
	}
		
	

}
