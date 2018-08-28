package Network_Messege;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainClass {
	
	public static void main(String[]args) {
		
		
//		서버소켓   네트워크와 관련된 것은 예외 처리를 해줘야 하기 때문에  변수만 선언하고 초기화 는 하지 않는다.
		
		ServerSocket serversocket = null;
		Socket socket = null;
		
//		데이터를 전송하고 받을 I/O 만들기
		
//		읽어오기  
		InputStream inputstream = null;
//		문자단위 데이터 처리 위해 data I/O
		DataInputStream datainput = null;
		
//		전송
		
		OutputStream outputstream = null;
		DataOutputStream dataoutput = null;
		
		try {
//			여기서 구현 
			
			serversocket = new ServerSocket(9000);
			System.out.println("클라이언트  맞을  준비 완료");
//							accept가 클라이언트를 받는다. 소켓을 반환 한다.
			socket = serversocket.accept();
			System.out.println("클라이언트 연결!!");
			System.out.println("socket :"+socket);
			
//			  소켓으로부터 아웃풋 스트림을 받아옴
			outputstream = socket.getOutputStream();
//			data아웃풋 스트림으로 확장 형변환같음?
			dataoutput = new DataOutputStream(outputstream);
			
			inputstream = socket.getInputStream();
			datainput = new DataInputStream(inputstream);
			
			while(true) {
			String clientMessage = datainput.readUTF();
			System.out.println("clientMessage:"+ clientMessage);
			
			dataoutput.writeUTF("메세지전송완료~!");
			dataoutput.flush();
			
			if(clientMessage.equals("STOP"))break;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
//			네트워크 연결뒤  자원 회수 하기 위함  
//			finally 는 트라이문이던 캐치문이던 둘중 아무거나 실행 되더라도 실행한다.
			try {
				if(socket != null) socket.close();
				if(serversocket != null)serversocket.close();
				if(inputstream != null)inputstream.close();
				if(datainput != null)datainput.close();
				if(dataoutput != null)dataoutput.close();
				if(outputstream != null)outputstream.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();			}
		}
	}

}
