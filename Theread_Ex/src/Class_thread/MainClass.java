package Class_thread;

public class MainClass {
	
	public static void main(String[]args) {
		
//		 �����带 ��� �޾ұ� ������ ��ü Ÿ���� ������ �� ���� �Ҽ� �ְ� �ٷ� �����带 ��밡�� �ϴ�.
		Thread thread = new extends_thread();
		extends_thread thread1 = new extends_thread();
//		��� �޾Ƽ� ������ ��ü ������ �����忡 �̸��ֱ�
		thread.setName("b");
		thread.start();
		
		System.out.println(Thread.currentThread().getName());
		
		
	}

}
