package com.shb.StringApi;

public class StringBuilder_ {

	public static void main(String[] args) {
		
		
		StringBuilder stringBuilder = new StringBuilder("abcdefg");
		
		stringBuilder.append("hijklmn");//���ڿ��߰�
		System.out.println(stringBuilder);
		
		stringBuilder.insert(3, "aaa");//Ư�� ��ġ�� ���ڿ� �߰�
		System.out.println(stringBuilder);
		
		stringBuilder.delete(3, 5);//���ڿ� ����
		System.out.println(stringBuilder);
		
		stringBuilder.deleteCharAt(10);//Ư�� ���� �ϳ� ����
		System.out.println(stringBuilder);
		
	}
}
