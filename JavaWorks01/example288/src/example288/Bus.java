package example288;

public class Bus extends Car {
	
	public void takePassenger() {
		System.out.println("�°��� ������ �¿�ϴ�.");
	}
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
	@Override
	public void refuel() {
		System.out.println("õ�� ������ �����մϴ�.");
	}

}