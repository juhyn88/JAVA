package method;

public class VariableScope2 {

	static int x = 1;		//���� ����, Ŭ���� ����
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
