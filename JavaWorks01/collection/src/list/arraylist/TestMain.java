package list.arraylist;

public class TestMain {

	public static void main(String[] args) {
		  Member chu = new Member();
		  chu.setMemberId(1001);
		  chu.setName("�߽ż�");
		  
		  Member jang = new Member();
		  jang.setMemberId(1002);
		  jang.setName("���ѳ�");
		  
		  Member son = new Member();
		  son.setMemberId(1003);
		  son.setName("�����");
		  
		  Member ryu = new Member();
		  ryu.setMemberId(2001);
		  ryu.setName("������");
		  
		  //ȸ�� �߰�
		  MemberDAO memberList = new MemberDAO();
		  memberList.addMember(chu);
		  memberList.addMember(jang);
		  memberList.addMember(son);
		  memberList.addMember(ryu);
		
		  //ȸ�� ��ȸ
		  memberList.showAllMember();
		  
		  //ȸ�� ����
		  memberList.removeMember(1001);
		  System.out.println();
		  
		  memberList.removeMember(1005);
		  
		//ȸ�� ��ȸ
		  memberList.showAllMember();

	}

}
