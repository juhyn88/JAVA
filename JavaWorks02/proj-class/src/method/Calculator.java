package method;

public class Calculator {

	//add(),  sub(), mul(), div()
	//�Լ� �����ϰ� ȣ���� ������
	public static int add(int n1, int n2) {
		return n1 + n2;		
	}
	public static int sub(int n1, int n2) {
		return n1 - n2;
	}
	public static int mul(int n1, int n2) {
		return n1 * n2;
	}
	public static float div(float  n1, float n2) {
		System.out.println(n1 + "," + n2);
		try {			
				float temp = n1 / n2;
				return temp;
		}catch(Exception e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
//		if(n2==0) {
//			System.out.println("0���� ������ �����ϴ�.");
//		}
//		return (float) n1 / n2;			//���� ����ȯ
		return (float) n1/n2;
	}
	
	
	public static void main(String[] args) {
		int num1 = 10, num2 = 0;
		int result;
		float result2;
		
		result = add(num1,num2);
		System.out.println(result);
		
		 result = sub(num1,num2);
		System.out.println(result);
		
		 result = mul(num1,num2);
		System.out.println(result);
		
		 result2 = div(num1,num2);
		System.out.println(String.format("%.2f",result2));
		
		//���е� Ȯ��
		float fNum = 0.12345678F;								//4byte, �Ǽ� ���� F�� ����, �Ҽ�7�ڸ�����
		double dNum = 0.12345678901234567;	//8byte, �⺻��, �Ҽ� 16�ڸ����� ǥ��
		System.out.println(fNum);
		System.out.println(dNum);
		
	}
	
	

}
