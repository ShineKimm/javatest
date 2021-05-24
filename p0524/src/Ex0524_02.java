
public class Ex0524_02 {

	public static void main(String[] args) {

		Circle c1 = new Circle();
		System.out.println("c1의 x, y좌표 : " + c1.center.x + ", " + c1.center.y);
		System.out.println("c1의 반지름 : " + c1.r);
		System.out.println("c1의 넓이 : "+Math.PI*Math.pow(c1.r, 2));

		Circle c2 = new Circle(new Point(150, 150), 50);
		System.out.println("c1의 x, y좌표 : " + c2.center.x + ", " + c2.center.y);
		System.out.println("c1의 반지름 : " + c2.r);
		System.out.println("c1의 넓이 : "+Math.PI*Math.pow(c2.r, 2));

		
		Point[] p = {new Point(100, 100), new Point(140, 50), new Point(200, 100)};

		Triangle t1 = new Triangle(p);
		System.out.println("t1의 1번째 좌표 : " + t1.p[0].x + ", " + t1.p[0].y);
		System.out.println("t1의 2번째 좌표 : " + t1.p[1].x + ", " + t1.p[1].y);
		System.out.println("t1의 3번째 좌표 : " + t1.p[2].x + ", " + t1.p[2].y);

		
		
	}
}
