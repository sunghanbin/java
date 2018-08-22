package Quiz;

import java.util.Scanner;

public class Quiz_if문 {
	
	public static void main(String[] args) {
		
//		if 문 quiz
//		사용자로 부터 국어,영어,수학 점수를 입력 받아, 각 과목별 점수가 평균이상인지 이하인지 구해보자 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력 하세요.");
		
		int Ko = sc.nextInt();
		
        System.out.print("영어 점수를 입력 하세요.");
		
		int En = sc.nextInt();
        System.out.print("수학 점수를 입력 하세요.");
		
		int Math = sc.nextInt();
		
		double avg = (Ko + En + Math)/3;
		System.out.println("평균점수는"+avg+"입니다.");
		
		if(Ko >= 90) {
			System.out.println("국어평균 보다 높습니다");
		}else if(Ko >= 60) {
			System.out.println("국어평균입니다");
		}else {
			System.out.println("국어평균보다 낮습니다");
		}
		
		if(En >= 90) {
			System.out.println("영어평균 보다 높습니다");
		}else if(En >= 60) {
			System.out.println("영어평균입니다");
		}else {
			System.out.println("영어평균보다 낮습니다");
		}
		
		if(Math >= 90) {
			System.out.println("수학 평균 보다 높습니다");
		}else if(Math >= 60) {
			System.out.println("수학 평균입니다");
		}else{
			System.out.println("수학 평균보다 낮습니다");
		}
		
	}
}