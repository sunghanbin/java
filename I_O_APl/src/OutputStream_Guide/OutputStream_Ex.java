package OutputStream_Guide;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStream_Ex {
	
	public static void main(String[] args) {
//		OutputStream
//		1. inputstream�� ���� �߻� Ŭ���� ��, ���� Ŭ�������� �����Ѵ�.
//		2. write()�޼��带 �̿��� �����͸� ����.
//		3. write(),write(byte[]),write(byte[],int,int)�޼��� ���ִ�.
//			a.write()�� 1byte�� ���Եǰ�
//			b.write(byte[]) �迭�� ���� ��ŭ ����
//			c.write(byte[],int,int)�� �迭�� ũ�⸸ŭ ���� ���� 5byte,0,2 ��� 5byte�� ������ 5byte���� �����ϰ�
//			���Դٸ� �ٸ�byte�� �����ʰ� 0~2byte ������� �ǹ�??
		
		try {
//			                                                                               ���� �ش��ϴ� ������ ���ٸ� ������ ���� ����
			OutputStream os = new FileOutputStream("D:\\test.txt");
//			��ο� ���� ���ڿ��� ���ڸ� ������ ����ش�.
			String st = "������ ������ ������";
//			byte�� ����ϱ� ������ String Ŭ������ �ִ� getBytes�޼��带 ����� ���ڿ��� �ϳ��ϳ� ����Ʈ�� �ٲ�
//			����Ʈ �迭 ������ �־��ش�.
			byte[] bs = st.getBytes();
//			write�� ����� �������� �� ����Ʈ�迭������ �־� �ش�.
			os.write(bs);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
