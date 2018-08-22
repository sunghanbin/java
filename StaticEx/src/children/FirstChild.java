package children;

import Papa.PapaPouch;

public class FirstChild {
	
	public void takeMoney(int money) {
//	   static 으로 선언한 PapaPouch의 변수 MONEY 는 객체를 생성하지 않고 바로 접근할수있다. 객체생성접근 X
//		일반 class 의 데이터나 메소드 사용시  PapaPouch 사용할객체명 = new PapaPouch();
//		 Papapouch.MONEY 으로 가능하지만 
//		static 을 사용한  변수는  PapaPouch.MONEY 처럼 바로 접근 가능 하다.. 클래스명.메소드&데이터
//		공유한다는 의미가 여기에 있고  class를 가져다  사용하여 값이 바뀌게 되면  static 변수는 바뀐값을 담고 있는다.
		PapaPouch.MONEY = PapaPouch.MONEY - money;
		if(PapaPouch.MONEY < 0) {
			System.out.println("큰형 돈못줌");
		}
	}

}
