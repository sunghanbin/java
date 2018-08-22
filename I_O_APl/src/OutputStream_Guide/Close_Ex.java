package OutputStream_Guide;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Close_Ex {
	
	public static void main(String[] args) {
//		3. ���������� �ؾ� ��籸������ �����Ͽ� ����Ҽ� �ֱ� ������ ���⼭ �ƿ�ǲ ��Ʈ���� �����Ѵ�. 
		OutputStream os = null;
		try {
			os = new FileOutputStream("D:\\test.txt");
			String i = "12341242143";
			byte[] bt= i.getBytes();
			os.write(bt);
			
		} catch (Exception e) {
//			1.��Ʈ������ �������� �۾��� �����ڿ��� ������ ������� �ϱ� ������
//			2.try��catch���� �ɷ��� ����ǰ� �Ǿ��ִ� finally ���� ���ؼ� ��Ʈ���� �����ش�.
//			4.if���� ���� outputstream�� null�� �ƴҰ�쿡�� ������ ���´�.
//				outputstream�� ������ ��ü�� �����Ͽ� ��ұ� ������ �����۵��̶�� �ΰ��� �ɼ�����.
			
		}finally {
			try {
				if(os != null) os.close(); 
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
