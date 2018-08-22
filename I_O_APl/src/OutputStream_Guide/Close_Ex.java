package OutputStream_Guide;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Close_Ex {
	
	public static void main(String[] args) {
//		3. 전역변수로 해야 모든구문에서 통일하여 사용할수 있기 때문에 여기서 아웃풋 스트림을 생성한다. 
		OutputStream os = null;
		try {
			os = new FileOutputStream("D:\\test.txt");
			String i = "12341242143";
			byte[] bt= i.getBytes();
			os.write(bt);
			
		} catch (Exception e) {
//			1.스트림으로 연결한후 작업이 끝난뒤에는 연결을 끊어줘야 하기 때문에
//			2.try나catch문에 걸려도 실행되게 되어있는 finally 문을 통해서 스트림을 끊어준다.
//			4.if문을 통해 outputstream이 null이 아닐경우에는 연결을 끊는다.
//				outputstream은 위에서 객체를 생성하여 담았기 때문에 정상작동이라면 널값이 될수없다.
			
		}finally {
			try {
				if(os != null) os.close(); 
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
