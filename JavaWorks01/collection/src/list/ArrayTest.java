package list;

public class ArrayTest {

	public static void main(String[] args) {
		//�迭 �ڷ� ����
		String[] array1 = new String[] {"����", "����", "����", "����"};
		String[] array2 = new String[5];
		
		//�ڷ� �߰� - "����"
		array2[0] = "����";
		array2[1] = "����";
		array2[2] = "����";
		array2[3] = "����";
		array2[4] = "����";
		
		//�ڷ� ��ȸ
		for(int i = 0; i <array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		
		//�ڷ� ����
		array2[3] = "����";
		for(String arr : array2) System.out.print(arr + " ");
				
		
	}

}
