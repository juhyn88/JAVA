package classpart;

public class EmployeeTest {

	public static void main(String[] args) {
			Employee emp1 = new Employee(1001, "��׷�");
			emp1.showInfo();

			Employee emp2 = new Employee(1002, "������");
			emp2.showInfo();
			
			Employee emp3 = new Employee(1003);
			emp3.name = "�ȿ���";
			emp3.showInfo();
			
	}

}
