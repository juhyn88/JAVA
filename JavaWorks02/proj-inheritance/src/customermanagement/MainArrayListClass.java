package customermanagement;

import java.util.ArrayList;

public class MainArrayListClass {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer lee = new Customer(10010,"�̼���");
		Customer kim  = new Customer(10020,"������");
		Customer hong = new Customer(10030,"ȫ�浿");
		Customer shin = new Customer(10040,"�Ż��Ӵ�");
		Customer youl = new Customer(10050,"������" + 2020);
		
		customerList.add(lee);
		customerList.add(kim);
		customerList.add(hong);
		customerList.add(shin);
		customerList.add(youl);
		
		System.out.println("=== �������� ���ʽ� ����Ʈ ��� ===");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "����"
					+ cost + "�� �����ϼ̽��ϴ�.");
		}
		
		System.out.println("==== �� ���� ���� ====");
		for(Customer customer : customerList) {
			System.out.println(customer.showInfo());
		}
		
	}

}
