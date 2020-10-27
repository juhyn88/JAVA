package customermanagement;

public class VIPCustomer extends Customer{
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		super();
		customerGrade = "VIP";
		bonusRatio = 0.05;	//���ʽ� ������ 0.05
		saleRatio = 0.1;			//���������� 10%
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID,customerName);
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;	//���ʽ� ������ 0.05
		saleRatio = 0.1;			//���������� 10%
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price*saleRatio);	//��������ȯ
	}

	@Override
	public String showInfo() {
		return super.showInfo() + "��� ���� ���̵�� " + agentID + "�Դϴ�.";
	}
	
	

}
