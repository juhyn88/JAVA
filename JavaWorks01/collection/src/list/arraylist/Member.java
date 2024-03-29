package list.arraylist;

//Member 클래스를 vo(value object) 또는 dto(data transfer object)
public class Member {
	private int memberId;	//멤버 아이디
	private String name;		//멤버 이름
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", name=" + name + "]";
	}
	
	
	
}
