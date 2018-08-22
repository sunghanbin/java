package MutiThreadEx;

import java.util.Random;

public class VotdThread implements Runnable {
	
	int targetNum = 100;
	int sum = 0;
//	랜덤 클래스를 사용하기 위해 객체 생성
	Random random = new Random();

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		스트링 버퍼 클래스를 사용하기 위해 객체 생성
		StringBuffer sb = new StringBuffer();
		
//		반복문  브레이크를 만나지 않는 이상 계속 돌아야 하기 때문에  true 를 사용
		while(true) {
//			 sum에 sum 과 10범위 안에서 랜덤으로 숫자를 구해 더해준다.
			sum = sum + random.nextInt(10);
//			for문을돈후 별이 남아 있기 때문에 지워준후 다시 쌓기 위해서  0번째부터 문자의 길이만큼 삭제 한다. 
			sb.delete(0, sb.toString().length());
//			만약  sum 이 targetNum 보다크거나 같으면 targetNum 은 100 이다.
//			 스레드의 마지막은 100으로 설정해둔것이다. if문을 탈경우 break 가 있기 때문에 반복문을 끝낸다.
			if(sum >= targetNum) {
				sum = 100;
				for(int i = 0; i <sum; i++) {
					sb.append('*');
				}
				System.out.println(Thread.currentThread().getName() + "개표율 :" + sum + "\t" + sb);
				break;
			}else {
//				sum 에 숫자만큼 별을 stringBuffer에 붙혀준다.
				for(int i = 0; i <sum; i++) {
					sb.append('*');
				}
				System.out.println(Thread.currentThread().getName() + "개표율 :" + sum + "\t" + sb);
			}
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
			}
			
		}
		
	}
	
	


