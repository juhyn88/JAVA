package refclass;

public class Student {
	int studentID;				//�й�
	String studentName;	//�̸�
	Subject korean;
	Subject math;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		korean = new Subject();
		math = new Subject();
	}
	
	//���� ������ �Է��ϴ� �޼ҵ�(�Լ�)
	public void koreanSubject(String name, int score) {
		korean.setSubjectName(name);
		korean.setScorePoint(score);
	}
	
	//���� ������ �Է��ϴ� �޼ҵ�(�Լ�)
	public void mathSubject(String name, int score) {
		math.setSubjectName(name);
		math.setScorePoint(score);
	}
	

	public void showInfo() {
		System.out.println("�л� " + studentName + "��"
		+ korean.getSubjectName() + " ������ " + korean.getScorePoint() + "���̰�, "
		+ math.getSubjectName() + "������ " + math.getScorePoint() + "��");
	}
	
}
