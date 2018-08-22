package com.shb.Scanner_sysout;

import java.util.Scanner;

public class Scanner_ex {
	
	public static void main(String[] args) {
//		Scanner 키보드에서 타이핑 하는 문자열 또는 입출력 프로그래밍에서 문자열을 읽어올 때 사용합니다.
		
		Scanner scanner = new Scanner(System.in);
//		정수입력 받기 nextInt
		int i = scanner.nextInt();
		System.out.println("i = "+i);
//		문자열 입력 받기 next
		String str0 = scanner.next();
		System.out.println("str0 = "+str0);
//		문자열 입력 받기  \n 개행 전까지만 입력 받음
//		위에 str0에서 입력을 하고 엔터 를 치게되면 내가 입력한 문자열+\n 개행이 우리눈에는 보이지 않지만 내부적으로 실행 되고있다
//		그렇기 때문에 아래에 있는 str1의 스캐너에서 처음 만나는 문자가 개행문이기 때문에 빈값이 나오게 된다
		String str1 = scanner.nextLine();
		System.out.println("str1 = "+str1);
	}

	
	

}
