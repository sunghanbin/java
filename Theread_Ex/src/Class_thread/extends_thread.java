package Class_thread;

public class extends_thread extends Thread {
	
	
//	 ���� ���� run �� Ÿ�����Ͽ� �������̵� ������ ����� �Ѵ�.
//	�׷��� ������ ��ӹ��� Thread Ŭ������ run�żҵ� �� ���� �ǰ� �ȴ�.
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
