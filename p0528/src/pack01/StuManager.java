package pack01;

import java.util.ArrayList;
import java.util.Scanner;

public class StuManager {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//학생성적저장 저장객체배열
		ArrayList list = new ArrayList(); //객체배열
		Stu_process p = new Stu_process();
		
	loop1:while (true) {
			System.out.println("[학생성적 프로그램]");
			System.out.println("1.학생성적추가");
			System.out.println("2.학생성적출력");
			System.out.println("3.학생성적수정");
			System.out.println("4.학생성적확인");
			System.out.println("5.등수처리");
			System.out.println("-------------------");
			System.out.println("원하는 번호를 입력하세요.");
			
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1://학생성적추가
				//1.이름,국어,영어,수학
				p.student_insert(list);
				break;
			case 2: 
				//1. 상단출력
				//2. for을 사용해서 list에 있는 데이터 출력
				// 번호	이름	국어	영어	수학	합계	평균	등수
				p.student_print(list);
				break;
			case 3: //학생성적수정
				p.student_update(list);
				break;
			case 4: //학생성적검색
				//1. 검색할 이름입력 2.for반복 3.if문비교 4.검색출력
				p.student_search(list);
				break;
			case 5: //등수처리
				//1.합계객체가져옴 2.합계객체비교 3. 등수처리
				p.student_rank(list);
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop1;
			default:
				break;
			}//switch
		}//while
	}//main

}//class
