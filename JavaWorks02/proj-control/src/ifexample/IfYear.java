package ifexample;

import java.util.Scanner;

public class IfYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���. : ");
		
		int year = sc.nextInt();
		
		if ((year%4==0 && year%100 !=0) || year%400==0) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("������ �ƴմϴ�.");
		}
		
		sc.close();

	}

}
