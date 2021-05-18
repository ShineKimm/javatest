package p0517;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//1. 배열선언, 화면글자출력
				//2. 학생성적추가, 학생성적출력, 학생성적수정,학생성적검색,등수처리,종료순으로 진행
				//3. 학생이름,국어,영어,수학,합계,평균,등수
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int[3][6];
		double[] avg = new double[3];
		String[] title = {"이름","국어","영어","수학","합계","평균","등수"};
		
		
		//2. 학생성적추가
		while (true) {
			System.out.println("학생성적 프로그램");
			System.out.println("1. 성적추가 2.성적출력 3.성적수정 4.성적검색 5.등수처리 6.종료");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				for (int i = 0; i < avg.length; i++) {
					System.out.println("이름을 입력해주세요");
					name[i] = scan.next();
					for (int j = 0; j < title.length; j++) {
						
					}
				}
				break;

			case 2:
				
				break;

			case 3:
				
				break;

			case 4:
				
				break;

			case 5:
				
				break;

			case 6:
				
				break;

			default:
				break;
			}
		}
	}

}
