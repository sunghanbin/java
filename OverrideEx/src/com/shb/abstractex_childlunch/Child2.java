package com.shb.abstractex_childlunch;

public class Child2 extends LunchMenu {

//  ��ü ������ �Ķ���ͷ� ���� ��
public Child2(int bulgogi, int rice, int milk, int amond, int banana) {
//�θ��� �����͸� ����ϱ� ���� superŰ���带 ���ش�
super(bulgogi, rice, milk, amond, banana);
// TODO Auto-generated constructor stub
}

// �߻� Ŭ���� �����Ƿ� �ݵ�� ���⼭ ������ �Ͽ� ����Ѵ�. ���̵鸶�� ���� ������ �ٸ��� ����
@Override
public int cacul() {
// TODO Auto-generated method stub
return rice + bulgogi + milk + amond;
}
}
