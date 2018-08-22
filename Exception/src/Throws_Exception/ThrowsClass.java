package Throws_Exception;

public class ThrowsClass {
//	기본 생성자
	public ThrowsClass() {
//		1.메인클래스에서 ThrowsClass 의 객체를 생성하게 되면 바로 actionC 메서드를 실행한다.
		actionC();
	}
	private void actionA() throws Exception {
//		4. actionB에서 호출 받은 actionA는 프린트를 찍고 어레이를 생성한후,
//		어레이에서 해당하는 인덱스 번호의 값을 불러 찍으려 하지만 3번째 인덱스 까지 밖에 없으므로
//		throws문을 이용 자신을 호출한 actionB로 간다.
		System.out.println("actionA");
		
		int[] iArr = {1,2,3,4};
		System.out.println(iArr[4]);
//		*. 위에 로직에서 에러가 났기 때문에 에러 아래구문은 실행되지않는다. Throws 를 사용하게되어도 호출부에서 예외처리한후
//		다시 돌아오지않는다.
		System.out.println("actionAA");
	}
	
	private void actionB() {
//		3.actionC에서 호출 받은 actionB는 로직을 프린트를 찍고 try 문을 통해 actionA를 호출한다.
		System.out.println("actionB");
		
		try {
			actionA();
//			5.throws 문 을 통해 예외처리 해달라는 신호가 actionA에서 왔기 때문에 catch문의 로직 실행
		}catch(Exception e) {
			System.out.println("예외 처리는 여기서 하겠다.");
			System.out.println(e.getMessage());
		}
//		6.나머지로직실행
		System.out.println("actionBB");
	}
	
	private void actionC() {
//		2.생성자에서 바로 실행된 actionC는 프린트를 찍고 actionB를 호출 한다.
		System.out.println("actionC");
		actionB();
//		7.나머지 로직 실행
		System.out.println("actionCC");
	}
	

}
