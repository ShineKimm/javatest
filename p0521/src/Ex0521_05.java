import java.util.Iterator;
import java.util.Scanner;

public class Ex0521_05 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// 객체배열 주소선언 = 참조변수주소만 생성됨.
		Student[] s = new Student[3]; //10명의 데이터 저장배열
		int search_num2 = 0;
		int num = 0;
		String search_name =""; //찾을 이름변수
		int search_num = -1; //검색 데이터 유무 확인
		//String name= "";
		//int stu_number=0,  kor=0, eng=0, math=0, total=0, rank=0 ;
		//double avg = 0;
		
loop1: while (true) {
			//메인화면 출력 메소드 호출 ->> 매개변수 s 보냄.
			mainPrint();
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1: // 학생성적추가
				student_insert(s);
				break;
				
			case 2: // 학생성적출력
				student_print(s); //학생성적출력메소드

				break;
			case 3: // 학생성적수정
				
				student_update(s); //학생성적수정메소드
				
				break;

			case 4: // 학생성적검색
				student_search(s); //학생성적검색 메소드
				break;
			case 5:
				rank_process(s);
				
			case 6:
				System.out.println("프로그램을 종료합니다.!");
				break loop1;
			default:
				break;
			}

		}

	}//main
	
	//main출력화면 메소드
	static void mainPrint() {
		System.out.println("학생성적 프로그램");
		System.out.println("1.학생성적추가 2.학생성적출력 3.학생성적수정 4.학생성적검색" + "5.등수처리 0.프로그램종료");
		System.out.println("------------------------");
		System.out.println("원하는 번호를 입력하세요>>");
	}
	//학생성적추가 메소드
		static void student_insert(Student[] s) {
			String name = "";
			int kor=0, eng=0, math=0;
			for (int i = Student.count; i < s.length; i++) {
				// 번호는 자동으로 입력
				System.out.println("이름을 입력하세요.>>(0.상위메뉴이동)");
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
				s[i] = new Student(name,kor,eng,math); // s[i] 객체선언
			}
		}//학생성적추가 메소드
		//상단출력부분 메소드
		static void top_title() {
			System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
			System.out.println("----------------------------");
		}
		//학생성적출력 메소드
		static void student_print(Student[] s) {
			top_title();
			for (int i = 0; i < Student.count; i++) {
			//	s[i] = new Student(); // s[i] 객체선언
				// 번호는 자동으로 입력
				System.out.print(s[i].stu_number + "\t");
				System.out.print(s[i].name + "\t");
				System.out.print(s[i].kor + "\t");
				System.out.print(s[i].eng + "\t");
				System.out.print(s[i].math + "\t");
				System.out.print(s[i].total + "\t");
				System.out.print(s[i].avg + "\t");
				s[i].avg = s[i].total / 3.0;
				System.out.println();
			}
		}//학생성적출력 메소드
		
		static void student_update(Student[] s){
			String search_name = "";
			int search_num = 1;
			String check = "";
			System.out.println("수정할 학생의 이름을 입력하세요. 0.상위메뉴이동");
			search_name = scan.next(); //홍
			//상위메뉴 이동
			if (check.equals("0")) {
				System.out.println("상위메뉴로 이동");
			}else {
				

			
			search_num = -1; //검색데이터 있는지 확인 변수
			System.out.println("[검색된 학생 이름]");
			for (int i = 0; i < Student.count; i++) {
				if (s[i].name.contains(search_name)) {
					System.out.println(i+"."+s[i].name);
					//0.홍길동
					//1.홍길자
					//2.홍길순
					search_num = 0; //검색한 데이터가 있을경우 0 없으면 -1
				} else {
					break;
				}
			}
			//없을경우
			if (search_num == -1) {
				System.out.println("찾을 데이터가 없습니다.");
			}else {
				//있을경우
				System.out.println("수정하고자 하는 학생의 번호를 입력하세요.>>");
				int temp_num = scan.nextInt();
				//수정할 과목을 선택
				System.out.println("[수정할 과목 선택]");
				System.out.println("0.국어 1.영어 2.수학");
				System.out.println("수정할 과목번호를 입력하세요>>");
				int temp_num2 = scan.nextInt();
				
				switch (temp_num2) {
				case 0:
					System.out.println("현재점수 : "+s[temp_num].kor);
					System.out.println("수정할 점수를 입력하세요.>>");
					//점수수정
					s[temp_num].kor = scan.nextInt();
					s[temp_num].total = s[temp_num].kor+s[temp_num].eng+s[temp_num].math;
					s[temp_num].avg = s[temp_num].total/3.0;
					break;
				case 1:
					System.out.println("현재점수 : "+s[temp_num].eng);
					System.out.println("수정할 점수를 입력하세요.>>");
					//점수수정
					s[temp_num].eng = scan.nextInt();
					s[temp_num].total = s[temp_num].kor+s[temp_num].eng+s[temp_num].math;
					s[temp_num].avg = s[temp_num].total/3.0;
					break;
				case 2:
					System.out.println("현재점수 : "+s[temp_num].math);
					System.out.println("수정할 점수를 입력하세요.>>");
					//점수수정
					s[temp_num].math = scan.nextInt();
					s[temp_num].total = s[temp_num].kor+s[temp_num].eng+s[temp_num].math;
					s[temp_num].avg = s[temp_num].total/3.0;
					break;
			}
			
			}
			
		}// 수정
		}
		static void rank_process(Student[] s) {
			for (int i = 0; i < Student.count; i++) {
				int rankNum = 1; //등수 count
				for (int j = 0; j < Student.count; j++) {
					if(s[i].total<s[j].total)
						rankNum++;
				}
				s[i].rank = rankNum;
			}
			System.out.println("등수처리가 완료되었습니다.!");
			
		}
		//학생성적검색
		static void student_search(Student[] s) {
			String search_name = "";
			int search_num = 0;
			System.out.println("검색할 학생의 이름을 입력하세요.>>");
			search_name = scan.next();

			System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
			System.out.println("----------------------------");

			 search_num = -1; // 검색시 데이터가 있는지 확인하는변
			for (int i = 0; i < Student.count; i++) {
				if (s[i].name.contains(search_name)) {
					// 출력
					System.out.print(s[i].stu_number + "\t");
					System.out.print(s[i].name + "\t");
					System.out.print(s[i].kor + "\t");
					System.out.print(s[i].eng + "\t");
					System.out.print(s[i].math + "\t");
					System.out.print(s[i].total + "\t");
					System.out.print(s[i].avg + "\t");
					System.out.print(s[i].rank + "\t");

					search_num = 0; // 데이터가 있을경우 0 변경
				}
			}
			// 없을경우
			if (search_num == -1) {
				System.out.println("찾을 데이터가 없습니다.");
			}
		}
	}//class
