package Make_Frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
<<<<<<< HEAD
import java.awt.Label;
=======
>>>>>>> 95c50fc6c1c423387c91fdc14b7fb8d6367d5335
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
<<<<<<< HEAD
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
=======
>>>>>>> 95c50fc6c1c423387c91fdc14b7fb8d6367d5335


//                     ������Ʈ�� ����ϱ� ���� Frame��� �ް�
//									�̺�Ʈ�� �����ϱ� ���� ActionListener �� ���ø���Ʈ �Ѵ�
//									�׼Ǹ����ʸ� ���ø���Ʈ �ϰԵǸ� �߻�޼ҵ� actionPerformed ��
//									�ݵ�� ���� �ؾ��Ѵ�.
public class MakeFrame extends Frame implements ActionListener {

//	�ܺο��� �����͸� ������ ������ �����ϱ����� private ���
	
//	����Ʈ ������
//		�ڷ��� ����  �����̸�
	private List list;
//	�г� ������
	private Panel panel;
//	�ؽ�Ʈ �ʵ� ������
	private TextField Text;
//	Ȯ�� ��ư ������
	private Button btnok;
//	������ ��ư ������
	private Button btnexit;
	
	

	public MakeFrame() {
//	�ܺο��� ��ü�� ���� �ϸ� �ٸ� �޼��� �� ��������ʰ� �ٷ� ���� �Ҽ� �ֵ��� ����Ʈ �����ڿ��� ���� �ۼ�
		
//		 ���� ������ ���� �����Ϳ� ��ü ����
		list = new List();
		panel = new Panel();
		Text = new TextField();
		btnok = new Button("OK");
		btnexit = new Button("EXIT");
		
//		Frame �� �ִ� �޼��� �Ķ���Ϳ� BorderLayout �̶�� ��ü�� ����
//		���� ����� ���� ������Ʈ���� ��ġ�ϱ� ���ؼ� �����Ѵ�.
		setLayout(new BorderLayout());
		
//		add�� Frame�� �޼���ν� ������Ʈ���� ������ ���� �ø� ���ֱ� ������ ������ �� �߰� �Ѵٴ� 
//		�߰��� �ϴµ� � ������ ���̾ƿ��� �����ġ�� �Ѱ����� ���Ѵ� north ���� ���� ����� �ǹ��Ѵ�.
		add(panel,BorderLayout.NORTH);
<<<<<<< HEAD
//		BorderLayout ��  ���Ϳ� ����Ʈ�� �߰� �ϰڴ�.
		add(list,BorderLayout.CENTER);
		
//		�Ʒ��ۼ� ������ �����ӿ� �ö� panel ���� �� �߰� ��ų ������Ʈ��
//		         �� ��ü�� �����Ͽ� panel ���� �÷��ش�.
		panel.add(new Label("write"));
		panel.add(Text);
		panel.add(btnok );
		panel.add(btnexit);
		
		
//		��ư ������ �� �̺�Ʈ �߰� 
//		addActionListener - ���� ������Ʈ�� �߰��Ѵ� ��� �̺�Ʈ�� �����ϵ��� 
//		addActionListener�� �Ķ���Ϳ� interface �� ActionListener ��ü�� ���� �ϰԵǸ� �����ؾ��ϴ�  actionPerformed �޼ҵ尡 �����ȴ�
//		
		btnok.addActionListener(new ActionListener() {
//			���⼭ ���� ����
//			 
			@Override
//			ActionEvent ��ư�� ������ ������ �Ķ���Ϳ� ������
			public void actionPerformed(ActionEvent e) {
//			����Ʈ�� �߰� �ض�(�ؽ�Ʈ�ʵ忡 �ִ� �ؽ�Ʈ�� �����ͼ�)
				list.add(Text.getText());
				
			}
		});
		
		
		
		btnexit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				ȭ�� ������ �ʰ�
				setVisible(false);
//				�������� ������ �޸𸮻� �����ϱ⿡ ���ڿ����� ȸ��
				dispose();
//				���α׷� ����
				System.exit(0);
				
			}
		});
		
//		�̰��� ���α׷��� �����츦 �����ϱ����� ����
		
		addWindowListener(new WindowAdapter() {
//			 x��ư�� ������ ������ 
			@Override
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		
		
		
		

		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
=======
		
		
		
>>>>>>> 95c50fc6c1c423387c91fdc14b7fb8d6367d5335
	}
	
	
	
	
	
	
	
	
	
	
<<<<<<< HEAD

=======
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
>>>>>>> 95c50fc6c1c423387c91fdc14b7fb8d6367d5335

}
