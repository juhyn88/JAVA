package person;

public class StudentTest {

	public static void main(String[] args) {
		Student sohee = new Student();
		sohee.name = "�ڼ���";	//Person�� ��� ��밡��
		sohee.age = 17;				//Person�� ���
		sohee.StudentID = 1010;	//Student(�ڱ�) ���
		
		Person sunyoung = new Student	();		//�θ�Ŭ���� ��ü ����(�ڵ� �� ��ȯ)
		sunyoung.name = "�̼���";
		sunyoung.age = 25;
		
		int num = 10;
		double dNum = num;
		System.out.println(dNum);

	}

}
