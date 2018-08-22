package com.shb.abstractex_carmake;

public class MainClass {
	
	public static void main(String []args) {
		
		Hyundai Granger = new OrderMakeCar(ChoiceOption.COLOR_BLUE, ChoiceOption.TIRE_WILD, ChoiceOption.DISPLACEMENT_2500, ChoiceOption.HANDLE_POWER);
		Hyundai Sonata = new OrderMakeCar(ChoiceOption.COLOR_RED, ChoiceOption.TIRE_NOMAL, ChoiceOption.DISPLACEMENT_2000, ChoiceOption.HANDLE_NOMAL);
		
		System.out.println("그랜져");
		Granger.Spec();
		System.out.println("소나타");
		Sonata.Spec();
		
	}

}
