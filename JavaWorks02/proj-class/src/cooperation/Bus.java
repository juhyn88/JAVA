package cooperation;

public class Bus {
	int busNumber;			//���� ��ȣ
	int passenger;				//�°���
	int money;						//����
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {		//take() �޼���
		this.money += money;					//���� ����
		passenger++;										//�°� 1�� ����
	}

	public void showInfo() {					//showInfo() �޼���
		System.out.println(busNumber + "�� ������ ������ " + money + "�� �̰�, �°�����" + passenger + "�� �Դϴ�.");
	}
}
