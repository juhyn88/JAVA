package classpart;

public class Employee {
		int companyID;
		String name;
		
		//������ �����ε�(������ �̸��� ����, �Ű������� �ڷ����̳� ������ �ٸ�)
		public Employee(int companyID) {
				this.companyID = companyID;
		}
		
		public Employee(int companyID, String name){
				this.companyID = companyID;
				this.name = name;
		}
		
		public void showInfo() {
				System.out.println("��� : " + companyID );
				System.out.println("�̸� : " + name);
		}
	
}
