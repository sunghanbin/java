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
//			 바이트 배열 클래스로 객체 생성
			byte[] bs = new byte[5];
			
			while(true) {
//				       읽어온byte형태의 데이터를 int변수에 담아 
//				-1 이나오면(데이터를 다읽으면 -1을 반환함) if문에 걸릴수있게     = 5byte씩 읽어 오겠다.
				int count = is.read(bs);
//				 -1검사   나오면 브레이크
				if(count == -1)break;
//				os.write(5byte씩 쓰겠다,0,위에 while문이 돌면서 데이터를 5byte 씩 가져오지만
//				만약 5byte보다 적게 나온 데이터 라면 (예:3byte)count에 3byte가 입력 되고 범위가 0부터3으로 설정되어
//				그만큼만 메모리를 사용한다. 5byte모두사용하지 않고)
				os.write(bs,0,count);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(is != null) {
//				close도 io 메서드 이므로 try문에 넣어서 해야함
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
