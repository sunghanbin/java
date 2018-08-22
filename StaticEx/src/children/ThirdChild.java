package children;

import Papa.PapaPouch;

public class ThirdChild {
	
	
public void takeMoney(int money) {
		
		PapaPouch.MONEY = PapaPouch.MONEY - money;
		if(PapaPouch.MONEY < 0) {
			System.out.println("¸·³» µ·¸øÁÜ");
		}
	}

}
