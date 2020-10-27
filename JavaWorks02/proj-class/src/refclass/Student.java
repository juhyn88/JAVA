package refclass;

public class Student {
	int studentID;				//학번
	String studentName;	//이름
	Subject korean;
	Subject math;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		korean = new Subject();
		math = new Subject();
	}
	
	//국어 성적을 입력하는 메소드(함수)
	public void koreanSubject(String name, int score) {
		korean.setSubjectName(name);
		korean.setScorePoint(score);
	}
	
	//수학 성적을 입력하는 메소드(함수)
	public void mathSubject(String name, int score) {
		math.setSubjectName(name);
		math.setScorePoint(score);
	}
	

	public void showInfo() {
		System.out.println("학생 " + studentName + "의"
		+ korean.getSubjectName() + " 점수는 " + korean.getScorePoint() + "점이고, "
		+ math.getSubjectName() + "점수는 " + math.getScorePoint() + "점");
	}
	
}
