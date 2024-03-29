package day19;
interface Animal{
	//추상메소드만 존재
	abstract void kind();			//추상메소드
	void breathe();					//메소드앞의 abstract생략 가능
}
class Elephant implements Animal{

	@Override
	public void kind() {
		System.out.println("포유류");
	}

	@Override
	public void breathe() {
		System.out.println("허파로 호흡중");
	}
	
	
}
class Fish implements Animal{

	@Override
	public void kind() {
		System.out.println("어류");
	}

	@Override
	public void breathe() {
		System.out.println("아가미로 호흡중");
	}
	
}

public class InterfaceTest {

	public static void main(String[] args) {
		//인터페이스
		//:추상클래스와 비슷, 추상클래스보다추상화 정도가 더 높음
		//:(일반)필드와 (일반)메소드를 갖지 못함
		//:추상메소드"만"존재
		//:인터페이스는 바드시 클래스에서 추상메소드를 오버라이딩 해야만 한다.
		//:(상위)-------구현---->(하위)
		
		//에러,인터페이스로 객체 생성 불가능
		//Animal ani = new Elephant();
		
		//인터페이스도 다형성이 가능하다.
		Animal ani = new Elephant;
		ani.kind();
		ani.breathe();
		
		ani = new Fish();
		ani.kind();
		ani.breathe();
		
	}

}
