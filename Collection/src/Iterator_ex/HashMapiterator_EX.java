package Iterator_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapiterator_EX {
	
	public static void main(String[]args) {
		
		HashMap<Integer,String> hashM = new HashMap<Integer,String>();
		hashM.put(0, "str1");
		hashM.put(1, "str2");
		hashM.put(2, "str3");
		hashM.put(3, "str4");
//		모든 set 클래스의 상위 클래스인 Set 클래스 로 객체를 생성한다.
//		                         .키의 집합
		Set<Integer>  set = hashM.keySet();
//		                                                  키의 집합에서 반복자를 이터레이터 객체생성하여 담는다.
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
//			 hasnext는 boolean 형으로 반환 하는것 같고
//			 next는 데이터를 반환 하는것 같다
			Integer key = iter.next();
			System.out.println(hashM.get(key));
			
		}
		
	}

}
