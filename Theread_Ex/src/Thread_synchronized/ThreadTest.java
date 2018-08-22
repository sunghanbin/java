package Thread_synchronized;

public class ThreadTest implements Runnable {
	
	int testNum = 0;

	@Override
//	run메서드를 구현 할 때  싱크로나이즈 키워드 를 사용 하면  먼저실행된 스레드부터 완료한뒤 다음 스레드가 실행 된다
	public synchronized void run() {
		// TODO Auto-generated method stub
		
		for(int i = 0; i <10; i++) {
			if(Thread.currentThread().getName().equals("A")) {
				System.out.println("===========================");
				testNum++;
			}
			System.out.println("ThreadName :\t" + Thread.currentThread().getName() + " testNum " + testNum);
			try {
				Thread.sleep(500);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
	

}
