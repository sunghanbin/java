package com.shb.abstractex_carmake;

public class MainClass {
	
	public static void main(String []args) {
		
		Hyundai Granger = new OrderMakeCar(ChoiceOption.COLOR_BLUE, ChoiceOption.TIRE_WILD, ChoiceOption.DISPLACEMENT_2500, ChoiceOption.HANDLE_POWER);
		Hyundai Sonata = new OrderMakeCar(ChoiceOption.COLOR_RED, ChoiceOption.TIRE_NOMAL, ChoiceOption.DISPLACEMENT_2000, ChoiceOption.HANDLE_NOMAL);
		
		System.out.println("�׷���");
		Granger.Spec();
		System.out.println("�ҳ�Ÿ");
		Sonata.Spec();
		
	}

}
