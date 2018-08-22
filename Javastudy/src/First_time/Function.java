package First_time;

import java.util.Scanner;

public class Function {
//  main 메소드 란  jvm  이 클래스를 실행 할때  시작점을 알려주기 위함이다 
	public static void main(String[] args) {
		int i = 1;
//		출력문 (console창)
//		출력하고 개행 
		System.out.println(i);
//		출력하고 개행 하지 않음
		System.out.print(i);

		
//		사용자 입력  받기                                         // 사용자로 부터 입력 받기  기다린다  System.in 매개 변수 
		Scanner sn = new Scanner(System.in);
		int j = sn.nextInt();
//		/////////////////////////
		System.out.println("j 를 3으로 눈 나머지 값");
		System.out.println("i%3 =" + (j%3));

	}

}
