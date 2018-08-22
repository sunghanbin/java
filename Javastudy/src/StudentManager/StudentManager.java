package StudentManager;

import java.util.ArrayList;

public class StudentManager {
//	학생 정보가 입력되있는 리스트 생성
//	        생성과 동시에                                                 초기화
	ArrayList<Student> students = new ArrayList<Student>();
//	StudentExpel 객체 생성 
	StudentExpel studentex = new StudentExpel();
//	main jvm 구동시작 하는 지점 메소드
	public static void main(String[] args) {
//		StudentManager class 가 가지고 있는 메소드 addStudent 를 사용하기위해 객체를 생성
		StudentManager manager = new StudentManager();
		manager.addStudent("성한빈", 25, 2016505, "연극영화");
		manager.addStudent("김유림", 22, 2016504, "중어중문과");
		manager.addStudent("하빛", 25, 2016503, "국어국문과");
		manager.addStudent("권구진", 25, 2016506, "IT");
		
//		입력 정보 보기
//		                   객체.배열.배열인덱스().Student class에 선언해둔 get메소드를 가지고만 정보를 볼수있기 때문에 getAge작성 
		System.out.println(manager.students.get(0).getAge());
		
//		변경
		manager.students.get(0).updateInfo(3, "2016509");
		
	}
	
	private void addStudent(String name, int age, int studentNum,String magor) {
		// TODO Auto-generated method stub
//		Student class 를 사용하려 파라미터를 받는 객체 생성  Student 클래스에 만들어둔 로직으로 새로운 학생정보를 생성 
//		선언해둔 어레이리스트에 추가해 준다
//		Student student = new Student(name, age, studentNum, magor);
////		위에서 선언해준 배열에 추가 해준다
//		students.add(student);
		
//		위에 구문을 줄여 사용할수 있다
		students.add(new Student(name, age, studentNum, magor));
		System.out.println(name + "학생정보 입력 성공");
	}
}