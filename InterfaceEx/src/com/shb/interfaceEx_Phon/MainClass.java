package com.shb.interfaceEx_Phon;

public class MainClass {
	
	public static void main(String[]args) {
		
		iFunction aphon = new APhon();
		iFunction bphon = new BPhon();
		iFunction cphon = new CPhon();
//		iterface는 객체타입이라는테이터 타입으로는 사용할수 있다고 했다 
//		그래서 여기서는 객체 타입으로 된 배열을 생성해 객체들을 담았다.
//		다른객체들이지만 같은 데이터타입의 배열의 들어갈수 있는 이유는 iFunction이라는 인터페이스 로 객체타입을 통일시켜 객체를생성하였기에 가능하다.
//		이것이 인터페이스의 특징인 다형성을 가질수 있는 이유이다.
		iFunction[] phons = {aphon,bphon,cphon};
		
		for(int i= 0;i<phons.length;i++) {
			phons[i].callSendReceive();
			phons[i].canLTE();
			phons[i].tvRemoteController();
			System.out.println("==================");
		}
	}

}
