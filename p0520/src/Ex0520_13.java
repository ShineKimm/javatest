import java.util.Scanner;

public class Ex0520_13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Student[] s = new Student[3];
		String search_name = "";
		int search_YN = 0;
		int search_num = 0;
		int subject_num = 0;
		
		while (true) {
			System.out.println("학생성적프로그램");
			System.out.println("1.학생성적입력");
			System.out.println("2.학생성적출력");
			System.out.println("3.학생성적수정");
			System.out.println("4.학생성적검색");
			System.out.println("5.등수입력");
			System.out.println("6.프로그램 종료");
			
			int choice = scan.nextInt();
				switch (choice) {
				case 1: //입력
					for (int i = Student.count; i < s.length; i++) {
						s[i] = new Student();
						System.out.println("학생이름을 입력해주세요");
						String check = scan.next();
						
						if (check.equals("0")) {
							System.out.println("상위메뉴로 이동합니다.");
							break;
						}
						s[i].name =check;
						System.out.println("국어 입력해주세요");
						s[i].kor =scan.nextInt();
						System.out.println("영어 입력해주세요");
						s[i].eng =scan.nextInt();
						System.out.println("수학 입력해주세요");
						s[i].math =scan.nextInt();
						s[i].total = s[i].kor+s[i].eng+s[i].math;
						s[i].avg = s[i].total/3.0;
						}
						
					break;
				case 2: //출력
					System.out.printf("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
					for (int i = 0; i < Student.count; i++) {
						System.out.print(s[i].stu_number+"\t");
						System.out.print(s[i].name+"\t");
						System.out.print(s[i].kor+"\t");
						System.out.print(s[i].eng+"\t");
						System.out.print(s[i].math+"\t");
						System.out.print(s[i].total+"\t");
						System.out.printf("%.2f",s[i].avg);
						System.out.println();
						}
					break;
				case 3:
					System.out.println("수정할 학생의 이름을 입력하세요");
					search_name = scan.next();
					search_YN = -1;
					System.out.println("[ 검색된 학생 이름 ]");
					for (int i = 0; i < s.length; i++) {
						if (s[i].name.contains(search_name)) {
							System.out.println(i+"."+s[i].name);
							search_YN = 0;
						}
					}
					//없을경우
					if (search_YN == -1) {
						System.out.println("찾는 학생이 없습니다.");
						break;
					}
					//있을경우
					System.out.println("수정할 학생을 선택해 주세요");
					search_num = scan.nextInt();
					
					System.out.println("수정할 과목을 선택해주세요");
					System.out.println("0.국어 1.영어 2.수학");
					subject_num = scan.nextInt();
					
					switch (subject_num) {
					case 0:
						System.out.println("현재점수"+s[search_num].kor);
						s[search_num].kor = scan.nextInt();
						break;
					case 1:
						System.out.println("현재점수"+s[search_num].eng);
						s[search_num].eng = scan.nextInt();
						break;
					case 2:
						System.out.println("현재점수"+s[search_num].math);
						s[search_num].math = scan.nextInt();
						break;

					default:
						break;
					}
					s[search_num].total = s[search_num].kor+s[search_num].eng+s[search_num].math;
					s[search_num].avg = s[search_num].total/3.0;
					System.out.println("수정이 완료되었습니다.");
					break;
				case 4: //학생성적검색
					System.out.println("검색할 이름을 입력해주세요");
					search_name = scan.next();
					
					System.out.printf("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
					System.out.println("---------------------------------------------------");
					
					search_YN = -1;
					
					for (int i = 0; i < Student.count; i++) {
						if (s[i].name.contains(search_name)) {
							System.out.print(s[i].stu_number + "\t");
							System.out.print(s[i].name + "\t");
							System.out.print(s[i].kor + "\t");
							System.out.print(s[i].eng + "\t");
							System.out.print(s[i].math + "\t");
							System.out.print(s[i].total + "\t");
							System.out.printf("%.2f\t", s[i].avg);
							System.out.print(s[i].rank + "\n");
							search_YN = 0; // 데이터가 있을경우 0으로 변경,없을경우 -1
						}
						// 없을경우
					}
						if (search_num == -1) {
							System.out.println("찾을 데이터가 없습니다.");
						}
					break;
				case 5:
					break;
				case 6:
					break;
				default:
					break;
				} //switch
		} //while
		
	}//main		
		
		
	}//class

