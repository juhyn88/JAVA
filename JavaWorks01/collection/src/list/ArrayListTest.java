package list;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
			ArrayList<String> vegeList = new ArrayList<>();
			
			//�ڷ� �߰�
			vegeList.add("����");
			vegeList.add("����");
			vegeList.add("����");
			vegeList.add("����");
			
			//�˻�
			System.out.print(vegeList.get(3));
			System.out.print(vegeList.get(2));
			
			//��ü ����� ����
			System.out.print("��ä�� ���� : " + vegeList.size() );
			
			//�ڷ� ��ü ��ȸ
			for(int i =0; i<vegeList.size(); i++) {
				String list = vegeList.get(i);
				System.out.print(list + " ");
			}
			
			//Ư�� ��ġ�� �ڷ� �߰�
			vegeList.add(2,"����");
			System.out.println();
			
			//���� for
			for(String list : vegeList) System.out.print(list + " ");
			
			//�ߺ� �߰�
			vegeList.add("����");
			System.out.println();
			for(String list : vegeList) System.out.print(list + " ");
			
			//�ڷ� ����, ����
			vegeList.set(3, "����");		//3�� �ε���
			System.out.println();
			for(String list : vegeList) System.out.print(list + " ");
			
			//�ڷ� ����
			vegeList.remove(0);		//0�� �ε���
			System.out.println();
			for(String list : vegeList) System.out.print(list + " ");

	}

}
