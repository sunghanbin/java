package com.shb.abstractex;
//     추상메서드  abstract 
//     상속받을시 무조건 재정의 해야함 
public abstract class HeadQuaterStore {
//	       추상 메서드가 사용되면 추상 클래스
//	추상클래스에서는 선언부 만 있고 실행부가 없다.
//	로직구현은 상속받은 클래스가 한다.
	public abstract void orderKimChijjige();
	
	public abstract void orderBudeajjige();
	
	public abstract void orderBibimBap();
	
	public abstract void ordersoondeatguk();
	
	public abstract void ordergonggibap();
	
	public void method1() {
		System.out.println("HEadQuaterStore의 메소드 입니다.");
	}
}
