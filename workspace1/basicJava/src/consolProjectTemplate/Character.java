package consolProjectTemplate;

// 주현씨 담당! 슈퍼 클래스
public class Character {
	String name; 			// 플레이어와 에너미가 공통적으로 사용할 변수들을 모아 놓은곳
	int lev;				// 이름, 공격력, 체력, 경험치 
	int hp;
	int atk;
	int exp;
	
	
	public Character(String name, int lev, int hp, int atk, int exp) {
		this.name = name;
		this.lev = lev;
		this.hp = hp;
		this.atk = atk;
		this.exp = exp;
	}
	public void Attack(Character enemy) {
				return;
	}
	public void TakeDamage() {
				return;
	}
	

		
	
}
