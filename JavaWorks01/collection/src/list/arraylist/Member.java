package list.arraylist;

//Member Ŭ������ vo(value object) �Ǵ� dto(data transfer object)
public class Member {
	private int memberId;	//��� ���̵�
	private String name;		//��� �̸�
	
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
