package com.shb.StringTOkenizer;

import java.util.StringTokenizer;

public class tokenizer_ex {
	
	public static void main(String[]args) {
//		StringTokenizer ���ڿ� �� ������ �ִ� Ŭ����
		
		String str1 = "���� ������ ���, ���� ���� ���� �ֽ��ϴ�.";
		String str2 = "2018/08/09";
		
		System.out.println(str1);
		System.out.println(str2);
		
//		��Ʈ����ũ������ Ŭ������ ��ü�� �����Ҷ�  �Ķ���Ϳ� ���ڿ��� �־� �ָ� ����Ʈ�� ���� �� �������� �����ش�.
		StringTokenizer tokenizer1 = new StringTokenizer(str1);
//		�Ķ���Ϳ� ���ڿ� �� ���� ������ �־��ָ� �ױ����� ���� �������ش�
		StringTokenizer tokenizer2 = new StringTokenizer(str2,"/");
//		countTokens()�� �������� ��ū�� ����� ��� ���ڿ��� �������� ������ �˷��ش�
		System.out.println("tokenizer1 ���ڿ� ��:" + tokenizer1.countTokens());
		System.out.println("tokenizer2 ���ڿ� ��:" + tokenizer2.countTokens());
//		�ݺ����� while�� ���ؼ� �ϳ� �ϳ� ����Ʈ�� �����̴�.
//		hasMoreTokens() ������ū�� ������ true�� ��ȯ���ش�. �̰�� tokenizer1�� 7���� ��ū�� �ִ�  
		while(tokenizer1.hasMoreTokens()) {
//			��ū�� �ִٸ� ������ū�� ����
			System.out.println(tokenizer1.nextToken());
		}
		
		while(tokenizer2.hasMoreTokens()) {
//			���Ϲ��� ����� ��ū��  ����Ѵ�.
			System.out.println(tokenizer2.nextToken());
		}
		
	}

}
