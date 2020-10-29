package day19;
abstract class Parent{
	String name = "부모";
	abstract void disp();		//추상 메소드
	void line() {}				//일반 메소드
}
class Son extends Parent{

	@Override
	void disp() {
		System.out.println("아들입니다.");
	}
	
}
class Daughter extends Parent{

	@Override
	void disp() {
		System.out.println("딸입니다.");
	}
	
}
public class AbstractTest {

	public static void main(String[] args) {
		//에러, 추상클래스는 new 인스턴스화 불가능
		//Parent papa = new Parent();
		Son son = new Son();
		son.disp();
		Daughter daugh = new Daughter();
		daugh.disp();
		
		Parent pa = new Son();
		pa.disp();
		pa = new Daughter();
		pa.disp();
		
	}

}
