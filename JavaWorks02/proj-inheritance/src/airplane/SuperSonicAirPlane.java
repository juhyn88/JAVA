package airplane;

public class SuperSonicAirPlane extends AirPlane{
	
	int flyMode = FlyModeTable.NORMAL;		//1일때 Normal, 2일때 SuperSonic

	@Override
	public void fly() {
		if(flyMode == FlyModeTable.SUPERSONIC) {
			System.out.println("초음속 배행을 합니다.");
		}
		else {
		
		super.fly();		//AirPlane 메소드 상속
	
		}		
	}
}
