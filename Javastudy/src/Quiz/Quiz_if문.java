package Quiz;

import java.util.Scanner;

public class Quiz_if�� {
	
	public static void main(String[] args) {
		
//		if �� quiz
//		����ڷ� ���� ����,����,���� ������ �Է� �޾�, �� ���� ������ ����̻����� �������� ���غ��� 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ �Է� �ϼ���.");
		
		int Ko = sc.nextInt();
		
        System.out.print("���� ������ �Է� �ϼ���.");
		
		int En = sc.nextInt();
        System.out.print("���� ������ �Է� �ϼ���.");
		
		int Math = sc.nextInt();
		
		double avg = (Ko + En + Math)/3;
		System.out.println("���������"+avg+"�Դϴ�.");
		
		if(Ko >= 90) {
			System.out.println("������� ���� �����ϴ�");
		}else if(Ko >= 60) {
			System.out.println("��������Դϴ�");
		}else {
			System.out.println("������պ��� �����ϴ�");
		}
		
		if(En >= 90) {
			System.out.println("������� ���� �����ϴ�");
		}else if(En >= 60) {
			System.out.println("��������Դϴ�");
		}else {
			System.out.println("������պ��� �����ϴ�");
		}
		
		if(Math >= 90) {
			System.out.println("���� ��� ���� �����ϴ�");
		}else if(Math >= 60) {
			System.out.println("���� ����Դϴ�");
		}else{
			System.out.println("���� ��պ��� �����ϴ�");
		}
		
	}
}