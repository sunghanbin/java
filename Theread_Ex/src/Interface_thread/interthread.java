package Interface_thread;
// runneble 이라는 인터페이스를 임플리먼트 하면 run 이라는 추상메서드를 반드시 구현 하여 스레드 구동.
public class interthread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
//					스레드는 static 으로 선언 되어 있어 바로 접근 가능/// currentThread 현재구동되고 있는 스레드를 구하는것//getName 구동되고 있는 스레드의 이름		
		System.out.println(Thread.currentThread().getName());
		System.out.println("interthread");
		
		for(int i = 0; i <10;i++) {
			System.out.println(i);
			try {
//				Thread 구문은 try문안에 작성 해야한다.
//				for 문을 통과하여 만나면 밀리언세컨즈 이기 때문에  500/1000 = 0.5초  를 센뒤 실행 하지만 0.5초를 센뒤 for문으로 바로 올라갈지는 모름		
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
		
	}

}
