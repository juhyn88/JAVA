package person;

public class Person {
	String name;
	int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + name + "���� : " + age );
	}
}
