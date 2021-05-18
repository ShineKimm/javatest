import java.util.Scanner;

public class Ex0511_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//kor 5개를 만들어서 100
		String[] name = new String[3];
		int[] kor = {100,100,100,100,100};
		int[] math = {100,100,100,100,100};
		int[] eng = {100,100,100,100,100};
		int[] total = new int[3];
		double[] avg = new double[3];
		//입력
		for(int i=0; i<name.length; i++) {
			System.out.println("이름을 입력하세요");
			name[i] = scan.next();
			System.out.println("국어점수를 입력하세요.>>");
			kor[i] = scan.nextInt();
			System.out.println("영어점수를 입력하세요.>>");
			eng[i] = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			math[i] = scan.nextInt();
			total[i] = kor[i]+eng[i]+math[i];
			avg[i] = total[i]/3.0;
		}
		//출력
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]+"\t");
			System.out.println(kor[i]+"\t");
			System.out.println(eng[i]+"\t");
			System.out.println(math[i]+"\t");
			System.out.println(total[i]+"\t");
			System.out.println(avg[i]+"\t");
			System.out.println();
		}
//			name[0] = scan.next();
//			name[1] = scan.next();
//			name[2] = scan.next();
//			

		
		
		
		
		
		
		
		
//		int[] score = {100,90,80,70,60,50};
//		for(int i=0; i<score.length; i++) {
//			System.out.println(score[i]);
//		}
//		System.out.println(score[3]);
//		
		
		
		//number int 배열 3개를 선언해서 1~3까지 입력하시오.
		
//		int[] number2 = {1,2,3};
//		
//		int[] num = new int[100];
//		for(int i=0; i<100; i++) {
//			num[i]=i+1;
//		}
//		for(int i=0; i<100; i++) {
//			System.out.println(num[i]);
//		}
		
		
//		int num = 0;
//		int[] score = new int[5];
//		score[0]=1;
//		score[1]=2;
//		score[2]=3;
//		score[3]=4;
//		score[4]=5;
//		if(score[0]==1) {
//			System.out.println("값이 1입니다.");
//		}
//		System.out.println(score[0]);
	}

}
