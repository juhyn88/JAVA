package customermanagement;

public class GoldCustomer extends Customer {
	
	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio  =0.02;		//보너스 적립율 2%
		saleRatio = 0.1;				//
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price*saleRatio);	//강제형변환
	}

}
