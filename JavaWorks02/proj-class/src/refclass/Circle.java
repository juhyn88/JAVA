package refclass;


public class Circle {
	int radius;
	Point center;		//Ŭ���� Point �ڷ���
	
	
	public Circle(int cx, int cy, int radius) {
		center = new Point(cx,cy) ;
		this.radius = radius;
		System.out.println("��(������= " + radius + ") ������");
			
		}
	}

