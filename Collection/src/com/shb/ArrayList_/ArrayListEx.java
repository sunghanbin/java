package com.shb.ArrayList_;

import java.util.ArrayList;

public class ArrayListEx {
	
	public static void main(String[]args) {
		
//		list �� �迭�� ���������, �迭�� ������ �����Ͽ����ϴ�. list�� ó�� ���� �� ũ�⸦ �������� �ʾƵ� �˴ϴ�.

//		ArrayList �� �迭�� �ſ���,�ε�������,�������ߺ� ����, �ε��� ���� �߿�

//		ArrayList
//		LinkedList ��  ArrayList �� ������� ��� ����. �߰��� �������� ��ɵ��� ArrayList ���ٴ� ������ �� ��ȸ�ӵ��� ���������� �����ٰ�
//		�Ѵ�. (ü���� ���� ��)
//		Vector ���� ���� ���� �ڷᱸ���� 
//		ArrayList�� ��������� �ӵ��� ��������.������,ArrayList ���ٴ� ��Ƽ������ ȯ�濡���� �����Ͽ�,������ ���� ���δ�

//		Array List ��ü ���� �ϱ�
		
//		     ��̸���Ʈ�� ��浥���� Ÿ��
		ArrayList<String> arraylist = new ArrayList<String>();
		
//		ArrayList�� ������ �߰� �ϱ� ���۷�����.add() �ε��� ��ȣ�� ���� �ʰ� �Ǹ� ���� ���ʿ� �߰� �ǰ�
		arraylist.add("str1");
		arraylist.add("str2");
		arraylist.add("str3");
		arraylist.add("str4");
//		�ε��� ��ȣ�� �ְ� �Ǹ� ���ϴ��ε��� ��ȣ �ڸ��� ���� �ȴ�
		arraylist.add(2,"str5");
		
//		
		System.out.println(arraylist.toString());
		
//		�ε�����ȣ�� ������ ã�� .get()
		String index3 = arraylist.get(3);
		
		System.out.println(index3);
		
//		�ε�����ȣ�� ������ �����ϱ� .set()
		arraylist.set(2, "str2222");
		
		System.out.println(arraylist.toString());
		
//		��� ����Ʈ ������ �˾ƺ��� .size()
		int size = arraylist.size();
		
		System.out.println(size);
		
//		�ε��� ��ȣ�� ������ �����ϱ� .remove()
		arraylist.remove(2);
		
		System.out.println(arraylist.toString());
		
//		��� ����Ʈ ������ ��ü ����� .clear();
		arraylist.clear();
		
		System.out.println(arraylist.toString());
		
//		Ŭ����� null ���� ���� Ŭ�����  �ּҰ��� ������ ������ �׾ȿ� �����Ͱ� ���°��̰�  null�� ���� ���۷�����
//		�ƹ��� �ּҰ��� ����Ű�� �����ʴٴ°� �̴�. �ΰ��� �ְ� �Ǹ�  ����Ű�� �ִ� �ּҰ��� �������°��̴�.
		arraylist = null;
		
		
//		���۷����� �����ϹǷ� ����� ������ null������ ���´�
		System.out.println(arraylist);
		
//		��ü�� �������� �ʱ� ������ ���� ������Ʈ ����
		System.out.println(arraylist.size());
		
		
		
		
		
	}

}
