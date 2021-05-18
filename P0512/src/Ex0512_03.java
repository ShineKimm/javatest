import java.util.Iterator;

public class Ex0512_03 {

	public static void main(String[] args) {
		
		//구구단 출력 2*1=2, 2*3=6, 2*5=10..
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j%2 ==0) {
					continue;
				}
				System.out.printf("%d * %d = %d %n",i,j,(i*j));
			}
			System.out.println();
		}
		
		
		
//		double a = 5.2345678;
//		int b = 100;
//		String str = "school";
//		System.out.println(a+","+b);
//		System.out.printf("prontf출력 : %09.2f,%d %n",a,b); //정수 9자리 소수2자리까지 출력
//		System.out.printf("prontf출력 : %d %n",b);
//		System.out.printf("prontf출력 : %s %n",str);
//		
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.printf("%d * %d = %d",i,j,(i*j));
//			}
//			System.out.println();
//		}
		
	}

}
