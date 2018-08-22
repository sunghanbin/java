package SetEx;
import java.util.HashSet;

public class MainClass {
	
	public static void main(String[]args) {
		
		HashSet<Student> student = new HashSet<Student>();


		student.add(new Student("홍길동",1));
		student.add(new Student("이순신",2));
		student.add(new Student("장보고",6));
//		그래서 다음과 같이 toString() 으로 출력한다면 각 객체가 가르키고 있는 해쉬된  주소값을 보여주게된다
		System.out.println(student.toString());
		
//		기초자료형 같은경우는 같은 해쉬값을 가지기 때문에 삭제가 가능하지만 
//		지금처럼 객체를 생성하여 HashSet에 넣어준경우에는 삭제할때 각각의 해쉬 값이 다르기 때문에
//		삭제가 불가능하다.
		
		Student student2 = new Student("이순신",2);
		student.remove(student2);
		System.out.println(student.toString());
		
	}

}
