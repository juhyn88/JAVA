package day18;

public class BankTest {

	public static void main(String[] args) {
		System.out.println("-- 2000�� --");
		BankStatic.setRate(4.5);
		BankStatic hong = new BankStatic("ȫ�浿", 10000);
		hong.print_account();
		
		System.out.println("-- 2019�� --");
		BankStatic.setRate(2.5);
		BankStatic  kim = New BankStatic("��ö��", 20000);
		hong.print_account();
		kim.print_account();
		
		System.out.println("-- 2020 --");
		BankStatic.setRate(1.5);
		BankStatic lee = new BankStatic("�̿���", 30000);
		hong.print_account();
		kim.print_account();
		lee.print_account();
		
	}

}
