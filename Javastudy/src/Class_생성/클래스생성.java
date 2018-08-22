package Class_생성;

public class 클래스생성 {
	public static void main(String[] args) {
//		객체는 생성된뒤 독립체이기때문에 완전히 다르다
		ManClass mc = new ManClass();
		ManClass mc3 = new 	ManClass(20, 150, 64, "01041619256");
		
//		객체의 인스턴스 변수에 접근이 가능하도록 get,set을 생성해둔경우 접근하고 변경하는법
		mc3.getAge();//가져온다
		mc3.setHeight(182);//변경한다
//		.equals()<- 비교 할때 bool 반환
//		그래서 아래와 같이 비교하게 되면 다른것이기 때문에 false 가 나오게 된다 
		System.out.println(mc.equals(mc3));
		
		double b = mc3.calculateBMI();
	}

}
