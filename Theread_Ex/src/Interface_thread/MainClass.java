package Interface_thread;

public class MainClass {
	
	public static void main(String[]args) {
		
		
		interthread interth = new interthread();
//		                          (Runnable �������̽� �� ������ Ŭ������ ����Ҷ� , ������ �̸� �ֱ� �� interth ��ü�� ������ �̸��� A �ΰ��̴�.)
		Thread thread = new Thread(interth,"A");
//		start �޼ҵ带 ȣ���ϸ� start �޼ҵ�� run �޼ҵ带 ȣ���Ѵ�.
		thread.start();//�۾�1
		
//		�����尡 ���ư��� �ִ� �� ���� main ���� ���ư��� ������ �ܼ�â�� main ��������
		System.out.println(Thread.currentThread().getName());//�۾�2
		System.out.println("MainClass");//�۾�3 �������� �۾��� �ϰ������� ������� ����Ǵ°��� �ƴ϶� �����带 ���� �ϰԵǸ� �ڱ� �۾����Ѵ�.
		
//		console â
		
				
	}

}