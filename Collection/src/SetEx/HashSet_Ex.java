package SetEx;

import java.util.HashSet;

public class HashSet_Ex {

	public static void main(String[] args) {
//		1.set�迭 �ڷᱸ�������� �������� ������ ����
//		2.�ߺ��� �����ʹ� ������� ����
		
//		HashSet ��ü����
		HashSet<String> hashSet = new HashSet<String>();
		
//		������ �߰� .add
		hashSet.add("str0");
		hashSet.add("str1");
		hashSet.add("str2");
		hashSet.add("str3");
		hashSet.add("str4");
		System.out.println(hashSet.toString());
		
//		�����͸� ���� ã�� ����
		hashSet.remove("str0");
		System.out.println(hashSet.toString());
		
		int size = hashSet.size();
		System.out.println(size);

		
		

	}

}
