package method;

public class FunctionEx1 {
	
	public static void sayHello() {
		System.out.println("�ȳ� ~ ");
	}
	
	public static void sayHello(String name) {		//�޼ҵ� �����ε�
		System.out.println("�ȳ� ~ " + name);
	}
	
	public static void main(String[] args) {
			//sayHello();
			sayHello("�μ�");
			sayHello("����");

	}

}
