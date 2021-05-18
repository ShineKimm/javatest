import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학 -> 이름, 국어, 영어, 수학, 합계, 평균 출력하시오
		// 학생 5명, 국어, 영어, 수학, 합계 --> 2차원 배열을 쓰시오.
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[][] score = new int[5][4];
		String[] subject = {"국어","영어","수학"};
		double[] avg = new double[5];
		
		//입력
		for (int i = 0; i < name.length; i++) {
			System.out.println((i+1)+"번째 이름을 입력해주세요");
				name[i] = scan.next();
			for (int j = 0; j < 3; j++) {
				System.out.println(subject[j]+"점수를 입력해주세요");
				score[i][j] = scan.nextInt();
			}
			score[i][3] = score[i][0]+score[i][1]+score[i][2];
			avg[i]= score[i][3]/3.0;
		}
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		//출력
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.printf("%.2f",avg[i]);
			System.out.println();
		}
		
	}

}
