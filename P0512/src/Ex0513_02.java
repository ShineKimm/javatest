import java.util.Iterator;
import java.util.Scanner;

public class Ex0513_02 {

	public static void main(String[] args) {
	//	char[] hax = {'5', 'C', 'A','F','E'};//12,10,15,14
		Scanner scan = new Scanner(System.in);
		System.out.println("16진수 영문을 입력하시오.(A-F)>>");
		char hax = scan.next().charAt(0);
		String[] octal = {"0","1","2","3","4","5","6","7","8","9","10","11"};
		
		String result ="";
		int temp = 0;
		for (int i = 0; i < 1; i++) {
			System.out.println(hax-'A'+10); //12
			//문자 5를 숫자 5로 치환하는 방법 '5'-'0'=5
			//temp = hax[0]-'0'; //5
			//System.out.println(octal[temp]);
			// 0은 아스키코드 48 
			// A 아스키코드 65
			// C 아스키코드 67
			// hex[1]-'A'+10
		}
	}

}
