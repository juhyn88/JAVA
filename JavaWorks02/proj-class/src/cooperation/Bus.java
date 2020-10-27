package cooperation;

public class Bus {
	int busNumber;			//버스 번호
	int passenger;				//승객수
	int money;						//수입
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {		//take() 메서드
		this.money += money;					//수입 증가
		passenger++;										//승객 1명 증가
	}

	public void showInfo() {					//showInfo() 메서드
		System.out.println(busNumber + "번 버스의 수입은 " + money + "원 이고, 승객수는" + passenger + "명 입니다.");
	}
}
