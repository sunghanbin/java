package Interface_thread;

public class MainClass {
	
	public static void main(String[]args) {
		
		
		interthread interth = new interthread();
//		                          (Runnable 인터페이스 를 구현한 클래스를 사용할때 , 스레드 이름 주기 이 interth 객체의 스레드 이름은 A 인것이다.)
		Thread thread = new Thread(interth,"A");
//		start 메소드를 호출하면 start 메소드는 run 메소드를 호출한다.
		thread.start();//작업1
		
//		스레드가 돌아가고 있는 곳 지금 main 에서 돌아가기 때문에 콘솔창에 main 이찍힌다
		System.out.println(Thread.currentThread().getName());//작업2
		System.out.println("MainClass");//작업3 여러가지 작업을 하고있으며 순서대로 실행되는것이 아니라 스레드를 실행 하게되면 자기 작업을한다.
		
//		console 창
		
				
	}

}
