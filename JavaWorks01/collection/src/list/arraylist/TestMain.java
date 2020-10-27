package list.arraylist;

public class TestMain {

	public static void main(String[] args) {
		  Member chu = new Member();
		  chu.setMemberId(1001);
		  chu.setName("추신수");
		  
		  Member jang = new Member();
		  jang.setMemberId(1002);
		  jang.setName("장한나");
		  
		  Member son = new Member();
		  son.setMemberId(1003);
		  son.setName("손흥민");
		  
		  Member ryu = new Member();
		  ryu.setMemberId(2001);
		  ryu.setName("류현진");
		  
		  //회원 추가
		  MemberDAO memberList = new MemberDAO();
		  memberList.addMember(chu);
		  memberList.addMember(jang);
		  memberList.addMember(son);
		  memberList.addMember(ryu);
		
		  //회원 조회
		  memberList.showAllMember();
		  
		  //회원 삭제
		  memberList.removeMember(1001);
		  System.out.println();
		  
		  memberList.removeMember(1005);
		  
		//회원 조회
		  memberList.showAllMember();

	}

}
