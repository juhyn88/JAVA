package day18;

import java.util.Scanner;

public class MathMathods {

	public static void main(String[] args) {
		// ����, ������, ���� ���� ���ϱ�
		Scanner in = new Scanner(System.in);
		
		System.out.println("�Ǽ� �� : ");
		double x = in.nextDouble();
		
		System.out.println("���� :" + Math.abs(x));
		System.out.println("��Ʈ�� :" + Math.sqrt(x));
		System.out.println("��  �� :" + Math.PI * x * x);
		System.out.println("��  �� :" + Math.PI * Math.pow(x, 2));
	}

}
