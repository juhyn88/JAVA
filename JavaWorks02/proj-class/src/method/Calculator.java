package method;

public class Calculator {

	//add(),  sub(), mul(), div()
	//함수 정의하고 호출해 보세요
	public static int add(int n1, int n2) {
		return n1 + n2;		
	}
	public static int sub(int n1, int n2) {
		return n1 - n2;
	}
	public static int mul(int n1, int n2) {
		return n1 * n2;
	}
	public static float div(float  n1, float n2) {
		System.out.println(n1 + "," + n2);
		try {			
				float temp = n1 / n2;
				return temp;
		}catch(Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
//		if(n2==0) {
//			System.out.println("0으로 나눌수 없습니다.");
//		}
//		return (float) n1 / n2;			//강제 형변환
		return (float) n1/n2;
	}
	
	
	public static void main(String[] args) {
		int num1 = 10, num2 = 0;
		int result;
		float result2;
		
		result = add(num1,num2);
		System.out.println(result);
		
		 result = sub(num1,num2);
		System.out.println(result);
		
		 result = mul(num1,num2);
		System.out.println(result);
		
		 result2 = div(num1,num2);
		System.out.println(String.format("%.2f",result2));
		
		//정밀도 확인
		float fNum = 0.12345678F;								//4byte, 실수 끝에 F를 붙임, 소수7자리까지
		double dNum = 0.12345678901234567;	//8byte, 기본형, 소수 16자리까지 표현
		System.out.println(fNum);
		System.out.println(dNum);
		
	}
	
	

}
