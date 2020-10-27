package classpart;

public class Student {
	private String name = "지용";			//멤버 변수 + 이름
	int age;
	int grade;
	
	Student(){
		System.out.println("Student 클래스 생성자 호출");
		grade = 1;
	}							//기본 생성자
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String  getName() {
		return name;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + age);
		System.out.println("학년 : " + grade);
	}
	
}
