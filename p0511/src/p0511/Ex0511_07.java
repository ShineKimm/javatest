package p0511;

public class Ex0511_07 {

	public static void main(String[] args) {

		for(int i=2; i<=9; i++) {
			loop1: for(int j=1; j<=9; j++) {
				if(j==2) {
					break loop1;
				}
				System.out.println(i+" * " +j+" = "+(i*j));
			}
			System.out.println();
		}
		//1-100출력을 하는데 5의 배수는 제외하시오
//		for(int i=0; i<=100; i++) {
//			if(i%5==0) {
//				continue;
//			}
//			System.out.println(i);
//		}
	}

}
