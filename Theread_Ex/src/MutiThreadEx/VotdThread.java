package MutiThreadEx;

import java.util.Random;

public class VotdThread implements Runnable {
	
	int targetNum = 100;
	int sum = 0;
//	���� Ŭ������ ����ϱ� ���� ��ü ����
	Random random = new Random();

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		��Ʈ�� ���� Ŭ������ ����ϱ� ���� ��ü ����
		StringBuffer sb = new StringBuffer();
		
//		�ݺ���  �극��ũ�� ������ �ʴ� �̻� ��� ���ƾ� �ϱ� ������  true �� ���
		while(true) {
//			 sum�� sum �� 10���� �ȿ��� �������� ���ڸ� ���� �����ش�.
			sum = sum + random.nextInt(10);
//			for�������� ���� ���� �ֱ� ������ �������� �ٽ� �ױ� ���ؼ�  0��°���� ������ ���̸�ŭ ���� �Ѵ�. 
			sb.delete(0, sb.toString().length());
//			����  sum �� targetNum ����ũ�ų� ������ targetNum �� 100 �̴�.
//			 �������� �������� 100���� �����صа��̴�. if���� Ż��� break �� �ֱ� ������ �ݺ����� ������.
			if(sum >= targetNum) {
				sum = 100;
				for(int i = 0; i <sum; i++) {
					sb.append('*');
				}
				System.out.println(Thread.currentThread().getName() + "��ǥ�� :" + sum + "\t" + sb);
				break;
			}else {
//				sum �� ���ڸ�ŭ ���� stringBuffer�� �����ش�.
				for(int i = 0; i <sum; i++) {
					sb.append('*');
				}
				System.out.println(Thread.currentThread().getName() + "��ǥ�� :" + sum + "\t" + sb);
			}
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
			}
			
		}
		
	}
	
	


