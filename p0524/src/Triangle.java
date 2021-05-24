
public class Triangle extends Shape {

	Point[] p;

	Triangle(Point[] p) {
		this.p = p;
	}

	Triangle(Point p1, Point p2, Point p3) {
		p = new Point[] { p1, p2, p3 };
	}
	//삼각형x,y좌표출력
	void triangle_point() {
		for(int i=0;i<p.length;i++) {
			System.out.printf("[ %d번째 x,y좌표 : %d, %d ] \n",
					(i+1),p[i].x,p[i].y);
		}	
	}
	//삼각형 넓이 출력
	void triangle_area() {
		//반둘레 구하는 공식 s = 0.5*(length1+ength1+ength1)
		
	}

}
