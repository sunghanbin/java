package Iterator_ex;

import java.util.ArrayList;
import java.util.Iterator;



public class Iterator_EX {
	
	public static void main(String[]args) {
//		Iterator라는 의미는 '반복자' 라는 의미로 데이터를 반복적으로 검색하는데 유용한 인터페이스
//		모든 자료구조형은 iterator()메소드를 지원 한다.
		
//		ArrayList에서의 iterator 사용
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		arrayList.add("str4");
		
//		 이터레이터 클래스로 데이터타입은 문자열 이며 어레이 리스트의 이터레이터를 담은 객체를  생성
		Iterator<String> itera = arrayList.iterator();
//		      hasNext 번역: 다음에 있다. :::: 반복자 다음 무엇이 있다면 true를 반환 while문을 돈다.
		while(itera.hasNext()) {
//			                        .반복자의 다음것을 돌려준다.
			System.out.println(itera.next());
		}
	
		
	}

}
