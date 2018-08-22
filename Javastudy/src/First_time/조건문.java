package First_time;

import java.util.Scanner;

public class 조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 20;
		int t = 30;
		
//		  제어문 ///
		  
//		  if
		  
		  if(i > j) {
			  System.out.println("i가 j보다 큽니다..");
		  }
		  
		  if(i==t) {
			  System.out.println("i는 t 와 같다 ");
		  }
		  
		  if(i>j) {
			  System.out.println("i는 j보다"+ (i - j) + "만큼 더 큽니다");
		  }else {
			  System.out.println("j는 i보다" + (j - i) + "만큼 더큽니다");
		  }
		  
		 Scanner sc = new Scanner(System.in);
		 int seoulLunchPrice = sc.nextInt();
		 
		 if(seoulLunchPrice >= 9000) {
			 System.out.println("서울 물가 비싸네요");
		 }else if(seoulLunchPrice >= 7000) {
			 System.out.println("서울 물가 조금비싸네요");
		 }else if(seoulLunchPrice >= 5000) {
			 System.out.println("서울 물가 괜찮네요!");
		 }else {
			 System.out.println("서울 물가 싸네요!");
		 }*/
		 
		 
//		 swith  if 문 보다 가독성이 높다
		 
		 Scanner swisc = new Scanner(System.in);
		 int swi = swisc.nextInt();
		 int swic = swi % 2;
		 
		 switch (swic) { // 조건값을 넣어 준다 (swic) 
		 case 0:// 0이면 실행 해라
			 System.out.println("짝수 입니다 ");
			 break;// switch 문에서 빠져나감 break
		 case 1:// 1이면 실행해라
			 System.out.println("홀수 입니다");
			 break;
			 
		default:// 0도아니고 1도 아니면 실행해라
			System.out.println("몰라영");
			break;
		 }
		  
//		 \n 개행
//		 \t 한탭 띄기 

	}

}
