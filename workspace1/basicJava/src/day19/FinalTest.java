package day19;
class Animal{
	public void one() {}
	public final void two() {}
}
class Elephant extends Animal{
	public void one() {
		System.out.println("one() override!");
	}
	//public void two() {}
	//����,�θ��� final �޼ҵ�� override �� �� ����.(���O, ������X)
}
public class FinalTest { 
	static final int ABC = 123;
	public static void main(String[] args) {
		Elephant e = new Elephant();
		e.one();			//7������ override�� one()�޼ҵ�
		e.two();			//4������ two()�޼ҵ�
		int a = 3;			//��������
		a = 30;
		a = 300;
		final int b = 7;
		//b = 70;			//����,final ������ ���ο�� ������ �� ����.
		//++b;
		final double PI = 3.14; 
	}

}
//final ��	��:������ ���ȭ
//
//final �޼ҵ� : ���̻�(���Ŀ���)override(������)�� �� ����
//final Ŭ���� : ����Ŭ����,���̻� �ڽ�Ŭ�������� �� �� ����
