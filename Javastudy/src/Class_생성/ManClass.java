package Class_����;

public class ManClass {
	
	
//	������ : �ܺο���  ��ü�� �����Ҷ� ȣ��ȴ�
//	�Ķ���Ͱ� ���� �����ڵ� �ִ�.
//	������� �ʾƵ� �������Ҷ� �����Ϸ��� �����Ͽ� �������Ѵ�.
	public ManClass() {
		// TODO Auto-generated constructor stub
		
//		System.out.println("����� ��Ŭ���� ������ �Դϴ�.");
	}
//	�ν��Ͻ����� (�������)
//	�����̺� ���������ڴ� �ش��ϴ� Ŭ���������� ��밡���ϴ�.
//	������ �� �ش� 
	private int age;
	private int height;
	private int weight;
	private String phoneNum;

//	������ �̸��� ���Ƶ� ������ ���� �ʴ´�.
	public ManClass(int age, int height,int weight,String phoneNum) {
//		this ���ڽ��� ����Ų��. 
//		class �� �ν��Ͻ� ������ �Ķ���� ������ ������ ���� �Ҵ��ϰڴٴ� ��
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.phoneNum = phoneNum;
		
	}
	
	public double calculateBMI() {
		
		double result = weight /(height*height);
		return result;
	}
//  �����̺� �ν��Ͻ� ������ ���� �ٸ� Ŭ�������� �����ϰų�  ����Ҽ� ���⶧���� 
//	����Ϸ��� get,set�� �����  �����ϰų� ����Ҽ��ִ�
//	get�� ���� �����´�
//	set�� ���� �����Ѵ�
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
}
