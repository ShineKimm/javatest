import java.util.Scanner;

public class Ex0513_05 {

	public static void main(String[] args) {
		// [5][5] 배열을 생성 후 1~25까지 넣고 출력하시오
		// 중복하용하지 않음
		
		Scanner scan = new Scanner(System.in);
		System.out.println("만들고 싶은 1번째 배열을 입력 >>"); //5,4 배열을 만들려면
		int in_arr1 = scan.nextInt();
		System.out.println("만들고 싶은 1번째 배열을 입력 >>"); //5,4 배열을 만들려면
		int in_arr2 = scan.nextInt();
		
		//5,4입력 ->  [5][4]
		
		int[][] array = new int[5][5];
		int[][] ball = new int[25][25];
		
		// 번호 입력
		for (int i = 0; i < ball.length; i++) {
				ball[i][i] = i+1;
				//System.out.print(ball[i][i]+ "\t");
		}
		
		// 번호 섞기
		
		int temp = 0;
		int random_no = 0;
		
		for (int i = 0; i < 200; i++) {
				random_no =(int)((Math.random()*25)+1);
				temp = ball[0][0];
				ball[0][0] = ball[random_no][random_no];
				ball[random_no][random_no] = temp;
		}
		
		// 번호 출력
		for (int i = 0; i < ball.length; i++) {
			for (int j = 0; j < ball.length; j++) {
				array[i][j]=ball[5*i+j][5*i+j];
			}
		}
		
	}

}
