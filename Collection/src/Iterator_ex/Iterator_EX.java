package Iterator_ex;

import java.util.ArrayList;
import java.util.Iterator;



public class Iterator_EX {
	
	public static void main(String[]args) {
//		Iterator��� �ǹ̴� '�ݺ���' ��� �ǹ̷� �����͸� �ݺ������� �˻��ϴµ� ������ �������̽�
//		��� �ڷᱸ������ iterator()�޼ҵ带 ���� �Ѵ�.
		
//		ArrayList������ iterator ���
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		arrayList.add("str4");
		
//		 ���ͷ����� Ŭ������ ������Ÿ���� ���ڿ� �̸� ��� ����Ʈ�� ���ͷ����͸� ���� ��ü��  ����
		Iterator<String> itera = arrayList.iterator();
//		      hasNext ����: ������ �ִ�. :::: �ݺ��� ���� ������ �ִٸ� true�� ��ȯ while���� ����.
		while(itera.hasNext()) {
//			                        .�ݺ����� �������� �����ش�.
			System.out.println(itera.next());
		}
	
		
	}

}
