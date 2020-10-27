package method;

public class FunctionEx1 {
	
	public static void sayHello() {
		System.out.println("¾È³ç ~ ");
	}
	
	public static void sayHello(String name) {		//¸Þ¼Òµå ¿À¹ö·Îµù
		System.out.println("¾È³ç ~ " + name);
	}
	
	public static void main(String[] args) {
			//sayHello();
			sayHello("¹Î¼ö");
			sayHello("Àº¼­");

	}

}
