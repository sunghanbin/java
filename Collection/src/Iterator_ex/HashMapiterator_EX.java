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
//		��� set Ŭ������ ���� Ŭ������ Set Ŭ���� �� ��ü�� �����Ѵ�.
//		                         .Ű�� ����
		Set<Integer>  set = hashM.keySet();
//		                                                  Ű�� ���տ��� �ݺ��ڸ� ���ͷ����� ��ü�����Ͽ� ��´�.
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
//			 hasnext�� boolean ������ ��ȯ �ϴ°� ����
//			 next�� �����͸� ��ȯ �ϴ°� ����
			Integer key = iter.next();
			System.out.println(hashM.get(key));
			
		}
		
	}

}
