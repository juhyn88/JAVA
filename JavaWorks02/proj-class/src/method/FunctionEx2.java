package method;

public class FunctionEx2 {

	public static int oneUp(int x) {										//1����, x - ����, �Ű�����
		x = x + 1;
		return x;
	}
	
	public static int add(int n1, int n2) {							//add�Լ� ����
		
		return n1 + n2;
	}
	
	public static void main(String[] args) {
		int result = oneUp(10);
		System.out.println("1���� : " + result);
		//System.out.println(x);			x�� ȣ�� �� �޸𸮰������� �Ҹ��, ���Ұ�

		int num1 = 10, num2 = -20;												//��������
		
		int sum = add(num1, num2);											//add�Լ� ȣ��
		System.out.println("�� ���� �� : " + sum);

	}

}
