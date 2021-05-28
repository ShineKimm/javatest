package pack02;

import java.util.Scanner;

public class Ex0527_001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] s1 = new Student[3];
		
	loop1:while (true) {
			
		//학생성적프로그램
		System.out.println("학생성적 프로그램");
		System.out.println("1.학생성적추가");
		System.out.println("2.학생성적출력");
		System.out.println("3.학생성적수정");
		System.out.println("4.학생성적검색");
		System.out.println("5.등수처리");
		System.out.println("0.프로그램종료");
		System.out.println("--------------");
		System.out.println("원하는 번호를 입력하세요");
		
		int choice = scan.nextInt();
		switch (choice) {
		case 1: //학생성적추가
			String name = "";
			int kor=0,eng=0,math=0;
			for (int i = Student.getCount(); i < s1.length; i++) {
				System.out.println("학생 이름을 입력해주세요");
				String check = scan.next();
			
			if (check.equals("0")) {
				System.out.println("상위메뉴로 이동");
				break;
			}
			name = check;
			System.out.println("국어점수를 입력하세요");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요");
			math = scan.nextInt();
			s1[i] = new Student(name,kor,eng,math);
			}
			
			break;
		case 2: //학생성적출력
			System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
			System.out.println("--------------------------------------------");
			for (int i = 0; i < Student.getCount(); i++) {
				System.out.print(s1[i].getStu_number()+"\t");
				System.out.print(s1[i].getStu_name()+"\t");
				System.out.print(s1[i].getKor()+"\t");
				System.out.print(s1[i].getEng()+"\t");
				System.out.print(s1[i].getMath()+"\t");
				System.out.print(s1[i].getTotal()+"\t");
				System.out.print(s1[i].getAvg()+"\t");
				System.out.println();
			}
			break;
		case 3: //학생성적수정
			String search_name = "";
			int search_num = 1;
			String check = "";
			System.out.println("수정할 학생의 이름을 입력하세요");
			search_name = scan.next();
			
			if (check.equals("0")) {
				System.out.println("상위메뉴로 이동");
			}
			search_num = -1;
			System.out.println("검색된 학생 이름");
			for (int i = 0; i < Student.getCount(); i++) {
				if (s1[i].getStu_name().contains(search_name)) {
					System.out.println(i+"."+s1[i].getStu_name());
					search_num = 0;
				}else {
					break;
				}
			}
			//없을경우
			if (search_num == -1) {
				System.out.println("찾을 데이터가 없습니다.");
				break;
			}
			//찾고자 하는 학생이름이 있으면
			System.out.println("수정하고자 하는 학생의 번호를 입력하세요");
			int temp_num = scan.nextInt();
			
			System.out.println("수정할 과목 선택");
			System.out.println("0.국어 1.영어 2.수학");
			System.out.println("수정할 과목번호를 입력하세요>>");
			int temp_num2 = scan.nextInt();
			
			switch (temp_num2) {
			case 0:
				System.out.println("현재점수 : "+s1[temp_num].getKor());
				System.out.println("수정할 점수를 입력하세요.");
				
				break;

			default:
				break;
			}
			
			break;
		case 4: //학생성적검색
			
			break;
		case 5: //등수처리
			
			break;
		case 0: //프로그램 종료
			System.out.println("프로그램을 종료합니다.");
			break loop1;

		default:
			break;
		}
		}//while
	}//main

}//class
