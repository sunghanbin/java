package children;

import Papa.PapaPouch;

public class FirstChild {
	
	public void takeMoney(int money) {
//	   static ���� ������ PapaPouch�� ���� MONEY �� ��ü�� �������� �ʰ� �ٷ� �����Ҽ��ִ�. ��ü�������� X
//		�Ϲ� class �� �����ͳ� �޼ҵ� ����  PapaPouch ����Ұ�ü�� = new PapaPouch();
//		 Papapouch.MONEY ���� ���������� 
//		static �� �����  ������  PapaPouch.MONEY ó�� �ٷ� ���� ���� �ϴ�.. Ŭ������.�޼ҵ�&������
//		�����Ѵٴ� �ǹ̰� ���⿡ �ְ�  class�� ������  ����Ͽ� ���� �ٲ�� �Ǹ�  static ������ �ٲﰪ�� ��� �ִ´�.
		PapaPouch.MONEY = PapaPouch.MONEY - money;
		if(PapaPouch.MONEY < 0) {
			System.out.println("ū�� ������");
		}
	}

}
