package com.shb.StringApi;

public class String_�޼ҵ� {
	
	public static void main(String[] args) {
		String str1 = "abcdefg";
		String str2 = "HIJKLMN";
		String str3 = "opqrstu";
		
		System.out.println(str1.concat(str2));//���ڿ� ����
		System.out.println(str1.substring(3));//���ڿ� �ڸ���
		System.out.println(str1.length());// ���ڿ� ����
		System.out.println(str1.toUpperCase());//�빮�ڷ� ����
		System.out.println(str2.toLowerCase());//�ҹ��ڷ� ����
		System.out.println(str1.charAt(3));//Ư����ġ�� ���� ã��
		System.out.println(str1.indexOf('c'));//Ư�����ڿ��� ��ġ
		
		String str4 = "adcdefg";
		System.out.println(str1.equals(str4));//���ڿ� ��
		
		String str5 = " abc def ghi ";
		System.out.println(str5.trim());//���ڿ� ����,�� �������� 
		
		System.out.println(str1.replace('a', 'Z'));//Ư������ ����
		System.out.println(str1.replaceAll("abcd", "ZZZZZ"));//Ư�� ���ڿ� ����
		
	}

}
