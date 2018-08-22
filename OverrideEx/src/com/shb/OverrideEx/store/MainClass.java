package com.shb.OverrideEx.store;

public class MainClass {
	
	public static void main(String[]args) {
//		생성할때 스토어1 이 해드쿼터 스토어를 상속받고 있기 때문에 
//		하위 클래스의 객체의 타입을 상위 클래스의 객체 타입으로  사용가능 하기 때문에 아래 와 같이 쓸수있다.
		HeadQuaterStore store1 = new Store1();
		System.out.println("==============");
		store1.orderKimChijjige();
		store1.orderBibimBap();
		store1.orderBudeajjige();
		store1.ordersoondeatguk();
		store1.ordergonggibap();
		
		HeadQuaterStore store2 = new Store2();
		System.out.println("==============");
		store2.orderKimChijjige();
		store2.orderBibimBap();
		store2.orderBudeajjige();
		store2.ordersoondeatguk();
		store2.ordergonggibap();
		
		HeadQuaterStore store3 = new Store3();
		System.out.println("==============");
		store3.orderKimChijjige();
		store3.orderBibimBap();
		store3.orderBudeajjige();
		store3.ordersoondeatguk();
		store3.ordergonggibap();
		
		
	}

}
