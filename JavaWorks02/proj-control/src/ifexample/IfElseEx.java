package ifexample;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		// if ~ else ����
		Scanner sc = new Scanner(System.in);	//����� ���� class
		System.out.println("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();										//���� �Է� �޼ҵ�
		
		if (age >= 15) {
			System.out.println("������");
		}else {
			System.out.println("�����Ұ�");
		}
		sc.close();

	}

}
