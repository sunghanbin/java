package Quiz;

import java.util.Scanner;

public class Quiz_�޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�˰���� ������ ���ڸ� �Է��ϼ���");
		int input = sc.nextInt();
		
//		���� �޼ҵ忡�� �ٷ� gugudan �޼ҵ带 ����Ҽ� ���� ������ �޼ҵ��� �ش�Ŭ������ ã�Ƽ� ��ü�� �ϳ���������� ����Ҽ��ִ�.
		
		Quiz_�޼ҵ� gugu = new Quiz_�޼ҵ�();
//		��ü�� �޼ҵ带 ȣ���ϴ¹� ȣ���
		gugu.gugudan(input);

	}
	public void gugudan(int i) {
		for(int j= 1; j<10; j++) {
			int sum = i*j;
			System.out.println(i+"*"+j+"="+sum);
		}
	}
}
