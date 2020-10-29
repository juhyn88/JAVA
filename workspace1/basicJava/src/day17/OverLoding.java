package day17;

public class OverLoding {
	//기능 : 정수를 전달받아 1과 덧셈한 후 결과 반환
	public static int add(int num) { // int num = 10: 
		return num+1;                 // return11: //정수 11을 반환(호출한 지점으로 반환한다.)한다.
	}
	//오버로드(딩):메소드 중복
	//기능:정수2개를 전달받아 두개를 덧셈한 후 결과 반환
	public static int add(int num1,int num2) {
		return num1+num2;   // return30:  //정수 30을 반환( 호출한 지점으로 되돌아간다.)
	}
	public static double add2(double num1,double num2) {
		return num1+num2;    // return4.4
	}
	//기능:실수 2개를 전달받아 두개를 덧셈한 후 결과 반환
	public static void main(String[] args) {
		System.out.println(add(10));         //(결과)11
		System.out.println(add2(10,20));    //(결과)30

		

	}

} // class-end
