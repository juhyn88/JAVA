package chainshop;

public class Shop1 extends HeadShop{
	
	public Shop1() {
		System.out.println("대학가 매장입니다.");
	}
	
	@Override																	//오버라이드(재정의) 에너테이션
	public void sellDoenjangJJigae() {				//메소드 재정의
		System.out.println("된장찌개 : 5,500원" );
	}
	@Override
	public void sellKimchiJJigae() {
		System.out.println("김치찌개 : 6,000원");
			
		}
	@Override
	public void sellBibimBap() {
		System.out.println("비빔밥 : 6,500원" );
	}
}
