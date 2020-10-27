package list.arraylist;

import java.util.ArrayList;


//Member�� ����Ͽ� �����ϴ� Ŭ���� dao(data access object)
public class MemberDAO {
	private ArrayList<Member> arrayList;
	
	public MemberDAO() {
		arrayList = new ArrayList<>();
	}
	
	//ȸ�� �߰� �޼���
	public void addMember(Member member) {
		arrayList.add(member);
	}
	public void showAllMember() {
		/*
		for(int i =0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}*/
		for(Member member : arrayList)
			System.out.println(member);
	}
	
	//ȸ�� ���� �޼���
	public boolean removeMember(int memberId) {
		for(int i = 0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int dbMemberId = member.getMemberId();	//dbMemberId  -> �̹� ������ memberId
			if(dbMemberId == memberId) {							//memberId - �Ű������� ��û���� memberId
				arrayList.remove(i);
				System.out.println(memberId + "��(��) �����Ǿ����ϴ�.");
				
				return true;
			}
		}
		System.out.println(memberId + "��(��) �������� �ʽ��ϴ�.");
		return false;
	}
}
