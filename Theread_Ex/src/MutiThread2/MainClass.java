package MutiThread2;

public class MainClass {
	
	public static void main(String[]args) {
//		��ü �ϳ��� �ϳ��� ������ ���� 
		
//		���� ���� Ŭ���� �� ��ü ����;
		ThreadTest thts = new ThreadTest();
		ThreadTest thts1 = new ThreadTest();
		
//		thread Ŭ������  �����带 ���� ��ü�� �־� ������ �̸��� �����ش�.
		Thread thread = new Thread(thts, "A");
		Thread thread1 = new Thread(thts1, "B");
//		������ ����
		thread.start();
		thread1.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
	}

}