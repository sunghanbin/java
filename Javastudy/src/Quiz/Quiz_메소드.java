package Quiz;

import java.util.Scanner;

public class Quiz_메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("알고싶은 구구단 숫자를 입력하세요");
		int input = sc.nextInt();
		
//		메인 메소드에서 바로 gugudan 메소드를 사용할수 없기 때문에 메소드의 해당클래스를 찾아서 객체를 하나만들어준후 사용할수있다.
		
		Quiz_메소드 gugu = new Quiz_메소드();
//		객체가 메소드를 호출하는법 호출부
		gugu.gugudan(input);

	}
	public void gugudan(int i) {
		for(int j= 1; j<10; j++) {
			int sum = i*j;
			System.out.println(i+"*"+j+"="+sum);
		}
	}
}
