package Quiz;

public class Quiz_while문 {

	public static void main(String[] args) {
//		1에서 100까지의 숫자 중 3의 배수 합을 구해보자
		int hap = 1;
		int haps1 = 0;
		while(hap <=100) {
			int haps = hap%3;
			if(haps == 0) {
				haps1+= hap;
				System.out.println(hap);
			}
			hap++;
		}
		System.out.println("합은"+haps1);
		

	}

}
