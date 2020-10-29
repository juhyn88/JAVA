package day18;

public class Pizza {
	String toppings;                        //피자의 토핑 종류
	public static int count;                //피자의 판매 개수
	public Pizza(String toppings) {         
		this.toppings = toppings;           //피자의 토핑 종류 저장(필드 초기화)
		                                    //피자의 판매갯수증가
	}
	public static void main(String[] args) {
		Pizza p1 = new Pizza("Super Supreme");
		Pizza p2 = new Pizza("Cheese");
		Pizza p3 = new Pizza("Pepperoni");
		int n = Pizza.count;			// static 변수는 클래스 이름으로 직접 창조함.
									// 클래스명.static필드명
//		int n = p1.count
//		int n = p2.count
//		int n = p3.count
		//System.out.println("지금까지 판매된 피자 갯수:"+ n +"판");
	}

}
