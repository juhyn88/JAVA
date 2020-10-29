package day19;
class Animal{
	public void one() {}
	public final void two() {}
}
class Elephant extends Animal{
	public void one() {
		System.out.println("one() override!");
	}
	//public void two() {}
	//에러,부모의 final 메소드는 override 할 수 없다.(상속O, 재정의X)
}
public class FinalTest { 
	static final int ABC = 123;
	public static void main(String[] args) {
		Elephant e = new Elephant();
		e.one();			//7번라인 override된 one()메소드
		e.two();			//4번라인 two()메소드
		int a = 3;			//지역변수
		a = 30;
		a = 300;
		final int b = 7;
		//b = 70;			//에러,final 변수는 새로운값을 대입할 수 없다.
		//++b;
		final double PI = 3.14; 
	}

}
//final 변	수:변수의 상수화
//
//final 메소드 : 더이상(이후에는)override(재정의)할 수 없음
//final 클래스 : 종단클래스,더이상 자식클래스생성 할 수 없음
