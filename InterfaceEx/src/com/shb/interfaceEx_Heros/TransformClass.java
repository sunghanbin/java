package com.shb.interfaceEx_Heros;

public class TransformClass {
	
	public static void main(String[]args) {
		
		I_Actor fireFighter = new FireFighter();
		I_Actor cook = new Cook();
		I_Actor police = new Police();
		
		I_Actor[] select = {fireFighter,cook,police};
		for(int i = 0; i<select.length;i++) {
			select[i].Aability();
			select[i].Bability();
			System.out.println("====================");
		}
		
	}

}
