import java.util.Scanner;

public class Ex0511_07 {

	public static void main(String[] args) {
		//번호 1-45번까지 6개를 입력받아
		//랜덤로또번호 6개와 입력한 6개를 출력하시오
		Scanner scan = new Scanner(System.in);
		int[] rno = new int[6];
		//입력
		for (int i = 0; i < rno.length; i++) {
			System.out.println((i+1)+"번호를 입력하세요>>");
			rno[i] = scan.nextInt();
		//출력	
		}
		System.out.println("입력한 번호");
		for (int i = 0; i < rno.length; i++) {
			System.out.println(rno[i]);
		}
		
		//로또 맞추기 - 45
		int[] ball = new int[45];
		for (int i = 1; i < ball.length; i++) {
			ball[i]=i+1;
//			System.out.println(i+1);
		}
		//번호섞기
		int temp=0; //저장할 변수초기화
		for(int i=0; i<500; i++) {
			int rno1=(int)(Math.random()*45);
			temp = ball[0]; //0번방에 있는값을 임시저장 temp에 넣어둠
			ball[0] = ball[rno1]; // 0번방에 랜덤숫자를 넣음
			ball[rno1] = temp;
		}
		//출력
		System.out.println("로또 랜덤 번호");
		for (int i = 0; i < 6; i++) {
			System.out.println(ball[i]+" ");
			
		}
		
	}

}
