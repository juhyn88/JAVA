package chainshop;

public class MainClass {

	public static void main(String[] args) {
		HeadShop shop1 = new Shop1();
		shop1.sellDoenjangJJigae();
		shop1.sellKimchiJJigae();
		shop1.sellBibimBap();
		System.out.println("================");
		
		HeadShop shop2 = new Shop2();
		shop2.sellDoenjangJJigae();
		shop2.sellKimchiJJigae();
		shop2.sellBibimBap();
		System.out.println("================");
	}

}
