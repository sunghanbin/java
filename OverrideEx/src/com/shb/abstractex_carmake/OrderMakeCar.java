package com.shb.abstractex_carmake;

public class OrderMakeCar extends Hyundai{
	
	private int tax = 1000;

	public OrderMakeCar(String color, String tire, int displacement, String handle) {
		super(color, tire, displacement, handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Spec() {
		System.out.println("===================");
		System.out.println("����:"+color);
		System.out.println("Ÿ�̾�:"+tire);
		System.out.println("��ⷮ:"+displacement);
		System.out.println("�ڵ�:"+handle);
		if(displacement>2000) tax = 2000;
		System.out.println("����:"+tax);
		System.out.println("=======================");
		
	}
	
	
	
	
	

}
