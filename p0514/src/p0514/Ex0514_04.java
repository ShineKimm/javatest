package p0514;

import java.util.Scanner;

public class Ex0514_04 {

	public static void main(String[] args) {
		//1.화면단 출력 while() 무한반복 , switch() 구문만들
		//2.학생성적 출력
		// - 각각의 저장배열 생성
		// - 이름, 국어, 영어, 수학점수를 입력받음
		// - 합계, 평균, 입력
		//3. 학생성적출력 구현
		Scanner scan = new Scanner(System.in); 
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		String[] subject = {"국어","영어","수학"};
		int choice = 0;
		int count = 0;
		String check_name="";
		int findnum = 0; // 수정할 데이터위치변수
		
		while (true) {
			System.out.println("학생 성적 출력 프로그램");
			System.out.println("번호를 입력해주세요");
			System.out.println("1.입력화면 2. 수정화면 3.출력화면");
			choice = scan.nextInt();
			String check = ""; //0인지 확인
			
			
			switch (choice) {
			case 1: // 학생성적추가
				System.out.println("[학생 성적 입력]");
				for (int i=count; i < score.length; i++) {
					System.out.println((i+1)+"번학생 이름을 입력해주세요(0.상위메뉴이동)>>");
					check = scan.next();
					if(check.equals("0")) {
						System.out.println("상위메뉴로 이동합니다.");
						break;
					}
					
					name[i] = check;
					for (int j = 0; j < 3; j++) {
						System.out.println(subject[j]+"과목점수를 입력해주세요");
						score[i][j] = scan.nextInt();
					}
					score[i][3] = score[i][0]+score[i][1]+score[i][2]; //총점
					avg[i] = score[i][3]/3.0;
				}
				count++;
				
				break;
			case 2: // 수정메뉴
				System.out.println("[학생성적수정 메뉴]");
				System.out.println("수정할 학생이름을 입력하세요.>>");
				check_name = scan.next(); // 수정할 학생이름 입력받아 체크내임에 저장
				findnum=-1; //데이터가 없을 경우
				for (int i = 0; i < count; i++) {
					if (check_name.equals(name[i])) {
						findnum = i;
					}
				}
				if (findnum==1) {
					System.out.println("데이터가 없습니다.");
					break;
				}
				
				System.out.println("[수정과목 선택]");
				System.out.println("0.국어 1.영어 2.수학");
				System.out.println("수정과목을 선택하세요.>>");
				int subname = scan.nextInt();
				System.out.println("수정점수 입력 :");
				score[findnum][subname] = scan.nextInt();
				score[findnum][3] = score[findnum][0]+score[findnum][1]+score[findnum][2];
				avg[findnum] = score[findnum][3]/3.0;
				
				break;
			case 3: // 학생성적출력
					System.out.println("이름\t국어\t영어\t수학\t총점\t평균\n");
				for (int i=0; i < count; i++) {
					System.out.print(name[i]+"\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j]+"\t");
					}
					System.out.println(avg[i]);
					System.out.println();
				}
				
				break;

			default:
				break;
			}//switch
		}//while
	}//main

}//class
