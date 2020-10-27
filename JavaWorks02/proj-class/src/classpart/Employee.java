package classpart;

public class Employee {
		int companyID;
		String name;
		
		//생성자 오버로딩(생성자 이름은 같고, 매개변수의 자료형이나 개수가 다름)
		public Employee(int companyID) {
				this.companyID = companyID;
		}
		
		public Employee(int companyID, String name){
				this.companyID = companyID;
				this.name = name;
		}
		
		public void showInfo() {
				System.out.println("사번 : " + companyID );
				System.out.println("이름 : " + name);
		}
	
}
