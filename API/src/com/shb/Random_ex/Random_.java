package com.shb.Random_ex;

import java.util.Random;

public class Random_ {
	
	public static void main(String[] args) {
//		math.random()Ŭ������ �������� ��ȯ�ϰ� ����� ���ִ�
//		�׷��� ������ ������ ��������  �Ҽ��� �����Եȴ� 0.49 �̰��� ������ �ٲٰ� �ʹٸ� *10
		double d = Math.random();
		System.out.println(d);
//		����� ����ȯ (int)
		int di = (int)(d*10);
		
		Random random = new Random();
//		nextInt(100)������ �����Ҽ� �ִ�.
		int i = random.nextInt(100);
		System.out.println(i);
		
	}

}
