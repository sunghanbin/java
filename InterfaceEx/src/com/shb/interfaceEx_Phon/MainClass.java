package com.shb.interfaceEx_Phon;

public class MainClass {
	
	public static void main(String[]args) {
		
		iFunction aphon = new APhon();
		iFunction bphon = new BPhon();
		iFunction cphon = new CPhon();
//		iterface�� ��üŸ���̶�������� Ÿ�����δ� ����Ҽ� �ִٰ� �ߴ� 
//		�׷��� ���⼭�� ��ü Ÿ������ �� �迭�� ������ ��ü���� ��Ҵ�.
//		�ٸ���ü�������� ���� ������Ÿ���� �迭�� ���� �ִ� ������ iFunction�̶�� �������̽� �� ��üŸ���� ���Ͻ��� ��ü�������Ͽ��⿡ �����ϴ�.
//		�̰��� �������̽��� Ư¡�� �������� ������ �ִ� �����̴�.
		iFunction[] phons = {aphon,bphon,cphon};
		
		for(int i= 0;i<phons.length;i++) {
			phons[i].callSendReceive();
			phons[i].canLTE();
			phons[i].tvRemoteController();
			System.out.println("==================");
		}
	}

}
