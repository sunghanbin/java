package com.shb.abstractex_childlunch;

public class MainClass {
	
	public static void main(String[]args) {
// ��ӹ��� ��ü���� �θ�Ŭ������ ��üŸ������ ���� �����ϴ�  �����ڿ��� �Ķ���� �� �ޱ�� �Ǿ� �ֱ� ������ �Ķ���� �� �����̽����̺�
//		�� ���� �־� ������ ������ �˷��ش�.
		LunchMenu child1 = new Child1(PriceTable.BOLGOGI,PriceTable.RICE,PriceTable.MILK,PriceTable.AMOND,PriceTable.BANANA);
		LunchMenu child2 = new Child2(PriceTable.BOLGOGI,PriceTable.RICE,PriceTable.MILK,PriceTable.AMOND,PriceTable.BANANA);
		
		
//		 ������ ��ü�� �ִ� ��� �޼ҵ带 ����Ͽ� ����� ���� ���� ���ش�.
//		�̷��� ����� �����Ѱ��� ������ ��ü�� �����Ҷ� �Ķ���� ���� �����̽� ���̺� ���İ��� �־� �����Ͽ��⿡ ���� �Ǿ� �ִ°� ���ĺ��� ����
//		�����̽� ���̺��� ������ ���� �� �����Ѱ��̴�
		System.out.println("ù��° ������ �Ĵ��:"+child1.cacul());
		System.out.println("�ι��� ������ �Ĵ��:"+child2.cacul());
	}

}
