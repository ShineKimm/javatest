package p0511;

import java.util.Iterator;
import java.util.Scanner;

public class Ex0511_04 {

	public static void main(String[] args) {
		
		int i =1;
		while(i<=9) {
			for(int j=1; j<=9; j++) {
				System.out.print(j+ " * "+i+" = "+(i*j)+"\t");
		}
		System.out.println(i++);
		}
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.print(j+ " * "+i+" = "+(i*j)+"\t");
//			}System.out.println("");
//		}
		// \t 탭 \n 엔터 
		
//		for(;;) {
//			System.out.println("");
//			break;
//		}
//		
//		int i=1;
//		int sum=0;
//		while(i<=100) {
//			sum = sum + i;
//			i++;
//		}
//		System.out.println(sum);
		
		//1~100까지 홀수값을 더해서 값을 출력하시오.
		
//		int sum =0;
//		for(int i =1; i <=10; i+=2) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
		
//		int sum=0;
//		for (int i = 1; i <= 10; i++) {
//			sum = sum + i;
//		}
//		System.out.println("합계 : " + sum);
//		int j=1;
//		while (j<=10) {
//			System.out.println(j);
//			j++;
//		}
//		
//		for(int i=1; i<=100; i++) {
//			System.out.println(i);
//		}
//		Scanner scan = new Scanner(System.in);
//		System.out.println("[숫자맞추기 게임]");
//		int score = (int)(Math.random()*5)+1;
//		
//		int input = scan.nextInt();
//		if(score==input) {
//			System.out.println("숫자를 맞췄습니다.!");
//		}else {
//			System.out.println("틀렸습니다.");
//		}
//		System.out.println("정답 : " +score);
//		System.out.println("입력값 : " + input);
		
//		int score = (int)(Math.random()*10); //0-9 정수가 나옴
//		int score2 = (int)(Math.random()*10)+1; //1~10
//		int score3 = (int)(Math.random()*10)+2; //2~11
//		int score4 = (int)(Math.random()*1000)+5; //5-1004;
//		
//		System.out.println(score);
//		System.out.println(score2);
//		System.out.println(score3);
//		System.out.println(score4);
	}

}
