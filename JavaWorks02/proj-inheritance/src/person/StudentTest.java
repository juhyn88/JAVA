package person;

public class StudentTest {

	public static void main(String[] args) {
		Student sohee = new Student();
		sohee.name = "박소희";	//Person의 멤버 사용가능
		sohee.age = 17;				//Person의 멤버
		sohee.StudentID = 1010;	//Student(자기) 멤버
		
		Person sunyoung = new Student	();		//부모클래스 객체 생성(자동 형 변환)
		sunyoung.name = "이선영";
		sunyoung.age = 25;
		
		int num = 10;
		double dNum = num;
		System.out.println(dNum);

	}

}
