package cooperation;

public class Student {
	String name;
	int age; 
	int money;					//������ 
	
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {		//takeBus() �޼��� ����
		bus.take(1200);
		this.money -= 1200;				//1200�� ����
	}
	
	public void showInfo() {
		System.out.println(name + " ���� ���� ����" + money + "�� �Դϴ�.");
	}

}
