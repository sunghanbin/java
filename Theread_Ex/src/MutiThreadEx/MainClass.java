package MutiThreadEx;

public class MainClass {
	
	public static void main(String[]args) {
//		��ü �ϳ��� �ϳ��� ������ ���� 
		
//		���� ���� Ŭ���� �� ��ü ����;
		VotdThread voteLocation1 = new VotdThread();
		VotdThread voteLocation2 = new VotdThread();
		VotdThread voteLocation3 = new VotdThread();
		
//		thread Ŭ������  �����带 ���� ��ü�� �־� ������ �̸��� �����ش�.
		Thread thread = new Thread(voteLocation1, "location1");
		Thread thread1 = new Thread(voteLocation2, "Location2");
		Thread thread2 = new Thread(voteLocation2, "Location3");
//		������ ����
		thread.start();
		thread1.start();
		thread2.start();
		
	}

}
