package method;

public class FunctionEx2 {

	public static int oneUp(int x) {										//1증가, x - 지역, 매개변수
		x = x + 1;
		return x;
	}
	
	public static int add(int n1, int n2) {							//add함수 정의
		
		return n1 + n2;
	}
	
	public static void main(String[] args) {
		int result = oneUp(10);
		System.out.println("1증가 : " + result);
		//System.out.println(x);			x는 호출 후 메모리공간에서 소멸됨, 사용불가

		int num1 = 10, num2 = -20;												//지역변수
		
		int sum = add(num1, num2);											//add함수 호출
		System.out.println("두 수의 합 : " + sum);

	}

}
