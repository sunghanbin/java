package Try_catch;

public class BasicException {
	
	public static void main(String[] args) {
		
//		ArrayINdexOutOfBoundsException �迭�� ���� �������� �ʴ� index���� ȣ���ϸ� �߻� �մϴ�.
		int[] iArr = {0,1,2,3};
		
		System.out.println(iArr[0]);
		System.out.println(iArr[1]);
		System.out.println(iArr[2]);
		System.out.println(iArr[3]);
		
		System.out.println(iArr[4]);
		
///////////////////////////////////////////////////////////////////////
//		NullPointerException �������� �ʴ� ��ü�� ����ų �� �߻� �մϴ�.

//		��ü �����͸� ���� ������ �ƹ��� �ּҰ��� ����Ű�� �������� �� ��  Null�̶� ���Ѵ�.
		String str = null;
//		str���ڿ� ��ü�� 0��° ���ڸ� �����ͼ� ĳ���� c�� ��ڴٴ� ���ε� str�� ��ü�� �ƹ��� �ּҰ��� ����Ű�� �����ʴ�.
		char c = str.charAt(0);
		
////////////////////////////////////////////////////////////////////////////
//		NumberFormatException ���ڸ� ���ڷ� ó���Ҷ� �߻��Ѵ�.
		
		String str1 = "aa";
		int i = 10;
//		          str���ڿ��� ���������� Ÿ�Ժ�ȯ �Ͽ� ���ϱ� �϶�� ���ε� ���ڿ��� ������ �مf ���� �����������ƴϹǷ� 
//		���Ҽ��� ����.
		int j = Integer.parseInt(str) + i;
		
//////////////////////////////////////////////////////////////////////////////////
//		DB���� Exception
		/* ClasNotFoundException: ����̺� �̸��� ã�� ������ ��
		 * SQLException: db,url,id,pw�� �ùٸ��� ���� ��
		 */
		
	}

}
