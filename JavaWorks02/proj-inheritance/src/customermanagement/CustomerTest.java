package customermanagement;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer kim = new Customer();
		kim.setCustomerName("���");
		System.out.println(kim.showInfo());
		
		int price = 10000;
		int cost = kim.calcPrice(price);
		
		System.out.println("���ұݾ� : " + cost);
		System.out.println(kim.showInfo());
	}

}
