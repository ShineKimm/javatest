package p0514;

import java.util.Scanner;

public class Ex0514_03 {

	public static void main(String[] args) {
		//3명의 배열 생성
		//학생이름, 국어,영어, 수학 성적을 입력받아 -> 합계 평균을 구하시오
		Scanner scan = new Scanner(System.in); 
		String[] name = new String[3];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int count = 0; //입력한 학생수
		
		while (true) {
			System.out.println("[성적처리프로그램]");
			System.out.println("1.학생성적추가");
			System.out.println("3.학생성적출력");
			System.out.println("원하는 번호를 입력하세요.>> ");
			int choice = scan.nextInt();
			String check = ""; //0인지 확인하는 변수
			switch (choice) {
			case 1: //학생성적추가
				System.out.println("학생성적추가 메뉴");
				//학생3명을 입력받아 바로 출력해보세요.
				//입력
				for (int i = count; i < name.length; i++) {
					System.out.println("이름을 입력하세요.(0.상위메뉴이동)>>");
					check = scan.next();
					//0인지 확인
					if(check.equals("0")) {
						System.out.println("상위메뉴로 이동합니다.");
						break;
					}
					
					name[i] = check;
					for (int j = 0; j < name.length; j++) {
						System.out.println("점수를 입력하세요.");
						score[i][j] = scan.nextInt();
					}
					score[i][3]=score[i][0]+score[i][1]+score[i][2]; //합계
					avg[i] = score[i][3]/3.0; //평균
					count++;
				}
			case 3: //학생성적출력
				//출력
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균\n");
				for (int i = 0; i < count; i++) {
					System.out.print(name[i]+"\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j]+"\t");
					}
					System.out.printf("%.2f",avg[i]);
					System.out.println();
				}
				break;
				
				
				

			default:
				break;
			}//switch
		}//while
	}

}
