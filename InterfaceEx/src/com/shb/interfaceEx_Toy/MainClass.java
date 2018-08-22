package com.shb.interfaceEx_Toy;

public class MainClass {

	public static void main(String[]args) {
//		각 인터페이스 에 Toy 인터페이스를 상속해준이유는 객체를 생성할때 Toy 라는 객체타입으로 통일하여 관리가 쉽게 함이다. Toy는 추상메서드도 상수도 없는
//		껍데기 이지만 데이터 타입을 하나로 묶어주는 역활을 한다. 다형성의 예시이다.
//		                               iToy
//		                              / | \
//									 /  |  \
//		                            /   |   \
//		                        iLite iMisi iArms
//		                         /   /  /    /\
//								/ __/  /  __/  \
//		                      air  maging     Poo
		Toy poo = new Poo();
		Toy mazing = new mazinger();
		Toy airplaToy = new airPlaToy();
		
	}
}
