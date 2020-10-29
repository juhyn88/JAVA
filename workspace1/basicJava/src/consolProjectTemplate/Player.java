package consolProjectTemplate;

import java.util.Scanner;

// ������ ���! �÷��̾��� Ŭ����, ���� Ŭ������ ��� �޴´�
public class Player extends Character {
	
	private double maxExp;
	private int level;
	private int damage;

	public Player (String name, int lev, int hp, int atk, int exp){
		super(name,lev,hp,atk,exp);		// �Ű����� (�̸�, ����, ü��, ���ݷ�, ���� ����ġ) ���� �޴� �����ڸ� �����Ѵ�.
	}

	// ���� ����ġ���� �����ؾ� �� ����ġ�� �������� ���� �Լ�
	// �ش� �������� �������ְ� �ּ� Ǯ�� ����ϸ� �ȴ�
	public int getMaxExp() {
		int exp;
		return (int)(maxExp = level * 100 * 1.3);
	}
	
	// �÷��̾��� ���� �Լ�, �Ű������� �÷��̾�� ���ʹ̸� �޴´�
	public void Attack(Character enemy) {
		
		// ���ʹ��� ü�¿� ���� ������ �ϰų� �������� �ְ� ������
		// ���ʹ��� ü���� 0�� �Ǿ��� ��� ����ġ�� ��� �Լ��� �ҷ����ְ� ������ش�
		
		enemy.hp -= this.atk;
		enemy.atk = this.TakeDamage();
		if (hp == 0) {
			exp++;
		}
	}
	
	private int TakeDamage() {
	
		return 0;
	}
	
	// �÷��̾ �������� �޴� �Լ�, �Ű������� �÷��̾�� ���ʹ̸� �޴´�

	public void TakeDamage(int damage) {
		hp -= damage;
	}
	
	// ���� ���� �߸��� ��� ����ġ�� ��� ���ִ� �Լ�
	private void getExp() {
		/* ���� ����ġ�� �����ؾ� �ϴ� ����ġ ���� ����Ѵ�
		 * ���� ����ġ�� �����ؾ� �� ����ġ�� ������ �����������ش�
		 * ������ ������ ü�°� ���ݷ�, ������ �����Ӱ� �ø���.
		 * 
		 * ���� ���� ����ġ�� ���� ���� ����ġ�� �Ѿ��� ��� 
		 * ���� ����ġ�� �״�� ������ �´�
		 */
		
		if (exp >= maxExp) {
			lev++;
			exp -= maxExp;
			
		}
	
	}
}
