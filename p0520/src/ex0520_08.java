import java.util.Scanner;

public class ex0520_08 {

	public static void main(String[] args) {
		// 두수를 입력받아 sum메소드호출 return값 출력->
		// sum -> 두수 사이의 값을 더하여 값을 리턴
		//1,100 -> 5050;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두수를 입력해주세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();;
		System.out.println("결과값 : "+sum(num1, num2));
	}
	
	static int sum(int num1,int num2) {
		int result = 0;
		for (int i = num1; i <= num2; i++) {
		//	result += i;
			result = result + i;
		}
		
		return result;
	}

}
