package day18;

public class Pizza {
	String toppings;                        //������ ���� ����
	public static int count;                //������ �Ǹ� ����
	public Pizza(String toppings) {         
		this.toppings = toppings;           //������ ���� ���� ����(�ʵ� �ʱ�ȭ)
		                                    //������ �ǸŰ�������
	}
	public static void main(String[] args) {
		Pizza p1 = new Pizza("Super Supreme");
		Pizza p2 = new Pizza("Cheese");
		Pizza p3 = new Pizza("Pepperoni");
		int n = Pizza.count;			// static ������ Ŭ���� �̸����� ���� â����.
									// Ŭ������.static�ʵ��
//		int n = p1.count
//		int n = p2.count
//		int n = p3.count
		//System.out.println("���ݱ��� �Ǹŵ� ���� ����:"+ n +"��");
	}

}
