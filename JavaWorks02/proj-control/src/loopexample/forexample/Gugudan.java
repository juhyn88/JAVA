package loopexample.forexample;

public class Gugudan {
	
	public static void gugudan(int dan) {
		for (int  i = 1; i <10; i++) {
			System.out.println(dan + "x" + i + "=" + dan*i);
		}
	}

	public static void main(String[] args) {
		// 구구단 프로그램
		gugudan(4);
		gugudan(5);	//호출
	
	}
	

}
