package day17;

class Over {
	public int sub(int num1, int num2) {
		return num1-num2;
	}
}
class OverSub extends Over{
	public int sub(int num1, int num2) {
		//�������̵� : �θ��� �޼ҵ带 ������
		return num1>num2 ? num1-num2 : num2-num1;
	}
	

}
public class OverRide {
	public static void main(String[] args) {
		Over cal1 = new Over();
		//                    sub() : �� ���� ����
		System.out.println(cal1.sub(10, 20)); //(���) -10
		
		OverSub cal2 = new OverSub();
		//System.outprintln(cal2,sub(10.20)); //(���) -10
		//                       sub() : ū ����-���� ����
		System.out.println(cal2.sub(10, 20)); //(���)  10
	}
}

/*
=== OverLoad(ing):�����ε� ===
	(�� Ŭ���� ������)
	  �޼ҵ���� ����, �Ű������� ���� �Ǵ� �ڷ���� �ٸ�!
	  
=== OverRide:�������̵� ===
	(�� Ŭ���� ����)
	   �޼ҵ���� ����, �Ű������� ������ �ڷ�� ��� ����!
*/