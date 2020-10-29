package consolProjectTemplate;

// 주현씨 담당! 에너미 클래스, 여기엔 슈퍼 클래스를 상속받아 그 안에 선언한 변수를 사용한다
public class Enemy extends Character {
	
	// 매개변수를 받는 생성자를 생성해서 선택한 적을 생성하게끔 한다
	public Enemy() {}
	public Enemy(int num) {
	}
	
	// 에너미 종류를 선택한다. 매개변수를 받아서 3개중 하나를 선택하게끔 하자
	private void selectEnemy() {
	
	}
	
	// 에너미의 공격 함수 매개변수로 플레이어와 에너미를 받는다
	@Override
	public void Attack(Character enemy) {
		
		/* 여기에는 누가 공격을 했다, 누가 데미지를 받았다를 출력해줘야 한다.
		 * 물론 누가 데미지를 받았는지도 해당 함수를 불러와야 한다.
		 */
		atk = this.TakeDamage(enemy);
		int damage = this.atk;
		}
		
	
	private int TakeDamage(Character enemy) {
		
		return 0;
	}
	// 해당 클래스가 데미지를 받았을때의 함수, 매개변수로 플레이어와 에너미를 받는다
	public void TakeDamage(int damage) {
		hp -= damage;
		if (hp <= 0) {
			hp = 0;
		}
	}
}
