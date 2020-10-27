package ifexample;

import java.util.Scanner;

public class IfElseIfElseEx {

	public static void main(String[] args) {
		// 놀이공원의 입장료
		// 취학 전 아동 - 1000원, 초등 - 2000원, 중,고등 - 2500원, 일반 - 3000
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		int charge;
		if (age < 8) {
			System.out.println("취학 전 아동입니다.");
			charge = 1000;
		}else if(age < 14) {
			System.out.println("초등학생입니다.");
			charge = 2000;
		}else if(age < 20) {
			System.out.println("중,고등학생입니다.");		
			charge = 2500;
		}else {
			System.out.println("일반인입니다.");
			charge = 3000;
		}
		System.out.println("입장료는 " + charge + "원 입니다.");
		
		sc.close();

	}
	

}
