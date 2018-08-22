package com.shb.Random_ex;

import java.util.Random;

public class Random_ {
	
	public static void main(String[] args) {
//		math.random()클래스는 더블형을 반환하게 만들어 져있다
//		그렇기 때문에 난수를 구했을때  소수로 나오게된다 0.49 이것을 정수로 바꾸고 싶다면 *10
		double d = Math.random();
		System.out.println(d);
//		명시적 형변환 (int)
		int di = (int)(d*10);
		
		Random random = new Random();
//		nextInt(100)범위를 지정할수 있다.
		int i = random.nextInt(100);
		System.out.println(i);
		
	}

}
