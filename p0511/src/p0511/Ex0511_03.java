package p0511;

import java.util.Scanner;

public class Ex0511_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자입력");
		double num1 = scan.nextDouble();
		System.out.println("두번째 숫자입력");
		double num2 = scan.nextDouble();
		double result = 0.0;
		String str = "";
		
		char input = scan.next().charAt(0);
		
		switch (input) {
		case '+':
			str = "더하기";
			result = num1 + num2;
			break;
		case '-':
			str = "빼기";
			result = num1 - num2;
			break;
		case '*':
			str = "곱하기";
			result = num1 * num2;
			break;
		case '/':
			str = "나누기";
			result = num1 / num2;
			break;
		}
		System.out.println("입력값 : "+ num1 +","+num2);
		System.out.println("사칙연산 : "+ str);
		System.out.println("결과값 : " + result);
		// 두숫자를 입력받아
		// 사칙연산(+.-,*,/)를 선택하면 값을 출력하시오.
		// 예시 : 소수점 출력가능 10,3,/ -> 3.33333
		// switch문 사용할것
		
		
		
		
		
		
		
		
		
		
		
		// 서울, 경기, 인천 -> 수도권입니다.
		// 부산, 대구, 경주 -> 경상도권입니다.
		// 광주, 전주, 군산 -> 전라도권입니다.
		// 대전, 충주, 청주 -> 충청도권입니다.
		// 춘천, 강릉, 원주 -> 강원도권입니다.
//		System.out.println("도시를 입력하세요.>>");
//		String input = scan.next();
//		
//		switch (input) {
//		case "서울": 	case "경기": 	case "인천":
//			System.out.println("수도권입니다.");
//			break;
//		case "부산": 	case "대구": 	case "경주":
//			System.out.println("경상도권입니다.");
//			break;
//		case "광주": case "전주": case "군산":
//			System.out.println("전라도권입니다.");
//			break;
//		case "대전": case "충주": case "청주":
//			System.out.println("충청도권입니다.");
//			break;
//		case "춘천": case "강릉": case "원주":
//			System.out.println("강원도권입니다.");
//			break;
//		default:
//			break;
//		}
		
		
		
		
		
//		System.out.println("점수를 입력하세요.>");
//		int score = scan.nextInt();
//		String grade ="";
//		if(score>=90) {
//			grade = "A";
//			if (score >= 98) {
//				grade = grade + "+";
//			}else if(score >= 93) {
//				grade = grade + "-";
//			}
//		}else if(score>=80) {
//			grade = "B";
//			if (score >= 88) {
//				grade = grade + "+";
//			}else if(score >= 83) {
//				grade = grade + "-";
//			}
//		}else if(score>=70) {
//			grade = "C";
//			if (score >= 78) {
//				grade = grade + "+";
//			}else if(score >= 73) {
//				grade = grade + "-";
//			}
//		}else if(score>=60) {
//			grade = "D";
//		}if (score >= 78) {
//			grade = grade + "+";
//		}else if(score >= 73) {
//			grade = grade + "-";
//		}
//		
//		else {
//			
//		}
		
	}

}
