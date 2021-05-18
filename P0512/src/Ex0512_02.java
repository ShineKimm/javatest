import java.util.Scanner;

public class Ex0512_02 {

	public static void main(String[] args) {
		//문제
		//학생이름, 국어점수, 수학점수, 영어점수 4개를 입력받아
		// 3개를 학생이름, 합계, 평균을 출력하시오
		Scanner scan = new Scanner(System.in);
		System.out.println("학생1이름을 입력해주세요");
		String name1 = scan.nextLine();
		System.out.println("학생2이름을 입력해주세요");
		String name2 = scan.nextLine();
		System.out.println("국어점수를 입력해주세요");
		int korean = scan.nextInt();
		System.out.println("수학점수를 입력해주세요");
		int math = scan.nextInt();
		System.out.println("영어점수를 입력해주세요");
		int english = scan.nextInt();
		
		int sum = (korean + math + english);
		double avg = (korean + math + english)/3.0;
		
		System.out.printf
		("학생이름1 : "+ name1 + "학생이름1 : "+ name2 +"\t"+ "합계 : " + sum + "평균 : " + avg);
	}

}
