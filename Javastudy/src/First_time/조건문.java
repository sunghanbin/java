package First_time;

import java.util.Scanner;

public class ���ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 20;
		int t = 30;
		
//		  ��� ///
		  
//		  if
		  
		  if(i > j) {
			  System.out.println("i�� j���� Ů�ϴ�..");
		  }
		  
		  if(i==t) {
			  System.out.println("i�� t �� ���� ");
		  }
		  
		  if(i>j) {
			  System.out.println("i�� j����"+ (i - j) + "��ŭ �� Ů�ϴ�");
		  }else {
			  System.out.println("j�� i����" + (j - i) + "��ŭ ��Ů�ϴ�");
		  }
		  
		 Scanner sc = new Scanner(System.in);
		 int seoulLunchPrice = sc.nextInt();
		 
		 if(seoulLunchPrice >= 9000) {
			 System.out.println("���� ���� ��γ׿�");
		 }else if(seoulLunchPrice >= 7000) {
			 System.out.println("���� ���� ���ݺ�γ׿�");
		 }else if(seoulLunchPrice >= 5000) {
			 System.out.println("���� ���� �����׿�!");
		 }else {
			 System.out.println("���� ���� �γ׿�!");
		 }*/
		 
		 
//		 swith  if �� ���� �������� ����
		 
		 Scanner swisc = new Scanner(System.in);
		 int swi = swisc.nextInt();
		 int swic = swi % 2;
		 
		 switch (swic) { // ���ǰ��� �־� �ش� (swic) 
		 case 0:// 0�̸� ���� �ض�
			 System.out.println("¦�� �Դϴ� ");
			 break;// switch ������ �������� break
		 case 1:// 1�̸� �����ض�
			 System.out.println("Ȧ�� �Դϴ�");
			 break;
			 
		default:// 0���ƴϰ� 1�� �ƴϸ� �����ض�
			System.out.println("����");
			break;
		 }
		  
//		 \n ����
//		 \t ���� ��� 

	}

}
