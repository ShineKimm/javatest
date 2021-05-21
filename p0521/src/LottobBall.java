
public class LottobBall {
	static int[] ball = new int[45];
	
	static {
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i+1;
		}
		int temp = 0; //임시데이터저장변수
		int ball_num = 0; //배열랜덤번호사용
		for(int i=0; i<200; i++) {
			ball_num = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[ball_num];
			ball[ball_num] = temp;
		}
	}
}
