package SetEx;

public class Student {

	private String name;
	private int Grade;
	public Student(String name,int Grade) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.Grade = Grade;
	}
//	toString �� ������Ʈ Ŭ�������� �������̵� ���Ͽ� toString�� ������� ��
//	������ �������̵��� �޼��忡 ������ ���� ��� �ǰ� ���ش�
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ":" + Grade;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		String compareValue = obj.toString();
		String thisValue = toString();
		return thisValue.equals(compareValue);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		return toString().hashCode();
	}
}
