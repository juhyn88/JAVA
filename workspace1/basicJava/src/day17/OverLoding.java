package day17;

public class OverLoding {
	//��� : ������ ���޹޾� 1�� ������ �� ��� ��ȯ
	public static int add(int num) { // int num = 10: 
		return num+1;                 // return11: //���� 11�� ��ȯ(ȣ���� �������� ��ȯ�Ѵ�.)�Ѵ�.
	}
	//�����ε�(��):�޼ҵ� �ߺ�
	//���:����2���� ���޹޾� �ΰ��� ������ �� ��� ��ȯ
	public static int add(int num1,int num2) {
		return num1+num2;   // return30:  //���� 30�� ��ȯ( ȣ���� �������� �ǵ��ư���.)
	}
	public static double add2(double num1,double num2) {
		return num1+num2;    // return4.4
	}
	//���:�Ǽ� 2���� ���޹޾� �ΰ��� ������ �� ��� ��ȯ
	public static void main(String[] args) {
		System.out.println(add(10));         //(���)11
		System.out.println(add2(10,20));    //(���)30

		

	}

} // class-end
