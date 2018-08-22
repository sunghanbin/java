package Throws_Exception;

public class ThrowsClass {
//	�⺻ ������
	public ThrowsClass() {
//		1.����Ŭ�������� ThrowsClass �� ��ü�� �����ϰ� �Ǹ� �ٷ� actionC �޼��带 �����Ѵ�.
		actionC();
	}
	private void actionA() throws Exception {
//		4. actionB���� ȣ�� ���� actionA�� ����Ʈ�� ��� ��̸� ��������,
//		��̿��� �ش��ϴ� �ε��� ��ȣ�� ���� �ҷ� ������ ������ 3��° �ε��� ���� �ۿ� �����Ƿ�
//		throws���� �̿� �ڽ��� ȣ���� actionB�� ����.
		System.out.println("actionA");
		
		int[] iArr = {1,2,3,4};
		System.out.println(iArr[4]);
//		*. ���� �������� ������ ���� ������ ���� �Ʒ������� ��������ʴ´�. Throws �� ����ϰԵǾ ȣ��ο��� ����ó������
//		�ٽ� ���ƿ����ʴ´�.
		System.out.println("actionAA");
	}
	
	private void actionB() {
//		3.actionC���� ȣ�� ���� actionB�� ������ ����Ʈ�� ��� try ���� ���� actionA�� ȣ���Ѵ�.
		System.out.println("actionB");
		
		try {
			actionA();
//			5.throws �� �� ���� ����ó�� �ش޶�� ��ȣ�� actionA���� �Ա� ������ catch���� ���� ����
		}catch(Exception e) {
			System.out.println("���� ó���� ���⼭ �ϰڴ�.");
			System.out.println(e.getMessage());
		}
//		6.��������������
		System.out.println("actionBB");
	}
	
	private void actionC() {
//		2.�����ڿ��� �ٷ� ����� actionC�� ����Ʈ�� ��� actionB�� ȣ�� �Ѵ�.
		System.out.println("actionC");
		actionB();
//		7.������ ���� ����
		System.out.println("actionCC");
	}
	

}
