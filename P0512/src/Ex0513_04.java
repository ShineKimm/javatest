
public class Ex0513_04 {

	public static void main(String[] args) {
		
		//배열[3][3] = 1-10 까지 랜덤 숫자를 넣어서 출력하시오
		// 값이 중복허용
		
		int[][] input = new int[3][3];
		
		
		//번호 배열 생성
		int[][] ball = new int[10][10];
		
		// 값 넣기
		for (int i = 0; i < ball.length; i++) {
			for (int j = 0; j < ball.length; j++) {
				ball[i][j] = i+1;
				ball[i][j] = j+1;
				//System.out.print(ball[i][j]+"\t");
			}
		//	System.out.println();
		}
		
		// 볼 섞기
		int temp = 0;
		int random_no = 0;
		
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 50; j++) {
				random_no = (int)(Math.random()*10);
				temp = ball[0][0];
				ball[0][0] = ball[random_no][random_no];
				ball[random_no][random_no] = temp;
				
			}
		}
		// 출력
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				System.out.print(input[i][j] +"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
//		int[][] input = new int[3][3];
//		
//		for (int i = 0; i < input.length; i++) {
//			for (int j = 0; j < input.length; j++) {
//				input[i][j] =(int)(Math.random()*10);
//			}
//		}
//		
//		for (int j = 0; j < input.length; j++) {
//			//System.out.print(input[j][0]);
//			for (int j2 = 0; j2 < input.length; j2++) {
//				System.out.print(input[j][j2]+"\t");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
		
//		//번호넣을 배열공간 만들기
//		int[] input = new int[7];
//		
//		//번호 넣기
//		for (int i = 0; i < input.length; i++) {
//			
//			input[i] = (int)((Math.random()*10)+1);
//		}
//		
//		
//		for (int i = 0; i < input.length; i++) {
//			System.out.println(input[i]);
//		}
	}

}
