package animal;

public abstract class Animal {		//추상 클래스
	
	public void eat() {
		System.out.println("먹는다.");
	}
	public void sleep() {
		System.out.println("잠잔다.");
	}
	public abstract void cry();		//추상 메소드

	
}
