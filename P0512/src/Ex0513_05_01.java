import java.util.Scanner;

public class Ex0513_05_01 {

	public static void main(String[] args) {
		//[0,0][0,1][0,2]
		//[3][3]의 배열
		Scanner scan = new Scanner(System.in);
		System.out.println("1차원 배열 입력>>");
		int input1 = scan.nextInt();
		System.out.println("1차원 배열 입력>>");
		int input2 = scan.nextInt();
		
		String[][] arr = new String[input1][input2];
		
		//입력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = "["+i+","+j+"]";
			}
		}
		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
