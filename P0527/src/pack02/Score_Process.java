package pack02;
import java.util.ArrayList;
import java.util.Scanner;

public class Score_Process {

	static Scanner scan = new Scanner(System.in);

	// 메인 메뉴 출력메소드
	void mainPrint() {
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 학생성적추가");
		System.out.println("2. 학생성적출력");
		System.out.println("3. 학생성적수정");
		System.out.println("4. 학생성적검색");
		System.out.println("5. 등수처리");
		System.out.println("0. 프로그램종료");
		System.out.println("------------------------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
	}

	// 1. 학생성적추가 메소드
	static void student_insert(ArrayList list) {
		String name = "";
		int kor = 0, eng = 0, math = 0;

		while (true) {
			// 번호는 자동으로 입력됨.
			System.out.println("이름을 입력하세요.>>(0.상위메뉴이동)");
			String check = scan.next();

			if (check.equals("0")) {
				System.out.println("상위메뉴로 이동합니다.");
				break;
			}
			name = check;
			System.out.println("국어점수를 입력하세요.>>");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.>>");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.>>");
			math = scan.nextInt();
			// s[i]객체선언
			//s[i] = new Student(name, kor, eng, math);
			list.add(new Student(name,kor,eng,math)); //add 추가하는 메소드
		}

	}// 학생성적추가 메소드

	// 상단출력부분 메소드
	void top_title() {
		System.out.printf("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("---------------------------------------------------");
	}

	// 2. 학생성적출력 메소드
	void student_print(ArrayList<Student> list) {
		top_title(); // 상단출력부분 메소드
		for (int i = 0; i < list.size(); i++) {
			Student s =list.get(i); //Student //get 리스트를 읽어주는 메소드
			System.out.print(s.stu_number + "\t");
			System.out.print(s.name + "\t");
			System.out.print(s.kor + "\t");
			System.out.print(s.eng + "\t");
			System.out.print(s.math + "\t");
			System.out.print(s.total + "\t");
			System.out.printf("%.2f\t", s.avg);
			System.out.print(s.rank + "\n");
		}
	}// 학생성적출력 메소드
	
	void student_update(ArrayList<Student> list) {
		String search_name = "";
		int search_num = 1;
		System.out.println("수정할 학생의 이름을 입력하세요.(0.상위메뉴 이동)>>");
		search_name = scan.next(); // 0번일때 상위메뉴 이동
		//상위메뉴 이동 확인
		if (search_name.equals("0")) {
			System.out.println("상위메뉴로 이동합니다.");
		} else {
			search_num = -1; // 검색데이터가 있는지 확인하는 변수
			System.out.println("[ 검색된 학생 이름 ]");
			for (int i = 0; i < Student.count; i++) { // 학생수만큼 검색
				Student s =list.get(i);
				if (s.name.contains(search_name)) {
					System.out.println(i + ". " + s.name);
					// 현재데이터 0.홍길동, 1.이순신,2.홍길자,3.김구
					// 0. 홍길동
					// 2. 홍길자
					search_num = 0; // 검색한 데이터가 있을경우 0, 없을경우 -1
				}
			}
			// 없을경우
			if (search_num == -1) {
				System.out.println("찾을 데이터가 없습니다.");
				// break;
			} else {
				// 있을경우
				System.out.println("수정하고 하는 학생의 번호를 입력하세요.>>");
				int temp_num = scan.nextInt(); // 원하는 학생번호

				// 수정할 과목을 선택
				System.out.println("[ 수정할 과목 선택 ]");
				System.out.println("0.국어  1.영어  2.수학");
				System.out.println("수정할 과목번호를 입력하세요.>>");
				int temp_num2 = scan.nextInt();
				
				
				// 과목별 수정
				switch (temp_num2) {
				case 0:
					System.out.println("현재점수 : " + list[temp_num].kor);
					System.out.println("수정할 점수를 입력하세요.>>");
					// 점수수정
					s[temp_num].kor = scan.nextInt();
					break;
				case 1:
					System.out.println("현재점수 : " + list[temp_num].eng);
					System.out.println("수정할 점수를 입력하세요.>>");
					// 점수수정
					s[temp_num].eng = scan.nextInt();
					break;
				case 2:
					System.out.println("현재점수 : " + s[temp_num].math);
					System.out.println("수정할 점수를 입력하세요.>>");
					// 점수수정
					s[temp_num].math = scan.nextInt();
					break;
				}

				// 합계수정
				s[temp_num].total = s[temp_num].kor + s[temp_num].eng + s[temp_num].math;
				// 평균수정
				s[temp_num].avg = s[temp_num].total / 3.0;
				System.out.println("수정이 완료되었습니다.!");
				
				
				
				
				
			}//if
		}
	}

}// class
