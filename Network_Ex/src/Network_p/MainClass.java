package Network_p;

import java.net.ServerSocket;
import java.net.Socket;

public class MainClass {
	
	public static void main(String[]args) {
		
		
//		서버소켓   네트워크와 관련된 것은 예외 처리를 해줘야 하기 때문에  변수만 선언하고 초기화 는 하지 않는다.
		
		ServerSocket serversocket = null;
		Socket socket = null;
		
		try {
//			여기서 구현 
			
			serversocket = new ServerSocket(9000);
			System.out.println("클라이언트  맞을  준비 완료");
//							accept가 클라이언트를 받는다. 소켓을 반환 한다.
			socket = serversocket.accept();
			System.out.println("클라이언트 연결!!");
			System.out.println("socket :"+socket);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
//			네트워크 연결뒤  자원 회수 하기 위함  
//			finally 는 트라이문이던 캐치문이던 둘중 아무거나 실행 되더라도 실행한다.
			try {
				if(socket != null) socket.close();
				if(serversocket != null)serversocket.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();			}
		}
	}

}
