package day19;
abstract class Parent{
	String name = "�θ�";
	abstract void disp();		//�߻� �޼ҵ�
	void line() {}				//�Ϲ� �޼ҵ�
}
class Son extends Parent{

	@Override
	void disp() {
		System.out.println("�Ƶ��Դϴ�.");
	}
	
}
class Daughter extends Parent{

	@Override
	void disp() {
		System.out.println("���Դϴ�.");
	}
	
}
public class AbstractTest {

	public static void main(String[] args) {
		//����, �߻�Ŭ������ new �ν��Ͻ�ȭ �Ұ���
		//Parent papa = new Parent();
		Son son = new Son();
		son.disp();
		Daughter daugh = new Daughter();
		daugh.disp();
		
		Parent pa = new Son();
		pa.disp();
		pa = new Daughter();
		pa.disp();
		
	}

}
