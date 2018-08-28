package Network_Messege;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainClass {
	
	public static void main(String[]args) {
		
		
//		��������   ��Ʈ��ũ�� ���õ� ���� ���� ó���� ����� �ϱ� ������  ������ �����ϰ� �ʱ�ȭ �� ���� �ʴ´�.
		
		ServerSocket serversocket = null;
		Socket socket = null;
		
//		�����͸� �����ϰ� ���� I/O �����
		
//		�о����  
		InputStream inputstream = null;
//		���ڴ��� ������ ó�� ���� data I/O
		DataInputStream datainput = null;
		
//		����
		
		OutputStream outputstream = null;
		DataOutputStream dataoutput = null;
		
		try {
//			���⼭ ���� 
			
			serversocket = new ServerSocket(9000);
			System.out.println("Ŭ���̾�Ʈ  ����  �غ� �Ϸ�");
//							accept�� Ŭ���̾�Ʈ�� �޴´�. ������ ��ȯ �Ѵ�.
			socket = serversocket.accept();
			System.out.println("Ŭ���̾�Ʈ ����!!");
			System.out.println("socket :"+socket);
			
//			  �������κ��� �ƿ�ǲ ��Ʈ���� �޾ƿ�
			outputstream = socket.getOutputStream();
//			data�ƿ�ǲ ��Ʈ������ Ȯ�� ����ȯ����?
			dataoutput = new DataOutputStream(outputstream);
			
			inputstream = socket.getInputStream();
			datainput = new DataInputStream(inputstream);
			
			while(true) {
			String clientMessage = datainput.readUTF();
			System.out.println("clientMessage:"+ clientMessage);
			
			dataoutput.writeUTF("�޼������ۿϷ�~!");
			dataoutput.flush();
			
			if(clientMessage.equals("STOP"))break;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
//			��Ʈ��ũ �����  �ڿ� ȸ�� �ϱ� ����  
//			finally �� Ʈ���̹��̴� ĳġ���̴� ���� �ƹ��ų� ���� �Ǵ��� �����Ѵ�.
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
