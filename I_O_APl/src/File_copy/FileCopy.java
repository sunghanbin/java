package File_copy;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
public class FileCopy {
	
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("D:\\test.txt");
			os = new FileOutputStream("D:\\test_copy.txt");
//			 ����Ʈ �迭 Ŭ������ ��ü ����
			byte[] bs = new byte[5];
			
			while(true) {
//				       �о��byte������ �����͸� int������ ��� 
//				-1 �̳�����(�����͸� �������� -1�� ��ȯ��) if���� �ɸ����ְ�     = 5byte�� �о� ���ڴ�.
				int count = is.read(bs);
//				 -1�˻�   ������ �극��ũ
				if(count == -1)break;
//				os.write(5byte�� ���ڴ�,0,���� while���� ���鼭 �����͸� 5byte �� ����������
//				���� 5byte���� ���� ���� ������ ��� (��:3byte)count�� 3byte�� �Է� �ǰ� ������ 0����3���� �����Ǿ�
//				�׸�ŭ�� �޸𸮸� ����Ѵ�. 5byte��λ������ �ʰ�)
				os.write(bs,0,count);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(is != null) {
//				close�� io �޼��� �̹Ƿ� try���� �־ �ؾ���
				try { is.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			if(os != null) {
				try {os.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		
	}

}
