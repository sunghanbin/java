package Quiz;

public class Quiz_�⺻2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1���� 10������ ������ ¦�� �Ǵ� Ȧ������ ���� ���غ���.
		int sums1 = 0;
		int sums2 = 0;
		for(int sum2=1;sum2 <= 10; sum2++) {
			int sum3 = sum2 % 2;
			switch(sum3) {
			case 0 :
				sums1+=sum2;
				break;
			default :
				sums2+=sum2;
				break;
			}
		}
		System.out.println("¦����"+sums1);
		System.out.println("Ȧ����"+sums2);
		
		

	}

}
