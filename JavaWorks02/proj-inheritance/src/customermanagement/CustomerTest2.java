package customermanagement;

public class CustomerTest2 {

	public static void main(String[] args) {
		
		Customer lee = new Customer(10010,"�̼���");
		VIPCustomer shin = new VIPCustomer(10020,"�Ż��Ӵ�",123);
		Customer kim = new VIPCustomer(10030,"������", 500);
		
		int price =10000;
		int leeCost = lee.calcPrice(price);
		int shinCost = shin.calcPrice(price);
		int kimCost = kim.calcPrice(price);
		
		System.out.println("=== ���� �ݾ� ===");
		System.out.println("���� �ݾ� : " + leeCost);
		System.out.println("���� �ݾ� : " + shinCost);
		System.out.println("���� �ݾ� : " + kimCost);
		
		System.out.println("=== �� ���� ��� ===");
		System.out.println(lee.showInfo());
		System.out.println(shin.showInfo());
		System.out.println(kim.showInfo());
		
	}

}
