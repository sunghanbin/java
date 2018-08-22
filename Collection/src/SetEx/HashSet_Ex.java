package SetEx;

import java.util.HashSet;

public class HashSet_Ex {

	public static void main(String[] args) {
//		1.set계열 자료구조에서는 데이터의 순서는 없다
//		2.중복된 데이터는 허락하지 않음
		
//		HashSet 객체생성
		HashSet<String> hashSet = new HashSet<String>();
		
//		데이터 추가 .add
		hashSet.add("str0");
		hashSet.add("str1");
		hashSet.add("str2");
		hashSet.add("str3");
		hashSet.add("str4");
		System.out.println(hashSet.toString());
		
//		데이터를 직접 찾아 제거
		hashSet.remove("str0");
		System.out.println(hashSet.toString());
		
		int size = hashSet.size();
		System.out.println(size);

		
		

	}

}
