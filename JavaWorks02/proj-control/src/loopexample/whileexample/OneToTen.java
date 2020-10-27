package loopexample.whileexample;

public class OneToTen {

	public static void main(String[] args) {
		// 1부터 10까지 출력 - while구문
		// 1부터 10까지의 합계
		int i = 1;
		int sum = 0; 
		while(i <= 10) {
			sum += i;
			System.out.println("i = " + i + ", sum = " + sum);
			//System.out.println(i);
			i++;
		}
		System.out.println(i);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/(i-1));
				
		

	}

}
