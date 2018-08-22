package InputStream_Guide;

import java.io.FileInputStream;
import java.io.InputStream;

public class inputSt {

	public static void main(String[] args) {
//		InputStream
//		1.Inputstream �� �߻�Ŭ���� �� ����Ŭ�����鿡�� ���� �Ǿ��ִ�.
//		2. inputstream �� �о�� ������ �� ���� ���ִ� ��Ȱ�� �Ѵ�.
//		  _____________							 ______________
//		 | inputstream |----------����-----------|    ������	  |
//		 |_____________|---------�б� read()------|_____________|
//		3. �о� ���� ���� read()�� �о�´�
//		4. read()��  read(byte[]) �ִ�.
//		   a. read()�� 1byte �� �о���� 
//		   b. read(byte[])�� ����Ʈ �迭�� ũ�⸸ŭ �о�´�. ������!
//		5.  ����� Ŭ������ ����ó������ try~ catch �ȿ��� �ۼ��ؾ��Ѵ�.
		
		try {
//			���ᱸ��
//			������Ÿ���� ��ǲ��Ʈ�� ���� ���� ������ǲ��Ʈ�� ���� ��ü ����(���)��μ����� ���丮���̸��� �������� 2��
			InputStream is = new FileInputStream("D:\\test.txt");
//			���ѷ����� �����ؼ� read�޼���� �����͸� ���о� ������ -1�� ��ȯ�ϱ� ������ 
//			if ���� ���ؼ� �����Ͱ� -1�� ���´ٸ� if�� �� Ÿ�� �극��ũ�� �ɾ while�� �� Ż���Ѵ�.
//			�����͸� �о� ���� ���´� byte���·� �о�´�.
			while(true) {
				int i = is.read();
				System.out.println("������"+i);
				if(i== -1) break;
			}
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
		}
	}
}
