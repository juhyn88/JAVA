package refclass;

public class StudentTest {

	public static void main(String[] args) {
		Student chu = new Student(1001, " �߽ż�");
		chu.koreanSubject("����", 90);//����, 90
		chu.mathSubject("����", 75);
		
		chu.showInfo();
		
		Student ryu = new Student(1002,"������");
		ryu.koreanSubject("����", 85);
		ryu.mathSubject("����", 70);
		
		ryu.showInfo();

	}

}
