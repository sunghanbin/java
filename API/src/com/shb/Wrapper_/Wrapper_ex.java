package com.shb.Wrapper_;

public class Wrapper_ex {
	
//	Wrapper ���ʵ����͸� ��ü�����ͷ� ��ȯ �մϴ�.
	
//	���ʵ����Ϳ� �����ϴ� ��ü ������ Ŭ����
	
//	   ���ʵ�����    |  ��ü������
/*    byte     |    Byte
 * 	  short    |   Short
 *    int      |   Integer
 *    long     |   Long
 *    double   |   Double
 *    float    |   Float
 *    boolean  |   Boolean
 *    char     |   Character
 *  
 */
	public static void main(String[] args) {
		Integer integer = new Integer(10);
		
		int i = integer.intValue();
		System.out.println(i);
		
//		����ȯ 
		String str = "123";
		int j = Integer.parseInt(str);
		System.out.println(j+1);
	}
}
