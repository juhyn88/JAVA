package airplane;

public class SuperSonicAirPlane extends AirPlane{
	
	int flyMode = FlyModeTable.NORMAL;		//1�϶� Normal, 2�϶� SuperSonic

	@Override
	public void fly() {
		if(flyMode == FlyModeTable.SUPERSONIC) {
			System.out.println("������ ������ �մϴ�.");
		}
		else {
		
		super.fly();		//AirPlane �޼ҵ� ���
	
		}		
	}
}
