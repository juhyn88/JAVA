package list;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
		Vector<String> aniList = new Vector<>();
		
		aniList.addElement("cat");
		aniList.addElement("dog");
		aniList.addElement("pig");
		
		System.out.println("Vector ��ҵ��� ������ ����.");
		for(int i = 0; i<aniList.size(); i++) {
			System.out.println(i + "��: " + aniList.elementAt(i));
		}
		
		Enumeration<String> enu = aniList.elements();
		System.out.println("Vector�� ��ü�� aniList�� ������ Enumeration ��ҵ�");
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
	}

}
