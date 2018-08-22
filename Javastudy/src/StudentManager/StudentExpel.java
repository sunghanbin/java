package StudentManager;

import java.util.ArrayList;

public class StudentExpel {
//	어레이리스트 선언
//	                리스트 타입:여기서는 Student 클래스를 넣어준다(객체타입)
//	                                    어레이 리스트 변수명
	ArrayList<Student> expelStudents;
	
//	기본생성자
	public StudentExpel() {
		// TODO Auto-generated constructor stub
//		어레이 리스트 초기화
		expelStudents = new ArrayList<Student>();
		
	}
	
//	제적학생 추가 객체생성자
	public void addExpelStudent(String name, int age, int studentNum,String magor) {
//		이렇게 추가된 정보는  어레이리스트에 쌓이게 된다 
//		              add: 어레이리스트에 추가하는 명령어
		expelStudents.add(new Student(name, age, studentNum, magor));
		System.out.println("재적학생 정보등록 완료");
		
	}
	


}
