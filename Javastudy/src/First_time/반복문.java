package First_time;

public class �ݺ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 for �ݺ�
		 
		 for (int fori=0; fori < 10; fori++) {
			 int forresult = fori + 10;
			 System.out.println("fori��"+ fori +"�Դϴ�.\n"+"10 + fori" + forresult);
			 }
		 
//		 for �������� break
		 
		 for (int foriB=0; foriB < 5; foriB++) {
			 System.out.println("foriB��"+ foriB +"�Դϴ�.");
			 if(foriB >= 3) break; // ���๮�� �ϳ��� ��� �������� ������    {} ������� �ʾƵ�  �ȴ� 
		 }
		 
//		 continue ��Ƽ�� ������  �ٽ� ���ΰ��� ���� �Ѵ�.
		 for (int foriB=0; foriB < 5; foriB++) {
			 System.out.println("foriB��"+ foriB +"�Դϴ�.");
//			 continue; ���⿡ ���ָ� �Ʒ� if ���� ����������  ��Ƽ�� �� �ٽ����ΰ��� ���� �϶�� �ǹ� �̱⶧���� if���� ���� �Ҽ������� �����̴�. ���������ǹ�/����ϴ�
			 if(foriB >= 3) break;
			 
		 }
		 
//		 while ������ �����ϳ��� �̿��Ͽ� ������ ������ ////// for������ ���̴� ���ǹ��� �������� ���๮���� ���ش�??
		 int l = 1;
		 while(l <=10) {
			 System.out.println("i��"+l +"�Դϴ�");
			 l++;
		 }

	}

}
