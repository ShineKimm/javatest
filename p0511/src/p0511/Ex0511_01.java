package p0511;
import java.util.Scanner;
public class Ex0511_01 {

	public static void main(String[] args) {
		// 숫자 2.031457 입력받아 5자리 반올림해서 출력 하시오
		
		// TODO Auto-generated method stub
		//문제 1
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.>>");
		double num = scan.nextDouble();
		double result = Math.round(num*10000)/10000.0;
		System.out.println("result : " + result);
		//int num = scan.nextInt();
		
	}
}
//숫자를 입력받아 짝수인지, 홀수 인지 출력하시오. (if)
//숫자는 받고 엔터키를 뱉어낸다.
//		scan.nextInt(); //정수형
//		scan.nextDouble(); //실수형
//		scan.next(); //문자열 신림역 사거리 (사이띄우기 전까지만 받음)
//		scan.nextLine(); //문자열 신림역 사거리 (모두 받음)  엔터키까지 받음.
//		System.out.println("문자를 입력하세요.>>");
//		String str = scan.next(); 
//		System.out.println("출력 : " + num);
//		System.out.println("문자출력 : " + str);
//		if(num%2==0) {
//			System.out.println("짝수입니다.");
//		} else {
//			System.out.println("홀수입니다.");
//		}
//	}

