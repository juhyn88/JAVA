package classpart;

public class Student {
	private String name = "����";			//��� ���� + �̸�
	int age;
	int grade;
	
	Student(){
		System.out.println("Student Ŭ���� ������ ȣ��");
		grade = 1;
	}							//�⺻ ������
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String  getName() {
		return name;
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + getName());
		System.out.println("���� : " + age);
		System.out.println("�г� : " + grade);
	}
	
}
