package cooperation;

public class Student {
	String name;
	int age; 
	int money;					//가진돈 
	
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {		//takeBus() 메서드 정의
		bus.take(1200);
		this.money -= 1200;				//1200원 감소
	}
	
	public void showInfo() {
		System.out.println(name + " 님의 남은 돈은" + money + "원 입니다.");
	}

}
