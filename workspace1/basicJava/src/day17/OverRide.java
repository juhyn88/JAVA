package day17;

class Over {
	public int sub(int num1, int num2) {
		return num1-num2;
	}
}
class OverSub extends Over{
	public int sub(int num1, int num2) {
		//오버라이드 : 부모의 메소드를 재정의
		return num1>num2 ? num1-num2 : num2-num1;
	}
	

}
public class OverRide {
	public static void main(String[] args) {
		Over cal1 = new Over();
		//                    sub() : 두 정수 뺄셈
		System.out.println(cal1.sub(10, 20)); //(결과) -10
		
		OverSub cal2 = new OverSub();
		//System.outprintln(cal2,sub(10.20)); //(결과) -10
		//                       sub() : 큰 정수-작은 정수
		System.out.println(cal2.sub(10, 20)); //(결과)  10
	}
}

/*
=== OverLoad(ing):오버로드 ===
	(한 클래스 내에서)
	  메소드명이 같고, 매개변수의 갯수 또는 자료명이 다름!
	  
=== OverRide:오버라이드 ===
	(두 클래스 간에)
	   메소드명이 같고, 매개변수의 갯수와 자료명 모두 같음!
*/