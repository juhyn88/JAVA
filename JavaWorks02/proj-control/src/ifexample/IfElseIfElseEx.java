package ifexample;

import java.util.Scanner;

public class IfElseIfElseEx {

	public static void main(String[] args) {
		// ���̰����� �����
		// ���� �� �Ƶ� - 1000��, �ʵ� - 2000��, ��,��� - 2500��, �Ϲ� - 3000
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���.");
		int age = sc.nextInt();
		int charge;
		if (age < 8) {
			System.out.println("���� �� �Ƶ��Դϴ�.");
			charge = 1000;
		}else if(age < 14) {
			System.out.println("�ʵ��л��Դϴ�.");
			charge = 2000;
		}else if(age < 20) {
			System.out.println("��,����л��Դϴ�.");		
			charge = 2500;
		}else {
			System.out.println("�Ϲ����Դϴ�.");
			charge = 3000;
		}
		System.out.println("������ " + charge + "�� �Դϴ�.");
		
		sc.close();

	}
	

}
