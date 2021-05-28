package pack01;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_process {
	static Scanner scan = new Scanner(System.in);
	//ArrayList list = new ArrayList();
	//학생성적추가 메소드
	void student_insert(ArrayList list) { //인스턴스 메소드: 객체생성 후 참조변수명.메소드명
		String stu_name="";
		int kor=0,eng=0,math=0;
		
		while (true) {
			System.out.println("학생이름을 입력하세요.(0.상위메뉴이동)>>");
			stu_name = scan.next();
			if (stu_name.equals("0")) {
				break;
			}
			System.out.println("국어점수를 입력하세요.>>");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.>>");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.>>");
			math = scan.nextInt();
			//list 저장
			list.add(new Student(stu_name,kor,eng,math));
			
		}//while
		
	}// insert 메소드 종료
		//학생성적출력 메소드
		void student_print(ArrayList list) {
			System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
			System.out.println("--------------------------------------");
			
			for (int i = 0; i < list.size(); i++) {
				Student s = (Student)list.get(i); // Object
				System.out.printf(s.getStu_num()+"\t");
				System.out.printf(s.getStu_name()+"\t");
				System.out.printf(s.getKor()+"\t");
				System.out.printf(s.getEng()+"\t");
				System.out.printf(s.getMath()+"\t");
				System.out.printf(s.getTotal()+"\t");
				System.out.printf(s.getAvg()+"\t");
				System.out.printf(s.getRank()+"\t");
				System.out.println();
			}
		}
		
		void student_update(ArrayList list) {
			//1.수정할 학생검색-비교 2.과목선택 3.점수입력 4. 점수수정
			System.out.println("수정할 학생이름을 입력해주세요");
			String stu_name = scan.next();
			
			int check_flag = 0;
			for (int i = 0; i < list.size(); i++) {
				Student s = (Student)list.get(i);
				if (s.getStu_name().equals(stu_name)) {
					System.out.println("수정하고자 하는 학생을 찾았습니다.");
					System.out.println("[수정과목선택]");
					System.out.println("1.국어 2.영어 3.수학");
					System.out.println("원하는 번호를 선택하세요.");
					
					int choice = scan.nextInt();
					
					
					switch (choice) {
					case 1: //국어
						System.out.println("현재점수: "+s.getKor());
						System.out.println("수정하고싶은 점수를 입력하세요");
						s.setKor(scan.nextInt());
						break;
					
					case 2:
						System.out.println("현재점수: "+s.getEng());
						System.out.println("수정하고싶은 점수를 입력하세요");
						s.setEng(scan.nextInt());
						break;
					case 3:
						System.out.println("현재점수: "+s.getMath());
						System.out.println("수정하고싶은 점수를 입력하세요");
						s.setMath(scan.nextInt());
						break;
						
					}//switch
						s.setTotal(s.getKor()+s.getEng()+s.getMath());
						s.setAvg(s.getTotal()/3.0);
						check_flag = 1;
					
				}
				
			}
		}
		//학생성적검색 메서드
		void student_search(ArrayList list) {
			System.out.println("검색할 학생이름을 입력하세요");
			String stu_name = scan.next();
			
			System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
			System.out.println("--------------------------------------");
			
			int check_flag = 0; //없다.
			
			for (int i = 0; i < list.size(); i++) {
				Student s = (Student)list.get(i);
				if (s.getStu_name().contains(stu_name)) { //홍길동,홍길자,홍길순
					System.out.printf(s.getStu_num()+"\t");
					System.out.printf(s.getStu_name()+"\t");
					System.out.printf(s.getKor()+"\t");
					System.out.printf(s.getEng()+"\t");
					System.out.printf(s.getMath()+"\t");
					System.out.printf(s.getTotal()+"\t");
					System.out.printf(s.getAvg()+"\t");
					System.out.printf(s.getRank()+"\t");
					
					check_flag = 1; //검색할 대상을 찾음.
				}
			} //for
			
			if(check_flag==0) {
				System.out.println("찾는 데이터가 없습니다. 다시검색하세요.");
			}
		}
		//등수 입력
		void student_rank(ArrayList list) {
			for (int i = 0; i < list.size(); i++) {
				Student s1 = (Student)list.get(i);
				int rCount = 1; //등수카운트
				for (int j = 0; j < list.size(); j++) {
					Student s2 = (Student)list.get(j);
					if (s1.getTotal()<s2.getTotal()) {
						rCount++; //등수1증가
					}
				}
				s1.setRank(rCount); //등수 저장
			}
			System.out.println("등수처리가 완료되었습니다.");
		}
}
