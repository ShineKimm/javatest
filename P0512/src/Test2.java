import java.util.Scanner;

public class Test2 {

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
		//입력
		System.out.println("로또번호 6개를 입력해주세요");
		for (int i = 0; i < input.length; i++) {
			input[i] = scan.nextInt();
		}
		//출력
		for (int i = 0; i < input.length; i++) {
			System.out.println(i+"번째 입력값은"+input[i]+"입니다.");
		}
		//2. 로또번호 배열생성
		int[] lno = new int[45];
		//3. 로또번호 순차적으로 값넣기
		for (int i = 0; i < lno.length; i++) {
			lno[i] = i+1;
		}
		//4. 로또번호 섞기
		for (int i = 0; i < 200; i++) {
			
			int temp = 0;
			int randomNo = 0;
			randomNo = (int)(Math.random()*45);
			temp = lno[0];
			lno[0] = lno[randomNo];
			lno[randomNo] = temp;
		}
		
		//5. 로또번호 6개 출력하기
		System.out.println("로또번호 6개 출력");
		for (int i = 0; i < 6; i++) {
			System.out.println(lno[i]);
		}
		System.out.println();
		//6. 당첨번호 개수 출력
		int count = 0;
		int win[] = new int[6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (input[i]==lno[j]) {
					win[count]=input[i];
					count++;
				}
			}
		}
		// 7. 당첨번호 출력
		System.out.println("당첨번호 개수" +count);
		System.out.println("당첨번호");
		for (int i = 0; i < count; i++) {
			System.out.println(win[i]+ " ");
		}
		System.out.println();
	}

}
