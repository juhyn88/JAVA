package chainshop;

public class Shop1 extends HeadShop{
	
	public Shop1() {
		System.out.println("���а� �����Դϴ�.");
	}
	
	@Override																	//�������̵�(������) �������̼�
	public void sellDoenjangJJigae() {				//�޼ҵ� ������
		System.out.println("����� : 5,500��" );
	}
	@Override
	public void sellKimchiJJigae() {
		System.out.println("��ġ� : 6,000��");
			
		}
	@Override
	public void sellBibimBap() {
		System.out.println("����� : 6,500��" );
	}
}
