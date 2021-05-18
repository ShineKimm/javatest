import java.util.Scanner;

public class Ex0512_04 {

	public static void main(String[] args) {
		//3개를 입력받아 출력하고
		// 로또번호 3개를 출력해보세요
		//1. 3개 입력받아 출력
		//2. 로또번호 배열생성
		//3. 로또번호 순차적으로 값넣기
		//4. 로또번호 섞기
		//5. 로또번호 3개 출력하기
		Scanner scan = new Scanner(System.in);
		int[] input = new int[3]; // 입력받을 배열
		
		
		//번호 입력
		for (int i = 0; i < input.length; i++) {
			System.out.println((i+1)+"번호를 입력하세요");
			input[i] = scan.nextInt();
		}
		//번호 출력
		System.out.println("로또번호 ---------");
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
		System.out.println();
		
		//로또 맞추기 - 45
		//1. 번호 배열생성
				int[] ball = new int[45];
				for (int i = 1; i < ball.length; i++) {
					ball[i]=i+1; //2. 번호 넣기
//					System.out.println(i+1);
				}
				//3. 번호섞기
				for(int i=0; i<200; i++) {
					int temp=0; //저장할 변수초기화
					int rno1=0;
					rno1=(int)(Math.random()*45);
					temp = ball[0]; //0번방에 있는값을 임시저장 temp에 넣어둠
					ball[0] = ball[rno1]; // 0번방에 랜덤숫자를 넣음
					ball[rno1] = temp;
				}
				//4. 로또번호 출력
				System.out.println("로또 랜덤 번호");
				for (int i = 0; i < 6; i++) {
					System.out.println(ball[i]+" ");
				}
				
				//5. 같은 번호 찾기
				int count = 0;
				int[] win = new int[6]; // 당첨번호
				for(int i=0; i<6; i++) {
					for(int j=0; j<6; j++) {
						if(input[i] == ball[j]) {
							win[count]=input[i]; // 당첨번호를 당첨배열에 저장
							count++;
							//break;
						}
					}
				}
				System.out.println("당첨번호 개수 : "+count);
				System.out.println("당첨번호 확인 : "+ win);
				for (int i = 0; i < count; i++) {
					System.out.println(win[i]+" ");
					
				}
				System.out.println();
	
	}

}
