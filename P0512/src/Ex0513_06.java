import java.util.Scanner;

public class Ex0513_06 {

	public static void main(String[] args) {
		//[5][5]배열 -> 1~25까지 랜덤숫자를 넣어서 출력하시오.
		Scanner scan = new Scanner(System.in);
		
		int[] ball = new int[25];
		
		// 25까지 숫자 넣기
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i+1;
			//System.out.println(ball[i]);
		}
		
		//숫자 섞기
		int temp = 0;
		int random_no =0;
		for (int i = 0; i < 50; i++) {
			random_no = (int)((Math.random()*25));
			temp = ball[0];
			ball[0] = ball[random_no];
			ball[random_no] = temp;
		}
		// 숫자입력
		int[][] array = new int[5][4];
		
		for (int i = 0, k=0 ; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = ball[k];
				System.out.println(array[i].length);
				k++;
			}
		}
		//숫자 출력
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
