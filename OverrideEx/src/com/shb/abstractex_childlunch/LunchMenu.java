package com.shb.abstractex_childlunch;
//  �߻�Ŭ������ ����
public abstract class LunchMenu {
//	������ ����
	public int bulgogi;
	public int rice;
	public int milk;
	public int amond;
	public int banana;
//	 �����ڿ���  �Ķ���ͷ� ���� �� ����
	public LunchMenu(int bulgogi,int rice,int milk,int amond,int banana) {
		// TODO Auto-generated constructor stub
//		���� Ŭ�������� ������ �ִµ����� �� ������ �ȿ��� �Ҵ�
		this.bulgogi = bulgogi;
		this.rice = rice;
		this.milk = milk;
		this.amond = amond;
		this.banana = banana;
	}
//	���̵��� ���� ������ ���� �ٸ��� ������ ��ӹ��� Ŭ�������� �ݵ�� ������ �Ͽ� ��� �Ҽ��ְ�  �߻�Ŭ������ ����
	public abstract int cacul();

}
