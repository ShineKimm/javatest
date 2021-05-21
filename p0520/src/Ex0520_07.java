import java.util.Scanner;

public class Ex0520_07 {

	public static void main(String[] args) {
		// 두수를 입력받아-> cal()메소드호출
		// cal() -> 더하기, 빼기, 곱하기, 나누기를 해서 리턴받음.
		Scanner scan = new Scanner(System.in);
		SignData s = new SignData();
		System.out.println("두수를 입력하세요");
		s.num1 = scan.nextInt();
		s.num2 = scan.nextInt();
		
		cal(s);
		System.out.println("두수 더하기 : "+s.result1);
		System.out.println("두수 빼기 : "+s.result2);
		System.out.println("두수 빼기 : "+s.result3);
		System.out.println("두수 빼기 : "+s.result4);
	}
	static void cal(SignData s) {
		s.result1 = s.num1+s.num2;
		s.result2 = s.num1-s.num2;
		s.result3 = s.num1*s.num2;
		s.result4 = s.num1/s.num2;
	}

}
