package day19;
interface Animal{
	//�߻�޼ҵ常 ����
	abstract void kind();			//�߻�޼ҵ�
	void breathe();					//�޼ҵ���� abstract���� ����
}
class Elephant implements Animal{

	@Override
	public void kind() {
		System.out.println("������");
	}

	@Override
	public void breathe() {
		System.out.println("���ķ� ȣ����");
	}
	
	
}
class Fish implements Animal{

	@Override
	public void kind() {
		System.out.println("���");
	}

	@Override
	public void breathe() {
		System.out.println("�ư��̷� ȣ����");
	}
	
}

public class InterfaceTest {

	public static void main(String[] args) {
		//�������̽�
		//:�߻�Ŭ������ ���, �߻�Ŭ���������߻�ȭ ������ �� ����
		//:(�Ϲ�)�ʵ�� (�Ϲ�)�޼ҵ带 ���� ����
		//:�߻�޼ҵ�"��"����
		//:�������̽��� �ٵ�� Ŭ�������� �߻�޼ҵ带 �������̵� �ؾ߸� �Ѵ�.
		//:(����)-------����---->(����)
		
		//����,�������̽��� ��ü ���� �Ұ���
		//Animal ani = new Elephant();
		
		//�������̽��� �������� �����ϴ�.
		Animal ani = new Elephant;
		ani.kind();
		ani.breathe();
		
		ani = new Fish();
		ani.kind();
		ani.breathe();
		
	}

}
