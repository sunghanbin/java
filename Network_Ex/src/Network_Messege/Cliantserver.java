package Network_Messege;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliantserver {
	
	public static void main(String[]args) {
		
//		Ŭ���̾�Ʈ ���μ�����  �������μ����� ����
		
		Socket socket = null;
		
//		�����͸� �����ϰ� ���� I/O �����
		
//		�о����  
		InputStream inputstream = null;
//		���ڴ��� ������ ó�� ���� data I/O
		DataInputStream datainput = null;
		
//		����
		
		OutputStream outputstream = null;
		DataOutputStream dataoutput = null;
		
//		�Է¹��� ��ĳ��
		Scanner scanner = null;
		
		try {
//									������ ��Ʈ ��ȣ
			socket = new Socket("localhost",9000);
			System.out.println("��������");
			System.out.println("socket :" + socket);
//						  �������κ��� �ƿ�ǲ ��Ʈ���� �޾ƿ�
			outputstream = socket.getOutputStream();
//			data�ƿ�ǲ ��Ʈ������ Ȯ�� ����ȯ����?
			dataoutput = new DataOutputStream(outputstream);
			
			inputstream = socket.getInputStream();
			datainput = new DataInputStream(inputstream);
			
//			����ڷ� ���� �Է� ����
			scanner = new Scanner(System.in);
			
			while(true) {
//				�Է��� ������ ������
				System.out.println("�޼��� �Է�");
				String outMessege = scanner.nextLine();
				dataoutput.writeUTF(outMessege);
				dataoutput.flush();
				
//				�����κ��� �� ������ �б�
				
				String inMessege = datainput.readUTF();
				System.out.println("inMessage :"+ inMessege);
//				              ������ ��Ȯ�� ���� 
				if(outMessege.equals("STOP"))break;
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
//				�ڿ�ȸ��
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
