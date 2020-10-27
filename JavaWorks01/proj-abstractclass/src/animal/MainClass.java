package animal;

public class MainClass {

	public static void main(String[] args) {
		Animal cat = new Cat();
		cat.eat();
		cat.sleep();
		cat.cry();
		System.out.println("=================");
		
		Animal dog = new Dog();
		dog.eat();
		dog.sleep();
		dog.cry();
		System.out.println("=================");
		
	}

}
