package Quiz;

public class Quiz_while�� {

	public static void main(String[] args) {
//		1���� 100������ ���� �� 3�� ��� ���� ���غ���
		int hap = 1;
		int haps1 = 0;
		while(hap <=100) {
			int haps = hap%3;
			if(haps == 0) {
				haps1+= hap;
				System.out.println(hap);
			}
			hap++;
		}
		System.out.println("����"+haps1);
		

	}

}
