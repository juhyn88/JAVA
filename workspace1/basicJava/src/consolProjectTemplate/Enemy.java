package consolProjectTemplate;

// ������ ���! ���ʹ� Ŭ����, ���⿣ ���� Ŭ������ ��ӹ޾� �� �ȿ� ������ ������ ����Ѵ�
public class Enemy extends Character {
	
	// �Ű������� �޴� �����ڸ� �����ؼ� ������ ���� �����ϰԲ� �Ѵ�
	public Enemy() {}
	public Enemy(int num) {
	}
	
	// ���ʹ� ������ �����Ѵ�. �Ű������� �޾Ƽ� 3���� �ϳ��� �����ϰԲ� ����
	private void selectEnemy() {
	
	}
	
	// ���ʹ��� ���� �Լ� �Ű������� �÷��̾�� ���ʹ̸� �޴´�
	@Override
	public void Attack(Character enemy) {
		
		/* ���⿡�� ���� ������ �ߴ�, ���� �������� �޾Ҵٸ� �������� �Ѵ�.
		 * ���� ���� �������� �޾Ҵ����� �ش� �Լ��� �ҷ��;� �Ѵ�.
		 */
		atk = this.TakeDamage(enemy);
		int damage = this.atk;
		}
		
	
	private int TakeDamage(Character enemy) {
		
		return 0;
	}
	// �ش� Ŭ������ �������� �޾������� �Լ�, �Ű������� �÷��̾�� ���ʹ̸� �޴´�
	public void TakeDamage(int damage) {
		hp -= damage;
		if (hp <= 0) {
			hp = 0;
		}
	}
}
