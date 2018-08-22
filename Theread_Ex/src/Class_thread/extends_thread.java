package Class_thread;

public class extends_thread extends Thread {
	
	
//	 내가 직접 run 을 타이핑하여 오버라이드 재정의 해줘야 한다.
//	그렇지 않으면 상속받은 Thread 클래스의 run매소드 가 실행 되게 된다.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		System.out.println("extends_thread");
		for(int i = 0; i <10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	
	}

}
