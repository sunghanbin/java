package MutiThread2;

public class ThreadTest implements Runnable {
	
	int testNum = 0;

	@Override
	public void run() {
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
