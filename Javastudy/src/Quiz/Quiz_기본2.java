package Quiz;

public class Quiz_기본2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1에서 10까지의 숫자중 짝수 또는 홀수들의 합을 구해보자.
		int sums1 = 0;
		int sums2 = 0;
		for(int sum2=1;sum2 <= 10; sum2++) {
			int sum3 = sum2 % 2;
			switch(sum3) {
			case 0 :
				sums1+=sum2;
				break;
			default :
				sums2+=sum2;
				break;
			}
		}
		System.out.println("짝수합"+sums1);
		System.out.println("홀수합"+sums2);
		
		

	}

}
