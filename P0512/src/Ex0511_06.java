import java.util.Iterator;

public class Ex0511_06 {

	public static void main(String[] args) {
		//로또 맞추기 - 45
		int[] ball = new int[45];
		for (int i = 1; i < ball.length; i++) {
			ball[i]=i+1;
//			System.out.println(i+1);
		}
		//번호섞기
		int temp=0; //저장할 변수초기화
		for(int i=0; i<500; i++) {
			int rno=(int)(Math.random()*45);
			temp = ball[0]; //0번방에 있는값을 임시저장 temp에 넣어둠
			ball[0] = ball[rno]; // 0번방에 랜덤숫자를 넣음
			ball[rno] = temp;
		}
		//출력
		System.out.println("로또 랜덤 번호");
		for (int i = 0; i < 6; i++) {
			System.out.println(ball[i]+" ");
			
		}
	}

}
