package staticex;

import Papa.PapaPouch;
import children.FirstChild;
import children.SecondChild;
import children.ThirdChild;

public class MainClass {
	
	public static void main(String[] args) {
		
		FirstChild firstchild = new FirstChild();
		firstchild.takeMoney(100);
		
		SecondChild secondchild = new SecondChild();
		secondchild.takeMoney(100);
		
		ThirdChild thirdchild = new ThirdChild();
		thirdchild.takeMoney(100);
		
		System.out.println("papapouch_money" + PapaPouch.MONEY);
	}

}
