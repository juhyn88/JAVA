package customermanagement;

public class VIPCustomerTest {

	public static void main(String[] args) {
		VIPCustomer chu = new VIPCustomer();
		chu.setCustomerName("�߽ż�");
		chu.setAgentID(777);
		System.out.println(chu.showInfo());
		
		int price = 10000;
		int cost = chu.calcPrice(price);
		System.out.println("���� ���� : " + cost);
		
		
	}

}
