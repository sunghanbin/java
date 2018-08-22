package InputStream_Guide;

import java.io.FileInputStream;
import java.io.InputStream;

public class inputSt {

	public static void main(String[] args) {
//		InputStream
//		1.Inputstream 은 추상클래스 로 하위클래스들에서 구현 되어있다.
//		2. inputstream 은 읽어올 데이터 로 연결 해주는 역활을 한다.
//		  _____________							 ______________
//		 | inputstream |----------연결-----------|    데이터	  |
//		 |_____________|---------읽기 read()------|_____________|
//		3. 읽어 오는 것은 read()가 읽어온다
//		4. read()와  read(byte[]) 있다.
//		   a. read()는 1byte 씩 읽어오고 
//		   b. read(byte[])는 바이트 배열의 크기만큼 읽어온다. 빠르다!
//		5.  입출력 클래스는 예외처리문인 try~ catch 안에서 작성해야한다.
		
		try {
//			연결구문
//			데이터타입을 인풋스트림 으로 선언 파일인풋스트림 으로 객체 생성(경로)경로설정시 디렉토리사이마다 역슬래쉬 2개
			InputStream is = new FileInputStream("D:\\test.txt");
//			무한루프로 시작해서 read메서드는 데이터를 다읽어 왔을시 -1를 반환하기 때문에 
//			if 문을 통해서 데이터가 -1이 들어온다면 if문 을 타고 브레이크를 걸어서 while문 을 탈출한다.
//			데이터를 읽어 오는 형태는 byte형태로 읽어온다.
			while(true) {
				int i = is.read();
				System.out.println("데이터"+i);
				if(i== -1) break;
			}
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
		}
	}
}
