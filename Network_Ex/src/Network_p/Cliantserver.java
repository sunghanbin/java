package Network_p;

import java.net.Socket;

public class Cliantserver {
	
	public static void main(String[]args) {
		
//		클라이언트 프로세스와  서버프로세스와 연결
		
		Socket socket = null;
		
		try {
//									접속할 포트 번호
			socket = new Socket("localhost",9000);
			System.out.println("서버연결");
			System.out.println("socket :" + socket);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(socket != null)socket.close();
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}

}
