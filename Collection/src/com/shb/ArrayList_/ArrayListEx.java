package com.shb.ArrayList_;

import java.util.ArrayList;

public class ArrayListEx {
	
	public static void main(String[]args) {
		
//		list 는 배열과 비슷하지만, 배열의 단점을 보완하였습니다. list는 처음 만들 때 크기를 고정하지 않아도 됩니다.

//		ArrayList 는 배열과 매우비슷,인덱스존재,데이터중복 가능, 인덱스 가장 중요

//		ArrayList
//		LinkedList 는  ArrayList 와 사용방법은 모두 같다. 추가나 여러가지 기능들은 ArrayList 보다는 느리지 만 조회속도가 아주조금은 빠르다고
//		한다. (체감상 차이 무)
//		Vector 가장 먼저 나온 자료구조형 
//		ArrayList와 비슷하지만 속도가 떨어진다.하지만,ArrayList 보다는 멀티스레드 환경에서는 안전하여,여전히 많이 쓰인다

//		Array List 객체 생성 하기
		
//		     어레이리스트에 담길데이터 타입
		ArrayList<String> arraylist = new ArrayList<String>();
		
//		ArrayList에 데이터 추가 하기 레퍼런스명.add() 인덱스 번호를 주지 않게 되면 제일 뒤쪽에 추가 되고
		arraylist.add("str1");
		arraylist.add("str2");
		arraylist.add("str3");
		arraylist.add("str4");
//		인덱스 번호를 주게 되면 원하는인덱스 번호 자리에 생성 된다
		arraylist.add(2,"str5");
		
//		
		System.out.println(arraylist.toString());
		
//		인덱스번호로 데이터 찾기 .get()
		String index3 = arraylist.get(3);
		
		System.out.println(index3);
		
//		인덱스번호로 데이터 변경하기 .set()
		arraylist.set(2, "str2222");
		
		System.out.println(arraylist.toString());
		
//		어레이 리스트 사이즈 알아보기 .size()
		int size = arraylist.size();
		
		System.out.println(size);
		
//		인덱스 번호로 데이터 삭제하기 .remove()
		arraylist.remove(2);
		
		System.out.println(arraylist.toString());
		
//		어레이 리스트 데이터 전체 지우기 .clear();
		arraylist.clear();
		
		System.out.println(arraylist.toString());
		
//		클리어와 null 값의 차이 클리어는  주소값을 가지고 있지만 그안에 데이터가 없는것이고  null의 경우는 레퍼런스가
//		아무런 주소값을 가르키고 있지않다는것 이다. 널값을 주게 되면  가르키고 있던 주소값이 끊어지는것이다.
		arraylist = null;
		
		
//		레퍼런스는 존재하므로 출력을 하지만 null값으로 나온다
		System.out.println(arraylist);
		
//		객체가 존재하지 않기 때문에 에러 널포인트 에러
		System.out.println(arraylist.size());
		
		
		
		
		
	}

}
