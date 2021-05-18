import java.util.Scanner;

public class Ex0513_01 {

	public static void main(String[] args) {
		//학생성적 프로그램 - 3명 입력해서 출력을 해보세요
		//이름, 국어, 영어, 수학을 입력받아, 이름, 국어, 영어 수학 합계 평균
		
		//1. 배열선언
		//2. 학생정보입력 - 합계계산, 평균계산 데이터 넣기
		//3. 학생정보 출력
		
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		
		//입력
		for (int i = 0; i < math.length; i++) {
			System.out.println("이름을 입력해주세요");
			name[i] = scan.nextLine();
			System.out.println("국어점수를 입력해주세요");
			eng[i] = scan.nextInt();
			System.out.println("수학점수를 입력해주세요");
			math[i] = scan.nextInt();
			total[i] = kor[i]+eng[i]+math[i];
			avg[i] = total[i] / 3.0;
		}
		//출력
		for (int i = 0; i < avg.length; i++) {
			System.out.println(name[i]);
			System.out.println(eng[i]);
			System.out.println(math[i]);
			System.out.println(total[i]);
			System.out.println(avg[i]);
			
		}
		
		
		
	}

}
