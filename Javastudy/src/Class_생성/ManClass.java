package Class_생성;

public class ManClass {
	
	
//	생성자 : 외부에서  객체를 생성할때 호출된다
//	파라미터가 없는 생성자도 있다.
//	명시하지 않아도 컴파일할때 컴파일러가 생성하여 컴파일한다.
	public ManClass() {
		// TODO Auto-generated constructor stub
		
//		System.out.println("여기는 맨클래스 생성자 입니다.");
	}
//	인스턴스변수 (멤버변수)
//	프라이빗 접근제어자는 해당하는 클래스에서만 사용가능하다.
//	데이터 에 해당 
	private int age;
	private int height;
	private int weight;
	private String phoneNum;

//	생성자 이름은 같아도 오류는 나지 않는다.
	public ManClass(int age, int height,int weight,String phoneNum) {
//		this 나자신을 가리킨다. 
//		class 의 인스턴스 변수에 파라미터 변수로 들어오는 값을 할당하겠다는 뜻
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.phoneNum = phoneNum;
		
	}
	
	public double calculateBMI() {
		
		double result = weight /(height*height);
		return result;
	}
//  프라이빗 인스턴스 변수의 값은 다른 클래스에서 변경하거나  사용할수 없기때문에 
//	사용하려면 get,set을 만들어  변경하거나 사용할수있다
//	get을 값을 가져온다
//	set은 값을 변경한다
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
