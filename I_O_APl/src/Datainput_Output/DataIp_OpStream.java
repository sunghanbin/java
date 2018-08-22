package Datainput_Output;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class DataIp_OpStream {
	
	public static void main(String[] args) {
//		DataInputStream �� DataOutputStream
//		byte������ �о�� Input,outputStream �� �޸� �����͸� �ѹ��� while������ �о�ü��ִ�.
		
		InputStream is = null;
		OutputStream os = null;
		
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try {
			is = new FileInputStream("D:\\str.txt");
//			is �� ��ü�� ��������ǲ ����� �ٽ� ��ü�� �����ϰ�
			dis = new DataInputStream(is);
//			�ݺ����� ��������ʰ� �ٷ� �о�ü��ִ�.
			String str = dis.readUTF();
			
			os = new FileOutputStream("D:\\testcopy.txt");
			dos = new DataOutputStream(os);
			dos.writeUTF(str);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
//			if(is != null) {
//				try {
//					is.close();
//				} catch (Exception e2) {
//					// TODO: handle exception
//					System.out.println(e2.getMessage());
//				}
//			}
			if(dos != null) {
				try {
					dos.close();
				} catch (Exception e5) {
					// TODO: handle exception
					System.out.println(e5.getMessage());
				}
			}

			
			if(os != null) {
				try {
					os.close();
				} catch (Exception e3) {
					// TODO: handle exception
					System.out.println(e3.getMessage());
				}
			}
			
//			if(dis != null) {
//				try {
//					dis.close();
//				} catch (Exception e4) {
//					// TODO: handle exception
//					System.out.println(e4.getMessage());
//				}
//			}
			
		}
		
		
	}

}
