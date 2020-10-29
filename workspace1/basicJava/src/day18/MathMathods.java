package day18;

import java.util.Scanner;

public class MathMathods {

	public static void main(String[] args) {
		// 절댓값, 제곱근, 원의 면적 구하기
		Scanner in = new Scanner(System.in);
		
		System.out.println("실수 값 : ");
		double x = in.nextDouble();
		
		System.out.println("절댓값 :" + Math.abs(x));
		System.out.println("루트값 :" + Math.sqrt(x));
		System.out.println("면  적 :" + Math.PI * x * x);
		System.out.println("면  적 :" + Math.PI * Math.pow(x, 2));
	}

}
