package method;

public class VariableScope {

	
	public static int func1() {
			int x=  1;
			x = x + 1;
			return x;
	}
	
	public static void main(String[] args) {
		System.out.println(func1());
		System.out.println(func1());
		//System.out.println(x);
		
	}

}
