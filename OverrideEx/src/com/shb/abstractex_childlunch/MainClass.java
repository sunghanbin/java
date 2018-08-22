package com.shb.abstractex_childlunch;

public class MainClass {
	
	public static void main(String[]args) {
// 상속받은 객체들은 부모클래스의 객체타입으로 생성 가능하다  생성자에는 파라미터 를 받기로 되어 있기 때문에 파라미터 에 프라이스테이블
//		의 값을 넣어 음식의 가격을 알려준다.
		LunchMenu child1 = new Child1(PriceTable.BOLGOGI,PriceTable.RICE,PriceTable.MILK,PriceTable.AMOND,PriceTable.BANANA);
		LunchMenu child2 = new Child2(PriceTable.BOLGOGI,PriceTable.RICE,PriceTable.MILK,PriceTable.AMOND,PriceTable.BANANA);
		
		
//		 생성한 객체에 있는 계산 메소드를 사용하여 계산한 값을 리턴 해준다.
//		이렇게 계산이 가능한것은 위에서 객체를 생성할때 파라미터 값에 프라이스 테이블에 음식값을 넣어 생성하였기에 정의 되어 있는각 음식변수 명에는
//		프라이스 테이블에서 정의한 값이 들어가 가능한것이다
		System.out.println("첫번째 아이의 식대는:"+child1.cacul());
		System.out.println("두번쨰 아이의 식대는:"+child2.cacul());
	}

}
