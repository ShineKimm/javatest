import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] s = new Student[3];
		
		
		
		while (true) {
			System.out.println("[성적처리 프로그램]");
			System.out.println("번호를 입력하세요");
			System.out.println("1.학생성적추가");
			System.out.println("2.학생성적출력");
			System.out.println("3.학생성적수정");
			System.out.println("4.학생성적검색");
			System.out.println("5.등수처리");
			System.out.println("0.프로그램종료");
			
			int choice = scan.nextInt();
			switch (choice) {
			case 0:
				String name = "";
				int kor=0, eng=0, math=0;
				for (int i = 0; i < s.length; i++) {
				
					System.out.println("이름을 입력해주세요");
					String check = "";
					check = scan.next();
					if (check.equals("0")) {
						System.out.println("상위메뉴로 이동");
						break;
					}
					name = check;
						System.out.println("국어 점수를 입력하세요");
						kor = scan.nextInt();
						System.out.println("영어 점수를 입력하세요");
						eng = scan.nextInt();
						System.out.println("수학 점수를 입력하세요");
						math = scan.nextInt();
						
						s[i] = new Student(name, kor,eng,math);
				}
				
				break;

			case 1://출력
				
				for (int i = 0; i < Student.count; i++) {
					System.out.print(s[i].stu_number+"\t");
					System.out.print(s[i].name+"\t");
					System.out.print(s[i].kor+"\t");
					System.out.print(s[i].eng+"\t");
					System.out.print(s[i].math+"\t");
					System.out.print(s[i].total+"\t");
					System.out.print(s[i].avg+"\t");
					System.out.println();
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
			}//switch
		}//while
	}//main

}//class
