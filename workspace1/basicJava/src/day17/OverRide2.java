package day17;

class School extends Object {  //extends Object생략되어 있음
	public String name = "학교";
	public void disp() {
		System.out.println(this.name);
	} //class-end
} //class-end

class MiddleSchool extends School {
	
}

class HighSchool extends School {
	public String name = "고등학교";

	@Override  // annotation 주석
	public void disp() {
		System.out.println("구로" + this.name);
	}
	
}

class College extends School {

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		super.disp();
	}
	
}
public class OverRide2 { //실행 클래스
	public static void main(String[] args) {
		MiddleSchool ms = new MiddleSchool();
		System.out.println(ms.name);
		ms.disp();
		
		HighSchool hs = new HighSchool();
		System.out.println(hs.name);
		hs.disp();
	}

}
