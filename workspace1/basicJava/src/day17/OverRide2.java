package day17;

class School extends Object {  //extends Object�����Ǿ� ����
	public String name = "�б�";
	public void disp() {
		System.out.println(this.name);
	} //class-end
} //class-end

class MiddleSchool extends School {
	
}

class HighSchool extends School {
	public String name = "����б�";

	@Override  // annotation �ּ�
	public void disp() {
		System.out.println("����" + this.name);
	}
	
}

class College extends School {

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		super.disp();
	}
	
}
public class OverRide2 { //���� Ŭ����
	public static void main(String[] args) {
		MiddleSchool ms = new MiddleSchool();
		System.out.println(ms.name);
		ms.disp();
		
		HighSchool hs = new HighSchool();
		System.out.println(hs.name);
		hs.disp();
	}

}
