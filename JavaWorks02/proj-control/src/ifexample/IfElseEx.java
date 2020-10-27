package ifexample;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		// if ~ else 구문
		Scanner sc = new Scanner(System.in);	//입출력 관련 class
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();										//숫자 입력 메소드
		
		if (age >= 15) {
			System.out.println("관람가");
		}else {
			System.out.println("관람불가");
		}
		sc.close();

	}

}
