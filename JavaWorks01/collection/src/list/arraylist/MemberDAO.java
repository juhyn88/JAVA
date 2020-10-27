package list.arraylist;

import java.util.ArrayList;


//Member를 사용하여 관리하는 클래스 dao(data access object)
public class MemberDAO {
	private ArrayList<Member> arrayList;
	
	public MemberDAO() {
		arrayList = new ArrayList<>();
	}
	
	//회원 추가 메서드
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
	
	//회원 삭제 메서드
	public boolean removeMember(int memberId) {
		for(int i = 0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int dbMemberId = member.getMemberId();	//dbMemberId  -> 이미 생성된 memberId
			if(dbMemberId == memberId) {							//memberId - 매개변수로 요청받은 memberId
				arrayList.remove(i);
				System.out.println(memberId + "가(이) 삭제되었습니다.");
				
				return true;
			}
		}
		System.out.println(memberId + "가(이) 존재하지 않습니다.");
		return false;
	}
}
