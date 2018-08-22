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
		System.out.println("색상:"+color);
		System.out.println("타이어:"+tire);
		System.out.println("배기량:"+displacement);
		System.out.println("핸들:"+handle);
		if(displacement>2000) tax = 2000;
		System.out.println("세금:"+tax);
		System.out.println("=======================");
		
	}
	
	
	
	
	

}
