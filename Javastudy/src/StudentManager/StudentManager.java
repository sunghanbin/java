package StudentManager;

import java.util.ArrayList;

public class StudentManager {
//	�л� ������ �Էµ��ִ� ����Ʈ ����
//	        ������ ���ÿ�                                                 �ʱ�ȭ
	ArrayList<Student> students = new ArrayList<Student>();
//	StudentExpel ��ü ���� 
	StudentExpel studentex = new StudentExpel();
//	main jvm �������� �ϴ� ���� �޼ҵ�
	public static void main(String[] args) {
//		StudentManager class �� ������ �ִ� �޼ҵ� addStudent �� ����ϱ����� ��ü�� ����
		StudentManager manager = new StudentManager();
		manager.addStudent("���Ѻ�", 25, 2016505, "���ؿ�ȭ");
		manager.addStudent("������", 22, 2016504, "�߾��߹���");
		manager.addStudent("�Ϻ�", 25, 2016503, "�������");
		manager.addStudent("�Ǳ���", 25, 2016506, "IT");
		
//		�Է� ���� ����
//		                   ��ü.�迭.�迭�ε���().Student class�� �����ص� get�޼ҵ带 ������ ������ �����ֱ� ������ getAge�ۼ� 
		System.out.println(manager.students.get(0).getAge());
		
//		����
		manager.students.get(0).updateInfo(3, "2016509");
		
	}
	
	private void addStudent(String name, int age, int studentNum,String magor) {
		// TODO Auto-generated method stub
//		Student class �� ����Ϸ� �Ķ���͸� �޴� ��ü ����  Student Ŭ������ ������ �������� ���ο� �л������� ���� 
//		�����ص� ��̸���Ʈ�� �߰��� �ش�
//		Student student = new Student(name, age, studentNum, magor);
////		������ �������� �迭�� �߰� ���ش�
//		students.add(student);
		
//		���� ������ �ٿ� ����Ҽ� �ִ�
		students.add(new Student(name, age, studentNum, magor));
		System.out.println(name + "�л����� �Է� ����");
	}
}