import java.util.Scanner;

public class Ex0513_06_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//무한반복
		while(true) {
			System.out.println("0-4까지 숫자를 입력하세요.>>");
			int input1 = scan.nextInt();
			System.out.println("0-4까지 숫자를 입력하세요.>>");
			int input2 = scan.nextInt();
			
			System.out.println("입력 :" + input1 +","+ input2);
		}
		
	}

}
