package MutiThreadEx;

public class MainClass {
	
	public static void main(String[]args) {
//		객체 하나의 하나의 스레드 구현 
		
//		내가 만든 클래스 로 객체 생성;
		VotdThread voteLocation1 = new VotdThread();
		VotdThread voteLocation2 = new VotdThread();
		VotdThread voteLocation3 = new VotdThread();
		
//		thread 클래스로  스레드를 돌릴 객체를 넣어 스레드 이름을 지어준다.
		Thread thread = new Thread(voteLocation1, "location1");
		Thread thread1 = new Thread(voteLocation2, "Location2");
		Thread thread2 = new Thread(voteLocation2, "Location3");
//		스레드 시작
		thread.start();
		thread1.start();
		thread2.start();
		
	}

}
