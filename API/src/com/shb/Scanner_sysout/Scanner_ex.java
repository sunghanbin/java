package com.shb.Scanner_sysout;

import java.util.Scanner;

public class Scanner_ex {
	
	public static void main(String[] args) {
//		Scanner Ű���忡�� Ÿ���� �ϴ� ���ڿ� �Ǵ� ����� ���α׷��ֿ��� ���ڿ��� �о�� �� ����մϴ�.
		
		Scanner scanner = new Scanner(System.in);
//		�����Է� �ޱ� nextInt
		int i = scanner.nextInt();
		System.out.println("i = "+i);
//		���ڿ� �Է� �ޱ� next
		String str0 = scanner.next();
		System.out.println("str0 = "+str0);
//		���ڿ� �Է� �ޱ�  \n ���� �������� �Է� ����
//		���� str0���� �Է��� �ϰ� ���� �� ġ�ԵǸ� ���� �Է��� ���ڿ�+\n ������ �츮������ ������ ������ ���������� ���� �ǰ��ִ�
//		�׷��� ������ �Ʒ��� �ִ� str1�� ��ĳ�ʿ��� ó�� ������ ���ڰ� ���๮�̱� ������ ���� ������ �ȴ�
		String str1 = scanner.nextLine();
		System.out.println("str1 = "+str1);
	}

	
	

}
