
public class Ex0512_06_01 {

	public static void main(String[] args) {
		// 로또 맞추기 - 45
		int[] ball = new int[45];
		// 번호넣기
		for(int i=0;i<45;i++) {
			ball[i]=i+1;
		}
		
		//번호섞기
		int temp=0; //저장할 변수초기화
		for(int i=0;i<200;i++) {
			// (int)(Math.random()*100); //0-99
			int rno = (int)(Math.random()*45); //0-44
			temp = ball[0]; //0번배열값을 먼저 임시저장변수에 저장
			ball[0] = ball[rno]; //0번배열장소에 랜덤숫자를 넣음.
			ball[rno] = temp;
		}
		
		//출력
		System.out.println("[ 로또 랜덤 번호 ]");
		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
		
		

	}

}
