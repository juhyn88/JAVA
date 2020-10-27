package refclass;


public class Circle {
	int radius;
	Point center;		//클래스 Point 자료형
	
	
	public Circle(int cx, int cy, int radius) {
		center = new Point(cx,cy) ;
		this.radius = radius;
		System.out.println("원(반지름= " + radius + ") 생성자");
			
		}
	}

