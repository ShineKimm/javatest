package p0514;

public class Ex0514_01 {

	public static void main(String[] args) {
		
		// 1차원 30개짜리 배열 생성해서 랜덤으로 1~100까지 숫자를 넣어 만들어 보세요.
		// 1차원 40개짜리 배열을 생성해서 배열 5번째 방부터 20개만 복사해보세요.
		// for문, arraycopy메소드 2가지를 모두 사용하세요
		
		int[] arr1 = new int[30];
		int[] arr2 = new int[40];
		
		//입력
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int)((Math.random()*100)+1);
		}
		//for문 배열복사
		for (int i = 4; i < 24; i++) {
			arr2[i] = arr1[i];
		}
		// arraycopy 메소드 배열복사
		System.arraycopy(arr1, 4, arr2, 0, 20);
		
		
		//출력
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		// arraycopy메소드 사용
		System.arraycopy(arr1, 0, arr2, 0, 0);
		
		
		
//		int[] number = {1,2,3,4,5};
//		int[] newNumber = new int[10];
//		
//		//system.arraycopy() 메소드 사용해서 배열 복사
//		System.arraycopy(number, 0, newNumber, 0, number.length);
//		
//		//for 사용한 배열 복사
////		for (int i = 0; i < number.length; i++) {
////			newNumber[i] = number[i];
////		}
//		for (int i = 0; i < newNumber.length; i++) {
//			System.out.println(newNumber[i]);
//		}
	}

}
