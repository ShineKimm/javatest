//import java.util.Scanner;
//
//public class Ex0520_03 {
//	static Scanner scan = new Scanner(System.in);
//
//	public static void main(String[] args) {
//		System.out.println("1번째 데이터를 입력하세요.>>");
//		int num1 = scan.nextInt();
//		System.out.println("2번째 데이터를 입력하세요.>>");
//		int num2 = scan.nextInt();
//		System.out.println("[사칙연산을 선택]");
//		System.out.println("0.더하기 1.빼기 2.곱하기 3.나누기");
//		System.out.println("번호를 선택하세요.>>");
//		int sign = scan.nextInt();
//		String str = "";
//		switch (sign) {
//		case 0: //더하기
//			str = "더하기";
//			break;
//		case 1: //빼기
//			str = "빼기";
//			break;
//		case 2: //곱하기
//			str = "곱하기";
//			break;
//		case 3: //나누기
//			str = "나누기";
//			break;
//
//		default:
//			break;
//		}
//		return result;
//	}
//		double result = calculation(num1, num2, sign);
//		
//		System.out.println("더하기 ");
//		
//		System.out.println("사칙연산 결과값 : "+result);
//		
//	}
//	
//	static double calculation(int num1, int num2, int sign) {
//		
//		double result = 0;
//		switch (sign) {
//		case 0: //더하기
//			result = num1 + num2;
//			break;
//		case 1: //빼기
//			result = num1 - num2;
//			break;
//		case 2: //곱하기
//			result = num1 * num2;
//			break;
//		case 3: //나누기
//			result = num1 / num2;
//			break;
//
//		default:
//			break;
//		}
//		return result;
//	}
//}