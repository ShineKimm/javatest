import java.util.Scanner;

public class Ex0513_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[][] score = new int[5][4]; // 학생5명, //국어, 영어, 수학, 합계
		double[] avg = new double[5];
		//입력
		for (int i = 0; i < name.length; i++) {
			System.out.println("이름을 입력하세요.>>");
			name[i] = scan.next();
			for (int j = 0; j < (score[j].length)-1; j++) {
			System.out.println("점수를 입력하세요.>>");
			score[i][j] = scan.nextInt();
			}
			//합계
			score[i][3] = score[i][0]+score[i][1]+score[i][2];
			//평균
			avg[i] = score[i][3]/3.0;
			
		}
		//출력
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
			for (int j = 0; j < score[j].length; j++) {
			System.out.print(score[i][j]+"\t");
			System.out.println(score[i][4]);
			}
			System.out.println("\n");
		}
		
	}

}
