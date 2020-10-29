package consolProjectTemplate;

import java.util.Scanner;

// 주현씨 담당! 플레이어의 클래스, 슈퍼 클래스를 상속 받는다
public class Player extends Character {
	
	private double maxExp;
	private int level;
	private int damage;

	public Player (String name, int lev, int hp, int atk, int exp){
		super(name,lev,hp,atk,exp);		// 매개변수 (이름, 레벨, 체력, 공격력, 현재 경험치) 등을 받는 생성자를 생성한다.
	}

	// 다음 경험치까지 도달해야 할 경험치를 가져오기 위한 함수
	// 해당 변수들을 선언해주고 주석 풀고 사용하면 된다
	public int getMaxExp() {
		int exp;
		return (int)(maxExp = level * 100 * 1.3);
	}
	
	// 플레이어의 공격 함수, 매개변수로 플레이어와 에너미를 받는다
	public void Attack(Character enemy) {
		
		// 에너미의 체력에 따라 공격을 하거나 데미지를 주고 받으며
		// 에너미의 체력이 0이 되었을 경우 경험치를 얻는 함수를 불러와주고 출력해준다
		
		enemy.hp -= this.atk;
		enemy.atk = this.TakeDamage();
		if (hp == 0) {
			exp++;
		}
	}
	
	private int TakeDamage() {
	
		return 0;
	}
	
	// 플레이어가 데미지를 받는 함수, 매개변수로 플레이어와 에너미를 받는다

	public void TakeDamage(int damage) {
		hp -= damage;
	}
	
	// 적을 쓰러 뜨리고 얻는 경험치를 계산 해주는 함수
	private void getExp() {
		/* 현재 경험치와 도달해야 하는 경험치 등을 계산한다
		 * 현재 경험치가 도달해야 할 경험치를 넘으면 레벨업시켜준다
		 * 레벨업 했을때 체력과 공격력, 레벨은 자유롭게 올린다.
		 * 
		 * 현재 얻은 경험치가 다음 레벨 경험치를 넘었을 경우 
		 * 남은 경험치는 그대로 가지고 온다
		 */
		
		if (exp >= maxExp) {
			lev++;
			exp -= maxExp;
			
		}
	
	}
}
