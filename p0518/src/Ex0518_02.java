import java.util.Scanner;

public class Ex0518_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//객체배열선언
		Student[] s = new Student[3];
		s[0] = new Student();
		s[1] = new Student();
		s[2] = new Student();
		
		//3명의 학생의 성적입력
		for (int i = 0; i < s.length; i++) {
			//데이터 저장을 위한 객체선언
			s[i] = new Student();
			s[i].score = new int[3];
			System.out.println("이름을 입력하세요.>>");
			s[i].name = scan.next();
			for (int j = 0; j < s[i].score.length; j++) {
				System.out.println("점수를 입력하세요.>>");
				s[i].score[j] = scan.nextInt();
				s[i].total = s[i].score[0]+s[i].score[1]+s[i].score[2];
				s[i].avg = scan.nextInt();
			}
		}
		
		//3명 학생 출력
				for (int i = 0; i < s.length; i++) {
					//데이터 저장을 위한 객체선언
					System.out.print(s[i].name+"\t");
					for (int j = 0; j < s[0].score.length; j++) {
						System.out.print(s[0].score[j]+"\t");
						System.out.println(s[i].total);
						System.out.println(s[0].avg);
					}
				}
		
		
//		//학생5명 선언
//		Student s1 = new Student();
//		Student s2 = new Student();
//		Student s3 = new Student();
//		Student s4 = new Student();
//		Student s5 = new Student();
	}

}
