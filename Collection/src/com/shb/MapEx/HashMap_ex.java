package com.shb.MapEx;

import java.util.HashMap;
import java.util.Iterator;

public class HashMap_ex {
	
	public static void main(String[] args) {
//	Map 계열의 자료구조는  물품 보관함과 비슷하다. 물품보관함에 번호를 안다고 물건을 찾을수 있는것 이 아니라 키가 있어야 물건을 찾을수 있는것과 같이
//	Map 의 자료구조에서는 키가 중요합니다.
//	1.list와 달리 인덱스 X
//	2.키와 값만 있다.
//	3.키는 유니크 해야한다.
//	4.키를 이용하여 값을 관리 할수 있다.
		
// HashMap 개체 생성
//		                         키  , 값
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		
		
//		데이터 추가 할때  .put(키,밸류)
		hashMap.put(0, "str0");
		hashMap.put(1, "str1");
		hashMap.put(2, "str2");
		hashMap.put(3, "str3");
		hashMap.put(4, "str4");
		System.out.println(hashMap.toString());
		
		
//		키로 밸류값 얻어오기
		String str = hashMap.get(2);
		System.out.println(str);
		
		
//		키로 밸류값 지우기
		hashMap.remove(2);
		System.out.println(hashMap.toString());
		
//		데이터 전부 삭제
		hashMap.clear();
		System.out.println(hashMap.toString());
		
		
//		자료구조형<데이터타입> 자료구조명      해쉬맵의 키데이터의 반복자로 객체를 생성 
		Iterator<Integer> iterator = hashMap.keySet().iterator();
//						다음것이 있나? boolean 형태로 반환  /시작은 가장 첫번째의 그앞 부터           (이곳이 처음),1,2,3,4 
		while (iterator.hasNext()) {
//			                해쉬맵의 값 가져오겠다(반복자의 다음것)
			String string = hashMap.get(iterator.next());
			System.out.println(string);
		}
		
		
	}

}
