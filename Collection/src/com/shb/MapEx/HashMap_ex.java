package com.shb.MapEx;

import java.util.HashMap;
import java.util.Iterator;

public class HashMap_ex {
	
	public static void main(String[] args) {
//	Map �迭�� �ڷᱸ����  ��ǰ �����԰� ����ϴ�. ��ǰ�����Կ� ��ȣ�� �ȴٰ� ������ ã���� �ִ°� �� �ƴ϶� Ű�� �־�� ������ ã���� �ִ°Ͱ� ����
//	Map �� �ڷᱸ�������� Ű�� �߿��մϴ�.
//	1.list�� �޸� �ε��� X
//	2.Ű�� ���� �ִ�.
//	3.Ű�� ����ũ �ؾ��Ѵ�.
//	4.Ű�� �̿��Ͽ� ���� ���� �Ҽ� �ִ�.
		
// HashMap ��ü ����
//		                         Ű  , ��
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		
		
//		������ �߰� �Ҷ�  .put(Ű,���)
		hashMap.put(0, "str0");
		hashMap.put(1, "str1");
		hashMap.put(2, "str2");
		hashMap.put(3, "str3");
		hashMap.put(4, "str4");
		System.out.println(hashMap.toString());
		
		
//		Ű�� ����� ������
		String str = hashMap.get(2);
		System.out.println(str);
		
		
//		Ű�� ����� �����
		hashMap.remove(2);
		System.out.println(hashMap.toString());
		
//		������ ���� ����
		hashMap.clear();
		System.out.println(hashMap.toString());
		
		
//		�ڷᱸ����<������Ÿ��> �ڷᱸ����      �ؽ����� Ű�������� �ݺ��ڷ� ��ü�� ���� 
		Iterator<Integer> iterator = hashMap.keySet().iterator();
//						�������� �ֳ�? boolean ���·� ��ȯ  /������ ���� ù��°�� �׾� ����           (�̰��� ó��),1,2,3,4 
		while (iterator.hasNext()) {
//			                �ؽ����� �� �������ڴ�(�ݺ����� ������)
			String string = hashMap.get(iterator.next());
			System.out.println(string);
		}
		
		
	}

}
