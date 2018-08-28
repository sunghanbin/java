package Network_Messege;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliantserver {
	
	public static void main(String[]args) {
		
//		클라이언트 프로세스와  서버프로세스와 연결
		
		Socket socket = null;
		
//		데이터를 전송하고 받을 I/O 만들기
		
//		읽어오기  
		InputStream inputstream = null;
//		문자단위 데이터 처리 위해 data I/O
		DataInputStream datainput = null;
		
//		전송
		
		OutputStream outputstream = null;
		DataOutputStream dataoutput = null;
		
//		입력받을 스캐너
		Scanner scanner = null;
		
		try {
//									접속할 포트 번호
			socket = new Socket("localhost",9000);
			System.out.println("서버연결");
			System.out.println("socket :" + socket);
//						  소켓으로부터 아웃풋 스트림을 받아옴
			outputstream = socket.getOutputStream();
//			data아웃풋 스트림으로 확장 형변환같음?
			dataoutput = new DataOutputStream(outputstream);
			
			inputstream = socket.getInputStream();
			datainput = new DataInputStream(inputstream);
			
//			사용자로 부터 입력 받음
			scanner = new Scanner(System.in);
			
			while(true) {
//				입력한 데이터 보내기
				System.out.println("메세지 입력");
				String outMessege = scanner.nextLine();
				dataoutput.writeUTF(outMessege);
				dataoutput.flush();
				
//				서버로부터 온 데이터 읽기
				
				String inMessege = datainput.readUTF();
				System.out.println("inMessage :"+ inMessege);
//				              이퀄이 정확히 뭔지 
				if(outMessege.equals("STOP"))break;
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
//				자원회수
				if(socket != null)socket.close();
				if(inputstream != null)inputstream.close();
				if(datainput != null)datainput.close();
				if(dataoutput != null)dataoutput.close();
				if(outputstream != null)outputstream.close();
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}

}
