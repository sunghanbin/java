package Quiz;

import java.util.Scanner;

public class Quiz_�迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
//		�迭�� �̿��Ͽ� �л���(����,ö��,�浿,����,����)�� Ű�� �Է��ϰ� , ���ġ�� ���� ���� 
		
		String[] student = {"����","ö��","�浿","����","����"};
		int[] height = new int[4];
		int sum = 0;
		
		Scanner Arrsc = new Scanner(System.in);
		
		for(int i = 0; i<student.length; i++ ) {
			System.out.print(height[i] +"Ű�� �Է��ϼ��� :");
			height[i] = Arrsc.nextInt();
			System.out.println(student[i]+ "�л��� Ű��" + height[i] + "�Դϴ�");
			
		}
		for (int j : height) {
			sum += j;
		}
		
		double aver = sum/height.length;
		System.out.println("�л����� ��� Ű�� :"+ aver);
		

	}

}
