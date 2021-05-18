package p0514;

import java.util.Scanner;

public class Ex0514_02 {

	public static void main(String[] args) {
		System.out.println("test");
		Scanner scan = new Scanner(System.in);
		String[] name = new String[10]; // 학생 이름
		int[][] score = new int[3][4]; // 국어 영어 수학 성적
		String[] subject = {"국어","영어","수학"}; 
		double[] avg = new double[3];
		int count = 0; //학생성적을 몇명 입력했는지 확인하는 변수
		String check = scan.next(); //0또는 학생이름 확인변수
		int searchNum = 0; //학생성적수정
		
		
		loop1: while (true) {
			System.out.println("-----------------");
			System.out.println("[학생성적처리 프로그램]");
			System.out.println("------------------");
			System.out.println("1.학생성적추가");
			System.out.println("2.학생성적수정");
			System.out.println("3.학생성적출력");
			System.out.println("4.학생성적검색");
			System.out.println("5.프로그램종료");
			System.out.println("------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			
			switch (choice) {
//			case 1:
//				System.out.println("[학생성적추가 메뉴]");
//				//프로그램 추가
//				//3명의 학생이름 국어, 영어, 수학 점수를 입력받아, 합계 평균까지 출력
//				// 이름-String 국어, 영어, 수학, 합계 -int 평균-double
//				
//				//입력
//				for (int i = count; i < score.length; i++) {
//					System.out.println((i+1)+"번째 이름을 입력해주세요");
//					if(check.equals("0")) {
//						System.out.println("상위메뉴로 이동합니다.");
//						break;
//					}
//					name[i] = check; //이름저장
//					for (int j = 0; j < 3; j++) {
//						System.out.println(subject[j]+"과목 점수를 입력해주세요");
//						score[i][j] = scan.nextInt();
//					}
//					score[i][3] = score[i][0]+score[i][1]+score[i][2];
//					avg[i] = score[i][3]/3.0;
//					count++; //학생1명추가
//					System.out.println((i+1)+"번째의 학생성적이 입력되었습니다");
//				}
//				
//				break;
//			case 2: // 학생성적수정
//				System.out.println("학생성적수정 메뉴");
//				System.out.println("수정할 학생이름을 입력하세요.(0.상위 메뉴이동)");
//				//수정하려면 누구 수정할지? 찾아야함
//				check = scan.next(); //수정할 학생이름 검색
//				if(check.equals("0")) {
//					System.out.println("상위메뉴로 이동합니다.");
//					break;
//				}
//				//해당학생검색
//				searchNum = -1; //해당학생이 있는지 없는지 확인
//				for (int i = 0; i < count; i++) {
//					if(check.equals(name[i])) {
//						searchNum = i;
//					}
//				}
//				//해당학생이 있을시
//				System.out.println(check + "학생을 찾았습니다.!");
//				//무슨과목을 수정할지
//				System.out.println("[수정할 과목을 선택]");
//				System.out.println("0.국어 1.영어 2.수학");
//				System.out.println("수정할 과목 번호를 입력하세요.>>");
//				int snum = scan.nextInt(); //0번 입력받음. //수정할 과목
//				System.out.println("수정할 점수 입력 : ");
//				score[searchNum][snum] = scan.nextInt();
//				//합계수정
//				score[searchNum][3] = score[searchNum][0]+score[searchNum][1]+score[searchNum][2];
//				//평균수정
//				avg[searchNum] = score[searchNum][3]/3.0;
//				System.out.println("수정이 완료되었습니다.");
//				break;
				
				
//				System.out.println("[학생성적수정 메뉴]");
//				System.out.println("수정할 학생이름을 입력하세요.(0.상위메뉴이동>>");
//				check = scan.next();
//				if(check.equals("0")) {
//					System.out.println("상위메뉴로 이동합니다.");
//					break;
//				}
//				searchNum = -1; //해당학생이 있는지 없는지 확인
//				//해당학생검색
//				for (int i = 0; i < count; i++) {
//					if(check.equals(name[i])) {
//						searchNum = i;
//					}
//				}
//				//해당학생이 없을시
//				if (searchNum==-1) {
//					System.out.println("해당학생이 없습니다.!");
//					break;
//				}
//				//해당학생이 있을시
//				System.out.println(check + "학생을 찾았습니다.!");
//				//무슨과목을 수정할지
//				System.out.println("[수정할 과목을 선택]");
//				System.out.println("0.국어 1.영어 2.수학");
//				System.out.println("수정할 과목 번호를 입력하세요.>>");
//				int subjectNum = scan.nextInt();
//				//1. 국어 -> subject[0]
//				// subject[0]국어현재점수 : score[0][0]
//				System.out.println(subject[subjectNum-1]+"현재점수 : "+score[subjectNum][subjectNum-1]);
//				score[subjectNum][subjectNum-1] = scan.nextInt();
//				score[subjectNum][3] = score[subjectNum][0]+score[subjectNum][1]+score[subjectNum][2];
//				avg[subjectNum] = score[subjectNum][3]/3.0;
//				System.out.println("수정이 완료되었습니다.");
//				break;
//			case 3:
//				System.out.println("[학생성적출력 메뉴]");
//				System.out.println("이름\t국어\t영어\t수학\t합계\t평균\n");
//				System.out.println("-----------------------------");
//				//출력
//				for (int i = 0; i < count; i++) {
//					System.out.print(name[i]+"\t"); // 이름출력
//					for (int j = 0; j < score[i].length; j++) {
//						System.out.print(score[i][j]+"\t");
//					}
//					System.out.printf("%.2f \n", avg[i]);
//					System.out.println();
//					
//				}
//				
//				break;
//			case 4:
//				System.out.println("-------->학생성적검색 메뉴입니다.");
//				
//				break;
//			case 5:
//				System.out.println("-------->학생성적종료 메뉴입니다.");
//				
//				break;
//			case 0:
//				System.out.println("-------->프로그램을 종료합니다.");
//				//프로그램 수정
//				break loop1;
//			default:
//				System.out.println("번호를 잘못 입력하셨습니다.");
//				break;
			}//switch
		}//while
	}

}
