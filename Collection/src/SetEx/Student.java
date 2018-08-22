package SetEx;

public class Student {

	private String name;
	private int Grade;
	public Student(String name,int Grade) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.Grade = Grade;
	}
//	toString 을 오브젝트 클래스에서 오버라이딩 을하여 toString을 사용했을 때
//	다음의 오버라이딩한 메서드에 로직과 같이 출력 되게 해준다
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
