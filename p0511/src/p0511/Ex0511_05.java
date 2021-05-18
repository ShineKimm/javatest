package p0511;

import java.util.Scanner;

public class Ex0511_05 {

	public static void main(String[] args) {

		
		//1~100까지 난수를 생성해서
		//무한반복해서 번호를 맞출때 break문으로 빠져나오세요
		//정답 숫자를 출력하시오
		Scanner scan = new Scanner(System.in);
		int score = (int)(Math.random()*100)+1; //1~10
		int num = 0;
		int count = 1; //횟수 제한
		while (count <= 5) {
				System.out.println("숫자를 입력하세요.>> ");
				 num = scan.nextInt();
				if(num==score) {
					System.out.println("정답입니다.!");
					break;
				}else if(num>=score){
					System.out.println("틀렸습니다. 다시 도전하세요.");
					System.out.println(num +"입력한 숫자보다 작은수를 입력하세요");
				}else {
					System.out.println(num +"입력한 숫자보다 큰수를 입력하세요");
				}
		} count++; //while 
		
		System.out.println("정답" + score);
		
		
		
		
		
		//1~100까지에서
		//홀수만 더해서 200넘는 sum 값과 순차번호를 출력해보세요
//		int i = 1;
//		int sum = 0;
//		
//		while(true) {
//		if(sum>200) {
//			break;
//		}
//		i+=2;
//		sum = sum + i;
//	}
//	System.out.println("순차번호 :" + i);
//	System.out.println("합계 :" + sum);
//		
		
		
		//
//		int i = 0;
//		int sum = 0;
//		
//		while(true) {
//			if(sum>500) {
//				break;
//			}
//			i++;
//			sum = sum + i;
//		}
//		System.out.println("순차번호 :" + i);
//		System.out.println("합계 :" + sum);
		
//		int i = 0; //순차번호
//		int sum = 0; //합계초기화
//		
//		while(true) {
//			if(sum>100) {
//				break;
//			}
//			i++;
//			sum = sum + i;
//		}
//		System.out.println("순차번호 : " + i);
//		System.out.println("합계 : " + sum);
		
		
		
		//000
		//001
		//002
		//003
		//...
		//999
//		for(int i=0; i<=9; i++) {
//			for(int j=0; j<=9; j++) {
//				for(int k=0; k<=9; k++) {
//					System.out.println(""+i+j+k);
//				}
//			}
//		}
	}

}
