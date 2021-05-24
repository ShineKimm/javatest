import java.util.Scanner;

public class Ex0524_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Point[] in_point = new Point[3];
		
		
		for (int i = 0; i < in_point.length; i++) {
			in_point[i] = new Point();
			System.out.println(i+"번째 X좌표를 입력하세요.");
			in_point[i].x = scan.nextInt();
			System.out.println("1번째 Y좌표를 입력하세요.");
			in_point[i].y = scan.nextInt();
		}
		System.out.println("1번째 X좌표를 입력하세요.");
		int x1 = scan.nextInt();
		System.out.println("1번째 Y좌표를 입력하세요.");
		int y1 = scan.nextInt();
		System.out.println("2번째 X좌표를 입력하세요.");
		int x2 = scan.nextInt();
		System.out.println("2번째 Y좌표를 입력하세요.");
		int y2 = scan.nextInt();
		System.out.println("3번째 X좌표를 입력하세요.");
		int x3 = scan.nextInt();
		System.out.println("3번째 Y좌표를 입력하세요.");
		int y3 = scan.nextInt();
		
		
		Point[] p = {new Point(in_point[0].x,in_point[0].y),
				new Point(in_point[1].x,in_point[1].y),
				new Point(in_point[2].x,in_point[2].y)};
		Triangle t1 = new Triangle(p);
		
		
		double[] point_length = new double[3];
		for (int i = 0; i < p.length; i++) {
			System.out.printf("%d번쨰 x,y좌표 : %d, %d \n");
			System.out.println("x2,y2 좌표 : "+t1.p[1].x+","+t1.p[1].y);
			System.out.println("x3,y3 좌표 : "+t1.p[2].x+","+t1.p[2].y);
			// x1,y1에서 x2,y2까지의 길이
			//Math.sqrt(xx+yy); //삼각형 대각선의 길이
			//Math.pow->제곱 -> (p[0],x
			if (i<2) {
				point_length[i] = Math.sqrt((Math.pow(t1.p[i].x-t1.p[1+1].), 2)+
						Math.pow(t1.p[0].y-t1.p[1].y, 2); 
				
			}
			System.out.println();
			
		}//for
		
		
		
		
		
		
	}

}
