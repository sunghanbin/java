package com.shb.OverrideEx.store;

public class Store1 extends HeadQuaterStore {
	
	@Override
	public void orderKimChijjige() {
		System.out.println("4500원입니다.");
	}
	@Override
	public void orderBudeajjige() {
		// TODO Auto-generated method stub
	   System.out.println("5000원입니다.");
	}
	@Override
	public void ordersoondeatguk() {
		// TODO Auto-generated method stub
		System.out.println("판매하지않습니다");
	}

}
