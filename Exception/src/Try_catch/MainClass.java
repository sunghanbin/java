package Try_catch;

public class MainClass {
	
	public static void main(String[] args) {
		int i = 10;
		int j =  2;
		
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j);
		
//		���� ó�� ���� try~ catch
//		�и� 0�ΰ�� ������ �� �Ҽ� �����Ƿ� �Ʒ� ����Ʈ ������ ���ϱ� ������ ���� �ǰ� ���� ������ �Ʒ� ����� ���ϱ�� ����
//		���� ���� ���̴�.
//		�̷��� ���� ������ �̻��� �ִ��� ���� �Ʒ� ������ ���� �Ҽ� �ְ� ���ִ� ���� try~ catch ���̴�.
		int a = 10;
		int b = 0;
		
		System.out.println(a + b);
		try {// ������ �߻��Ҽ� �ִ� ������ ����Ѵ�.
		System.out.println(a / b);
//		               �ͼ��� ��ü�� �Ķ���͸� �ްڴ�.
		}catch(Exception e){ // try{}�ȿ��� ������ �߻� ������ ��ó����� ����Ѵ�.
//			.getMessage() � �������� �����ִ� �ͼ��� Ŭ�������� �޼��� 
			System.out.println(e.getMessage());
//			.printStackTrace() ���� �����޼����� �����ִ� �޼���
//			e.printStackTrace();
		}
		System.out.println(a - b);
		System.out.println(a * b);
		
		
//////////////////////////////////////////////////////////////////////////////////////////
		
//		try~ catch  catch���� ����ó���� ���� �� �� ���� �ֽ��ϴ�.
		
		try {
			
		}catch(ArrayIndexOutOfBoundsException f) {
			
		}catch(NumberFormatException c) {
			
		}catch(Exception e) {
			
		}
		
		
	}

}
