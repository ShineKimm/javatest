import java.util.Scanner;

public class Ex0513_06_01_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] ball = new int[25];
		for (int i=0; i<ball.length; i++) {
			ball[i] =i+1; 
		}
		
		for (int i=0; i<50; i++) {
			int temp =0;
			int rno = 0;
			rno = (int)(Math.random()*(25));//0-8
			temp = ball[0];
			ball[0] = ball[rno];
			ball[rno]= temp;
		}
		int k =0;
		int[][] arr = new int[5][5];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=ball[k];
				k++;                 //0-24
				//0,1,2,3,4,5,6,7,8
			}
		}
		
		//무한반복
		while(true) {
			
			//번호입력
			System.out.println("0-4까지 숫자를 입력하세요.>>");
			int input1 = scan.nextInt();
			System.out.println("0-4까지 숫자를 입력하세요.>>");
			int input2 = scan.nextInt();
            System.out.println("입력 :"+ input1+ ","+input2);
            
            arr[input1][input2] = 0;
		
		//배열출력
		System.out.printf("번호\t[0]\t[1]\t[2]\t[3]\t[4]\n");
		System.out.println("----------------------------------");
		for(int i=0; i<arr.length; i++) {
			System.out.print("["+i+"]\t");
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();	
		
		}//배열
		}
		
		
		// [5][5]배열 -> 1~25까지 랜덤숫자를 넣어서 출력
		//1-25까지 랜덤숫자 ->5,5 = 25
//		int[] ball = new int[25];
//		for (int i=0; i<ball.length; i++) {
//			ball[i] =i+1; 
//		}
//		
//		for (int i=0; i<50; i++) {
//			int temp =0;
//			int rno = 0;
//			rno = (int)(Math.random()*25);//0-8
//			temp = ball[0];
//			ball[0] = ball[rno];
//			ball[rno]= temp;
//		}
//		int k =0;
//		int[][] arr = new int[5][5];
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j]=ball[k];
//				k++;                 //0-24
//				//0,1,2,3,4,5,6,7,8
//			}
//		}
//		System.out.printf("번호\t[0]\t[1]\t[2]\t[3]\t[4]\n");
//		System.out.println("----------------------------------");
//		for(int i=0; i<arr.length; i++) {
//			System.out.print("["+i+"]\t");
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();	
		
	
	}//main
}//class
