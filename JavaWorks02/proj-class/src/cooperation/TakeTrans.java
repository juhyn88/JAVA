package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		//학생 객체 생성
		Student cha = new Student("류현진", 10000);
		
		
		//버스 객체 생성
		Bus bus = new Bus(871);
		
		cha.takeBus(bus);
		cha.showInfo();
		
		bus.showInfo();

	}

}
