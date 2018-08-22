package Quiz;

import java.util.Scanner;

public class Quiz_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
//		배열을 이용하여 학생들(영희,철수,길동,영수,말자)의 키를 입력하고 , 평균치를 구해 보자 
		
		String[] student = {"영희","철수","길동","영수","말자"};
		int[] height = new int[4];
		int sum = 0;
		
		Scanner Arrsc = new Scanner(System.in);
		
		for(int i = 0; i<student.length; i++ ) {
			System.out.print(height[i] +"키를 입력하세요 :");
			height[i] = Arrsc.nextInt();
			System.out.println(student[i]+ "학생의 키는" + height[i] + "입니다");
			
		}
		for (int j : height) {
			sum += j;
		}
		
		double aver = sum/height.length;
		System.out.println("학생들의 평균 키는 :"+ aver);
		

	}

}
