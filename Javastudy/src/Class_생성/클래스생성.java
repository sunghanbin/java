package Class_����;

public class Ŭ�������� {
	public static void main(String[] args) {
//		��ü�� �����ȵ� ����ü�̱⶧���� ������ �ٸ���
		ManClass mc = new ManClass();
		ManClass mc3 = new 	ManClass(20, 150, 64, "01041619256");
		
//		��ü�� �ν��Ͻ� ������ ������ �����ϵ��� get,set�� �����صа�� �����ϰ� �����ϴ¹�
		mc3.getAge();//�����´�
		mc3.setHeight(182);//�����Ѵ�
//		.equals()<- �� �Ҷ� bool ��ȯ
//		�׷��� �Ʒ��� ���� ���ϰ� �Ǹ� �ٸ����̱� ������ false �� ������ �ȴ� 
		System.out.println(mc.equals(mc3));
		
		double b = mc3.calculateBMI();
	}

}
