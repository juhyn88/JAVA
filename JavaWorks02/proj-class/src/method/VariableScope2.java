package method;

public class VariableScope2 {

	static int x = 1;		//정적 변수, 클래스 변수
	public static int func2() {
		
		x = x + 1;
		return x;
	}
	
	public static void main(String[] args) {
		System.out.println(func2());
		System.out.println(func2());
		System.out.println(func2());

	}

}
