package refclass;

public class StudentTest {

	public static void main(String[] args) {
		Student chu = new Student(1001, " 추신수");
		chu.koreanSubject("국어", 90);//국어, 90
		chu.mathSubject("수학", 75);
		
		chu.showInfo();
		
		Student ryu = new Student(1002,"류현진");
		ryu.koreanSubject("국어", 85);
		ryu.mathSubject("수학", 70);
		
		ryu.showInfo();

	}

}
