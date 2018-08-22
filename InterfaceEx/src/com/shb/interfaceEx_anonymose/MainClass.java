package com.shb.interfaceEx_anonymose;

public class MainClass {
	
	public static void main(String[]args) {
		
//		extends(상속)을 하지않고 바로 사용하게 되면 익명클래스 라고한다
//		바로 생성하면서 구현(제정의)까지 해야한다
		Ans ans = new Ans() {
			
			@Override
			void ans() {
				// TODO Auto-generated method stub
				
			}
		};
				
	}

}
