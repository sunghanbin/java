package Make_btn;

import java.awt.Dimension;

public class MainClass {
	
	public static void main (String[]args){
//		pack(): ������Ʈ�� ������ == �⺻������
//		setSize(): ������Ʈ ����� �����ڰ� ����
//		setVisible(true): ȭ�鿡 �����
//		dispose(): �ڿ� ���� Visible(false) �Ͽ��� �� ȭ��󿡸� ������ ����
//		������ �޸� �󿡼� �ڿ��� ����ϱ� ������ �ڿ������� ������Ѵ�.
//		System.exit(): ���ø����̼� ����
		
//		��ư ��ü ����  �ϸ� �����ӿ� ������
		Button_ex btt = new Button_ex();

//		�⺻������� ����
		btt.pack();
		
//		�����ڰ� ����                ����,����
		btt.setSize(new Dimension(200,200));
//		ȭ�鿡 ���̰� �ϱ�(true) 
		btt.setVisible(true);
		
//		2�� ��� 
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
//		������ �ʰ�	
			btt.setVisible(false);
//			�ڿ�����
			btt.dispose();
//			2�� ���
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
//		���μ���  ����
		System.exit(0);
	}

}
