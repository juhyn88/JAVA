package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		//�л� ��ü ����
		Student cha = new Student("������", 10000);
		
		
		//���� ��ü ����
		Bus bus = new Bus(871);
		
		cha.takeBus(bus);
		cha.showInfo();
		
		bus.showInfo();

	}

}
