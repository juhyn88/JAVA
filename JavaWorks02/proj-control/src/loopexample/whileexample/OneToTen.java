package loopexample.whileexample;

public class OneToTen {

	public static void main(String[] args) {
		// 1���� 10���� ��� - while����
		// 1���� 10������ �հ�
		int i = 1;
		int sum = 0; 
		while(i <= 10) {
			sum += i;
			System.out.println("i = " + i + ", sum = " + sum);
			//System.out.println(i);
			i++;
		}
		System.out.println(i);
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + sum/(i-1));
				
		

	}

}
