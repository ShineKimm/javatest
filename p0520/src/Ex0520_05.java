import java.util.Scanner;

public class Ex0520_05 {

	public static void main(String[] args) {
		//두 수를 입력받아 더하기를 해서 결과값을 출력하시오.
		//main -> 두수를 입력받고 add메소드 호출
		// add() 두수를 더해서 return
		Scanner scan = new Scanner(System.in);
		int result = 0;
		
		System.out.println("첫번째 수를 입력하세요");
		int num1 = scan.nextInt();
		System.out.println("두번째 수를 입력하세요");
		int num2 = scan.nextInt();
		add(num1,num2);
		System.out.println("두수의 빼기 결과값"+sub(num1,num2));;
		System.out.println("두수의 곱하기 결과값"+div(num1,num2));;
		
	}
	static int add(int num1, int num2) {
		int result = num1+num2;
		System.out.println("두수의 더하기 결과값"+result);
		return result;
	}
	static int sub(int num1, int num2) {
		int result = num1-num2;
		return result;
	}
	static int div(int num1, int num2) {
		int result = num1*num2;
		return result;
	}
}
