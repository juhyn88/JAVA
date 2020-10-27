package loopexample.forexample;

public class OneToTen {

	public static void main(String[] args) {
		// for문 - 1부터10까지 더하기
		int i = 1;
		int sum = 0;
				for(  i = 1; i <=10; i++) {
			sum += i;
		}
		float avg = (float) sum / (i -1);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);

	}

}
