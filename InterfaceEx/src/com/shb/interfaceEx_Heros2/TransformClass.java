package com.shb.interfaceEx_Heros2;

public class TransformClass {
	
	public static void main(String[]args) {
		
		I_Actor Actor = new I_Actor();
		Actor.findingcriminal();
		Actor.findingitem();
		Actor.Fireoff();
		Actor.Humanrescue();
		Actor.makepizza();
		Actor.makespagetti();
		
		Cook Cactor = new I_Actor();
		Cactor.makepizza();
		Cactor.makespagetti();
//		Cactor.Humanrescue(); 안됨 메서드접근제한 효과
				
		}
		
	}

