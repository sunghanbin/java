package Try_catch;

public class Finally_ex {
	public static void main(String[] args) {
		int[] iaa = {1,2,3};
		
//		finally �� try ������ ����Ǵ���, catch ������ ���� �Ǵ��� ������� ������ ���� �ϴ� �����̴�.
//		���ܰ� �߻��ϴ� ���ܰ� �߻����� �ʴ� ������ ����
		
		try {
			System.out.println("************************");
			System.out.println(iaa[3]);
			System.out.println("======================");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("������ ���� ��");
		}
	}

}
