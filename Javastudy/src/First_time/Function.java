package First_time;

import java.util.Scanner;

public class Function {
//  main �޼ҵ� ��  jvm  �� Ŭ������ ���� �Ҷ�  �������� �˷��ֱ� �����̴� 
	public static void main(String[] args) {
		int i = 1;
//		��¹� (consoleâ)
//		����ϰ� ���� 
		System.out.println(i);
//		����ϰ� ���� ���� ����
		System.out.print(i);

		
//		����� �Է�  �ޱ�                                         // ����ڷ� ���� �Է� �ޱ�  ��ٸ���  System.in �Ű� ���� 
		Scanner sn = new Scanner(System.in);
		int j = sn.nextInt();
//		/////////////////////////
		System.out.println("j �� 3���� �� ������ ��");
		System.out.println("i%3 =" + (j%3));

	}

}
