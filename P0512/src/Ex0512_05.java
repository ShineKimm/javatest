import java.util.Iterator;
import java.util.Scanner;

public class Ex0512_05 {

	public static void main(String[] args) {
		//1. 6개 입력받아 출력
		//2. 로또번호 배열생성
		//3. 로또번호 순차적으로 값넣기
		//4. 로또번호 섞기
		//5. 로또번호 6개 출력하기
		//6. 당첨번호 개수 출력
		//7. 당첨번호 출력
		
		Scanner scan = new Scanner(System.in);
		int[] input = new int[6];
		//번호입력
		for (int i = 0; i < input.length; i++) {
			System.out.println((i+1)+"번호를 입력해주세요");
			input[i] = scan.nextInt();
		}
		//번호출력
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		
		//2. 로또번호 배열생성
		int[] ball = new int[45];
		
		//3. 로또번호 순차적으로 값넣기
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i+1;
		}
		//4. 로또번호 섞기
		for (int i = 0; i < 200; i++) {
			int temp = 0;
			int rno = 0;
			rno = (int)((Math.random()*45));
			temp = ball[0];
			ball[0] = ball[rno];
			ball[rno] = temp;
		}
		//5. 로또번호 출력
		System.out.println("로또 번호 출력");
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i]+ " ");
		}
		System.out.println();
		//7. 당첨번호 출력
		int count = 0;
		int[] win = new int[6]; 
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (input[i]==ball[j]) {
				win[count]=input[i];
				count++;
				}
			}
		}
		System.out.println("당첨번호 개수 \n"+count);
		System.out.println("당첨번호");
		for (int i = 0; i < count; i++) {
			System.out.print(win[i]+" ");
		}
		System.out.println();
	}
}
