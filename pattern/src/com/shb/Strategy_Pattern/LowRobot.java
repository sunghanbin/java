package com.shb.Strategy_Pattern;

import com.shb.Strategy_Pattern_Ex.FlyNo;
import com.shb.Strategy_Pattern_Ex.IFly;
import com.shb.Strategy_Pattern_Ex.IKnife;
import com.shb.Strategy_Pattern_Ex.IMisil;
import com.shb.Strategy_Pattern_Ex.KnifeEmpty;
import com.shb.Strategy_Pattern_Ex.MisilNo;

public class LowRobot extends BasicRobot {

public LowRobot() {
	// TODO Auto-generated constructor stub
//	���� ���θ޼��忡������ �Ҷ� seter�� �̿��� �Ҵ��� ���� �ʰ� ���� ������ �� ��Ȳ�� ����ϱ����� ����Ʈ������ ��������
	fly = new FlyNo();
	misil = new MisilNo();
	knife = new KnifeEmpty();
	
}

@Override
public void Shape() {
	// TODO Auto-generated method stub
	System.out.println("�����ѷκ��Դϴ�.�ȴٸ�,�Ӹ�,��������");
}

}
