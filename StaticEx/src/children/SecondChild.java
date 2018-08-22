package children;

import Papa.PapaPouch;

public class SecondChild {
	
public void takeMoney(int money) {
		
		PapaPouch.MONEY = PapaPouch.MONEY - money;
		if(PapaPouch.MONEY < 0) {
			System.out.println("µÑÂ° µ·¸øÁÜ");
		}
	}

}
