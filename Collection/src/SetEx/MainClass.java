package SetEx;
import java.util.HashSet;

public class MainClass {
	
	public static void main(String[]args) {
		
		HashSet<Student> student = new HashSet<Student>();


		student.add(new Student("ȫ�浿",1));
		student.add(new Student("�̼���",2));
		student.add(new Student("�庸��",6));
//		�׷��� ������ ���� toString() ���� ����Ѵٸ� �� ��ü�� ����Ű�� �ִ� �ؽ���  �ּҰ��� �����ְԵȴ�
		System.out.println(student.toString());
		
//		�����ڷ��� �������� ���� �ؽ����� ������ ������ ������ ���������� 
//		����ó�� ��ü�� �����Ͽ� HashSet�� �־��ذ�쿡�� �����Ҷ� ������ �ؽ� ���� �ٸ��� ������
//		������ �Ұ����ϴ�.
		
		Student student2 = new Student("�̼���",2);
		student.remove(student2);
		System.out.println(student.toString());
		
	}

}
