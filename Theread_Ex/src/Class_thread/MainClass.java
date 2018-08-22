package Class_thread;

public class MainClass {
	
	public static void main(String[]args) {
		
//		 스레드를 상속 받았기 때문에 객체 타입을 스레드 로 선언 할수 있고 바로 스레드를 사용가능 하다.
		Thread thread = new extends_thread();
		extends_thread thread1 = new extends_thread();
//		상속 받아서 스레드 객체 생성시 스레드에 이름주기
		thread.setName("b");
		thread.start();
		
		System.out.println(Thread.currentThread().getName());
		
		
	}

}
