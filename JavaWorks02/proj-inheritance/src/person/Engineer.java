package person;

public class Engineer extends Person{
	int companyID;

		public Engineer(String name, int age, int companyID) {
			super(name,age);	//Person Å¬·¡½º
			this.companyID = companyID;
		}
}
