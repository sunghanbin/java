package OutputStream_Guide;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStream_Ex {
	
	public static void main(String[] args) {
//		OutputStream
//		1. inputstream과 같이 추상 클래스 로, 하위 클래스에서 구현한다.
//		2. write()메서드를 이용해 데이터를 쓴다.
//		3. write(),write(byte[]),write(byte[],int,int)메서드 가있다.
//			a.write()는 1byte씩 쓰게되고
//			b.write(byte[]) 배열의 길이 만큼 쓰며
//			c.write(byte[],int,int)는 배열의 크기만큼 쓰고 만약 5byte,0,2 라면 5byte씩 쓰지만 5byte보다 부족하게
//			들어왔다면 다른byte는 쓰지않고 0~2byte 만쓰라는 의미??
		
		try {
//			                                                                               만약 해당하는 파일이 없다면 파일을 만들어서 쓴다
			OutputStream os = new FileOutputStream("D:\\test.txt");
//			경로에 써줄 문자열및 숫자를 변수에 담아준다.
			String st = "오늘은 날씨가 좋구먼";
//			byte로 써야하기 때문에 String 클래스에 있는 getBytes메서드를 사용해 문자열을 하나하나 바이트로 바꿔
//			바이트 배열 변수에 넣어준다.
			byte[] bs = st.getBytes();
//			write를 사용해 쓸내용이 들어간 바이트배열변수를 넣어 준다.
			os.write(bs);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
