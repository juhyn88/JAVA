package day19;

class Pay{
	public String COMPANY = "company";
	public static double TAX = 0.03;
	public int SUDANG = 100;
	public int num = 10;
	public void line() {
		System.out.println("-----------------");
	}
	public static void disp() {
		System.out.println("=================");
	}
}
public class StaticTest {

	public static void main(String[] args) {
		System.out.println(Pay.COMPANY);
		System.out.println(Pay.TAX);
		System.out.println(Pay.SUDANG);
		Pay.disp();
		
		Pay money = new Pay();
		money.line();
		System.out.println(money.COMPANY);
		System.out.println(money.TAX);
		System.out.println(money.SUDANG);
		
		Pay one = new pay();
		one.SUDANG += 10;
		one.num += 10;
		

	}

}
