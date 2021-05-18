package p0511;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		// 두숫자를 입력받아
		// 사칙연산(+.-,*,/)를 선택하면 값을 출력하시오.
		// 예시 : 소수점 출력가능 10,3,/ -> 3.33333
		// switch문 사용할것
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자입력");
		double num1 = scan.nextDouble();
		System.out.println("두번째 숫자입력");
		double num2 = scan.nextDouble();
		double result = 0.0;
		String str = "";
		char input = scan.next().charAt(0);
		
		switch(input) {
		case '+':
			str = "더하기";
			result = num1 + num2;
			break;
		case '-':
			str ="빼기";
			result = num1 - num2;
			break;
		case '/':
			str = "나누기";
			result = num1 / num2;
			break;
		}
		System.out.println("입력값 : " + num1 +","+num2);
		System.out.println("사칙연산 : "+str);
		System.out.println("결과값 : " +result);
	}
}
