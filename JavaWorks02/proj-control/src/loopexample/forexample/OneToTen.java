package loopexample.forexample;

public class OneToTen {

	public static void main(String[] args) {
		// for�� - 1����10���� ���ϱ�
		int i = 1;
		int sum = 0;
				for(  i = 1; i <=10; i++) {
			sum += i;
		}
		float avg = (float) sum / (i -1);
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);

	}

}
