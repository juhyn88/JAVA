package list;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> aniList = new Vector<>();
		
		//�ڷ� �߰�
		aniList.add("bear");
		aniList.add("chicken");
		aniList.add("cow");
		
		//�ڷ��� �Ѱ���
		System.out.println("������ �� : " + aniList.size());
		
		//�ڷ� ��ȸ
		for(String ani : aniList) System.out.print(ani  + " ");
		System.out.println();
		
		//�ڷ� ����
		aniList.set(1, "dog");		//set() -> ����, ����
		for(String ani : aniList) System.out.print(ani  + " ");
		System.out.println();
		
		//�ڷ� ����
		aniList.remove(2);			//2�� �ε��� ����
		for(String ani : aniList) System.out.print(ani  + " ");
		
	}

}
