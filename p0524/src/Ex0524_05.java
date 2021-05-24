import java.util.Scanner;

public class Ex0524_05 {

	public static void main(String[] args) {
		//triangle객체 Point 3개를 입력받아 각가의 길이를 구하시오.
		Scanner scan = new Scanner(System.in);
		Point[] in_point = new Point[3];
		double[] point_length = new double[3];
		//좌표 3개 입력받기
		for (int i = 0; i < in_point.length; i++) {
			in_point[i] = new Point();
			System.out.println((i+1)+"번쨰 x좌표를 입력하세요");
			//0,0 10,0 10,10 컴마를 사용해서 넣기
			String input = scan.next();
			String[] str = input.split(",");
			Integer.parseInt(str[0]); //String -> int로 변환
			Integer.parseInt(str[1]); //String -> int로 변환
			// '5'-'0' -> 5    0+""="0"
			
			//in_point[i].x = scan.nextInt();
			System.out.println((i+1)+"번쨰 y좌표를 입력하세요");
			//in_point[i].y = scan.nextInt();
		}
		
		Point[] p = {new Point(in_point[0].x,in_point[0].y),
			new Point(in_point[1].x,in_point[1].y),
			new Point(in_point[2].x,in_point[2].y)};
		Triangle t1 = new Triangle(p);
		
		//삼각형x,y좌표출력
//		void triangle_point() {
//			
//		}
		
		//삼각형 좌표 출력
		for(int i=0;i<p.length;i++) {
			System.out.printf("[ %d번째 x,y좌표 : %d, %d ] \n",
					(i+1),t1.p[i].x,t1.p[i].y);
		}
		// 삼각형 좌표 길이
		for(int i=0;i<p.length;i++) {
			if(i<2) {
				point_length[i] = Math.sqrt((Math.pow((t1.p[i].x-t1.p[i+1].x),2)+
						Math.pow((t1.p[i].y-t1.p[i+1].y),2)));
			}else {
				point_length[i] = Math.sqrt((Math.pow((t1.p[i].x-t1.p[i-2].x),2)+
						Math.pow((t1.p[i].y-t1.p[i-2].y),2)));
			}
			
			System.out.printf("%d번째 길이 : %.2f \n",(i+1),point_length[i]);
		}
		
	}

}
