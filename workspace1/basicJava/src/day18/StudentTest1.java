package day18;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("������");
		System.out.println(studentLee.serialNum);     //(x) 1000
		studentLee.serialNum++;

		Student studentSon = new Student();
		studentSon.setStudentName("�ռ���");
		System.out.println(studentSon.serialNum);     //(x) 1000
		System.out.println(studentLee.serialNum);     //(x) 1001
	}  //main-end

}

