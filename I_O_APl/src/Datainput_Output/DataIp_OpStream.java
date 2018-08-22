package Datainput_Output;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class DataIp_OpStream {
	
	public static void main(String[] args) {
//		DataInputStream 과 DataOutputStream
//		byte단위로 읽어온 Input,outputStream 과 달리 데이터를 한번에 while문없이 읽어올수있다.
		
		InputStream is = null;
		OutputStream os = null;
		
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try {
			is = new FileInputStream("D:\\str.txt");
//			is 의 객체를 데이터인풋 에담아 다시 객체를 생성하고
			dis = new DataInputStream(is);
//			반복문을 사용하지않고 바로 읽어올수있다.
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
