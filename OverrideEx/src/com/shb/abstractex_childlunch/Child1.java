package com.shb.abstractex_childlunch;
//      ��ġ �޴��� ��� ����
public class Child1 extends LunchMenu {
//                ��ü ������ �Ķ���ͷ� ���� ��
	public Child1(int bulgogi, int rice, int milk, int amond, int banana) {
//		�θ��� �����͸� ����ϱ� ���� superŰ���带 ���ش�
		super(bulgogi, rice, milk, amond, banana);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int cacul() {
		// TODO Auto-generated method stub
		return rice + bulgogi + banana;
	}
	
	

}
