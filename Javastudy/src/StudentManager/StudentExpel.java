package StudentManager;

import java.util.ArrayList;

public class StudentExpel {
//	��̸���Ʈ ����
//	                ����Ʈ Ÿ��:���⼭�� Student Ŭ������ �־��ش�(��üŸ��)
//	                                    ��� ����Ʈ ������
	ArrayList<Student> expelStudents;
	
//	�⺻������
	public StudentExpel() {
		// TODO Auto-generated constructor stub
//		��� ����Ʈ �ʱ�ȭ
		expelStudents = new ArrayList<Student>();
		
	}
	
//	�����л� �߰� ��ü������
	public void addExpelStudent(String name, int age, int studentNum,String magor) {
//		�̷��� �߰��� ������  ��̸���Ʈ�� ���̰� �ȴ� 
//		              add: ��̸���Ʈ�� �߰��ϴ� ��ɾ�
		expelStudents.add(new Student(name, age, studentNum, magor));
		System.out.println("�����л� ������� �Ϸ�");
		
	}
	


}
