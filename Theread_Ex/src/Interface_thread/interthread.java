package Interface_thread;
// runneble �̶�� �������̽��� ���ø���Ʈ �ϸ� run �̶�� �߻�޼��带 �ݵ�� ���� �Ͽ� ������ ����.
public class interthread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
//					������� static ���� ���� �Ǿ� �־� �ٷ� ���� ����/// currentThread ���籸���ǰ� �ִ� �����带 ���ϴ°�//getName �����ǰ� �ִ� �������� �̸�		
		System.out.println(Thread.currentThread().getName());
		System.out.println("interthread");
		
		for(int i = 0; i <10;i++) {
			System.out.println(i);
			try {
//				Thread ������ try���ȿ� �ۼ� �ؾ��Ѵ�.
//				for ���� ����Ͽ� ������ �и������� �̱� ������  500/1000 = 0.5��  �� ���� ���� ������ 0.5�ʸ� ���� for������ �ٷ� �ö����� ��		
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
		
	}

}