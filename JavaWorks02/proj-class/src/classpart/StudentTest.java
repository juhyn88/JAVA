package classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName ("이슬기");
		s1.age = 18;

		
		s1.showInfo();
		System.out.println("---------------");
		
		Student s2 = new Student();
		s2.setName("박한솔");
		s2.age = 17;
		
		
		s2.showInfo();
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		
//		System.out.println("이름 : " + s1.name);
//		System.out.println("나이 : " + s1.age);
//		System.out.println("학년 : " + s1.grade);
		
	}

}
