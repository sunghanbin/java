package com.shb.CalendarAPI;

public class currentTimeMillis_Speed_StringBuilder {
	
	public static void main(String[] args) {
//		�ӵ� �׽�Ʈ �� ��� �Լ�
//		System.currentTimeMillis()�� ���� �ð��� 1/1,000�� ������ ǥ���մϴ�.���� �ӵ� �׽�Ʈ �뵵�� ���δ�.
		System.out.println(System.currentTimeMillis());
		
		StringBuilder str1 = new StringBuilder("A");
		long startNum = System.currentTimeMillis();
		
		for ( int i = 0; i <5000; i++) {
			str1 = str1.append("A");
		}
		
		long endNum = System.currentTimeMillis();
		System.out.println("����ð�:" +(endNum - startNum));
	}

}
