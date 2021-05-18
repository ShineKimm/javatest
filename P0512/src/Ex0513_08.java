import java.util.Scanner;

public class Ex0513_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1-100까지 중 1개의 숫자를 랜덤으로 받아 숫자를 맞추는 프로그램을 구현하시오
		// 현재 입력한 숫자들을 마지막에 모두 출력해 보세요
		int randomNO = (int)((Math.random()*100)+1);
		int[] input_save = new int[10];
		int count = 0;
		while (true) {
			//10번 도전확인
			if (count > 10) {
				System.out.println("프로그램을 종료합니다.");
				count = count-1;
				break;
			}
			input_save[count] = scan.nextInt();
			System.out.println("숫자를 입력하세요.>>");
			int input = scan.nextInt();
			
			if (randomNO==input) {
				System.out.println("정답입니다.");
				break;
			}else if(randomNO<input){
				System.out.println("입력한 숫자보다 작습니다.");
			}else {
				System.out.println("입력한 숫자보다 큽니다");
			}
			count ++;
		}
		System.out.println("정답"+randomNO);
		System.out.println("총 도전한 횟수: "+count+1);
		System.out.println("입력한 숫자 : ");
		for (int i = 0; i < count+1; i++) {					
			System.out.println(input_save[i]);
		}
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("글자를 입력하세요.>>");
//		String input = scan.next();
//		//한국직업전문학교
//		//전 자만 출력하시오.
//		for (int i = 0; i < input.length(); i++) {
//			System.out.println(input.charAt(i));
//		}
//
//		System.out.println(input.substring(0, 4));
//		//입력한 모든 글자를 1개씩 출력하시오
	}

}
