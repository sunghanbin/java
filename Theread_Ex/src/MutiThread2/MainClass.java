package MutiThread2;

public class MainClass {
	
	public static void main(String[]args) {
//		객체 하나의 하나의 스레드 구현 
		
//		내가 만든 클래스 로 객체 생성;
		ThreadTest thts = new ThreadTest();
		ThreadTest thts1 = new ThreadTest();
		
//		thread 클래스로  스레드를 돌릴 객체를 넣어 스레드 이름을 지어준다.
		Thread thread = new Thread(thts, "A");
		Thread thread1 = new Thread(thts1, "B");
//		스레드 시작
		thread.start();
		thread1.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
	}

}
