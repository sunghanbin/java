package com.shb.Strategy_Pattern;

import com.shb.Strategy_Pattern_Ex.IFly;
import com.shb.Strategy_Pattern_Ex.IKnife;
import com.shb.Strategy_Pattern_Ex.IMisil;

public abstract class BasicRobot {
//	interface Ÿ������ ������ ������ �ش�.
//	interface �� ������ ������ �������̽��� ���ø���Ʈ �ϰ� �ִ� Ŭ���� ���� �����Ͽ� ����Ҽ� �ֱ� �����̴�
	IFly fly;
	IMisil misil;
	IKnife knife;
	
	public abstract void Shape();
	
	public void ActionRun() {
		System.out.println("�޸���");
		
	}
	
	public void ActionWalk() {
		System.out.println("�ȱ�");
	}

	
//	seter�� ���ؼ� ���� ��ǰ���� ��ǰ�� ������ �� �� ���ϴ� ��ǰ�� ����Ҽ� �ֵ��� ��������� ���
	
//	                   �������̽��� IFly Ÿ�Ը� �Ķ���Ͱ� �޴´�
	public void setFly(IFly fly) {
//		�ڱ��ڽ� ���� fly�� �Ķ���ͷ� ���� fly�� �Ҵ��Ѵ�.
		this.fly = fly;
	}

	public void setMisil(IMisil misil) {
		this.misil = misil;
	}

	public void setKnife(IKnife knife) {
		this.knife = knife;
	}
	
	public void ActionFly() {
//		set�� �̿��� ���ϴ� ��ǰ�� �Ҵ��� ���� ���� ���� �޼���,�����
		
//		�ڱ��ڽ���.���� fly�� set�� �̿��� �ٲ��ֱ� ������ ���� ��ǰ�� �޼��尡 ���� �ȴ�.���ϴ� ��ǰ�� �޼���
		this.fly.Fly();
	}
	
	public void ActionMisil() {
		this.misil.Misil();
	}
	public void ActionKnife() {
		this.knife.Knife();
	}

}
