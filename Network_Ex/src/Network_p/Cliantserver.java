package Network_p;

import java.net.Socket;

public class Cliantserver {
	
	public static void main(String[]args) {
		
//		Ŭ���̾�Ʈ ���μ�����  �������μ����� ����
		
		Socket socket = null;
		
		try {
//									������ ��Ʈ ��ȣ
			socket = new Socket("localhost",9000);
			System.out.println("��������");
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
