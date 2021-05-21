//import java.util.Scanner;
//
//public class Ex0520_04 {
//
//	public static void main(String[] args) {
//		//두 수를 입력받아 큰수와 작은수를 표시하시오.
//		// 큰수:10, 작은수:5
//		// 비교하는 구문은 메소드로 분리하시오.
//		
//		//main메소드 -> 두수를 입력받고
//		//메소드 호출 compare(num1,num2)
//		
//		//static void compare(int num1, int num2) {
//		
//		//}
//		Scanner scan = new Scanner(System.in);
//		System.out.println("두수를 입력하세요");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		String result = "";
//		compare(num1,num2);
//		System.out.println(result);
//	}
//		
//	
//	static int compare(int num1, int num2) {
//		if (num1 > num2) {
//			result = System.out.printf("큰수 %d 작은수 %d,",num1,num2);
//			
//		}else {
//			System.out.printf("작은수 %d 큰수 %d,",num1,num2);
//		}
//		return result;
//		
//	}
//}
