package Network_p;

import java.net.ServerSocket;
import java.net.Socket;

public class MainClass {
	
	public static void main(String[]args) {
		
		
//		��������   ��Ʈ��ũ�� ���õ� ���� ���� ó���� ����� �ϱ� ������  ������ �����ϰ� �ʱ�ȭ �� ���� �ʴ´�.
		
		ServerSocket serversocket = null;
		Socket socket = null;
		
		try {
//			���⼭ ���� 
			
			serversocket = new ServerSocket(9000);
			System.out.println("Ŭ���̾�Ʈ  ����  �غ� �Ϸ�");
//							accept�� Ŭ���̾�Ʈ�� �޴´�. ������ ��ȯ �Ѵ�.
			socket = serversocket.accept();
			System.out.println("Ŭ���̾�Ʈ ����!!");
			System.out.println("socket :"+socket);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
//			��Ʈ��ũ �����  �ڿ� ȸ�� �ϱ� ����  
//			finally �� Ʈ���̹��̴� ĳġ���̴� ���� �ƹ��ų� ���� �Ǵ��� �����Ѵ�.
			try {
				if(socket != null) socket.close();
				if(serversocket != null)serversocket.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();			}
		}
	}

}
