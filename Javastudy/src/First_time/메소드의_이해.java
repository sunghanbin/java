package First_time;

public class �޼ҵ���_���� {
	
//	����������: public = ������ �����Ͽ� ��밡���ϴ�
//	         ��ȯŸ��:��ȯ�� �����ʴ� �޼ҵ� Ÿ���� void ���
//	                           �Ķ���Ͱ� = �������� ����Ѵ�.
	public int sum(int i,int j) {
		int r = 0;
	for (int h = i; h <=j; h++) {
		r=r +h;
	}
	return r;
	}
//	���������� : private = ������ class������ �����Ͽ� ��밡���ϴ�
	private int sum(int i,int j) {
		int r = 0;
	for (int h = i; h <=j; h++) {
		r=r +h;
	}
	return r;
	}

}
