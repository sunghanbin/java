package com.shb.OverrideEx.store;

public class MainClass {
	
	public static void main(String[]args) {
//		�����Ҷ� �����1 �� �ص����� ���� ��ӹް� �ֱ� ������ 
//		���� Ŭ������ ��ü�� Ÿ���� ���� Ŭ������ ��ü Ÿ������  ��밡�� �ϱ� ������ �Ʒ� �� ���� �����ִ�.
		HeadQuaterStore store1 = new Store1();
		System.out.println("==============");
		store1.orderKimChijjige();
		store1.orderBibimBap();
		store1.orderBudeajjige();
		store1.ordersoondeatguk();
		store1.ordergonggibap();
		
		HeadQuaterStore store2 = new Store2();
		System.out.println("==============");
		store2.orderKimChijjige();
		store2.orderBibimBap();
		store2.orderBudeajjige();
		store2.ordersoondeatguk();
		store2.ordergonggibap();
		
		HeadQuaterStore store3 = new Store3();
		System.out.println("==============");
		store3.orderKimChijjige();
		store3.orderBibimBap();
		store3.orderBudeajjige();
		store3.ordersoondeatguk();
		store3.ordergonggibap();
		
		
	}

}
