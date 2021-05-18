import java.util.Scanner;

public class Ex0512_01 {

	public static void main(String[] args) {
		
		//구구단을 출력하는데
		//출력할 구구단 범위를 입력받아 출력하시오
		// 2, 5를 입력받아 2-5단까지 출력하시오.
		
		int i = 0;
		int j = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("시작할 단을 입력하시오>>");
		int start = scan.nextInt();
		System.out.println("끝날 단을 입력하시오.>>");
		int end = scan.nextInt();
		//비교
		if(start>end) {
			int k = 0;
			k = start;
			start = end;
			end = k;
		}
		Math.ceil(2.015);
		Math.round(3.541);
		Math.floor(10.789);
		int num =(int)(Math.random()*100)+1;
		int input1 = Math.max(start, end); // 큰수 출력
		int input2 = Math.min(start, end); // 작은수 출력
		
		
		for(i=input1; i<=input2; i++) {
			for(j=1; j<9; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}
		
		
		
		//1~100까지 더하는 합계값이 200이 넘는 순간의 번호를 출력하시오
		// 그 값도 출력하시오.
//		int i=0;
//		int sum = 0;
//		int count = 0;
//		for(i=1; i<=100; i++) {
//			if(sum > 200) {
//				break;
//			}
//			sum = i+sum;
//			count ++;
//		}
//		System.out.println("순서번호 : " + ((i-1)-1));
//		System.out.println("합계 : "+ (sum-(i-1)));
		
		
		
		
//		int i = 0;
//		int j = 0;
//		
//		for(i=2; i<=9; i++) {
//			for(j=1; j<=9; j++) {
//				System.out.println(i+" * "+j+" = "+(i*1));
//			}
//		}
//		System.out.println("i의 최종값 출력 : " + i);
//		System.out.println("j의 최종값 출력 : " + j);
	}//main

}//class
