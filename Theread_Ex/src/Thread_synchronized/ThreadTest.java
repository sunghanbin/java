package Thread_synchronized;

public class ThreadTest implements Runnable {
	
	int testNum = 0;

	@Override
//	run�޼��带 ���� �� ��  ��ũ�γ����� Ű���� �� ��� �ϸ�  ��������� ��������� �Ϸ��ѵ� ���� �����尡 ���� �ȴ�
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
