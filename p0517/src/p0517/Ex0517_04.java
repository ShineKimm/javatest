package p0517;

import java.util.Scanner;

public class Ex0517_04 {

	public static void main(String[] args) {
		// 번호 시,분,초를 입력받아 출력하시오
		//시(0-23), 분(0-59), 초(0-59.999)를 입력받아 출력하시오
		//3개를 입력받아 출력을 해보세요
		//시간은 수정이 가능하게 해보세요
		//1. 시간 추가
		//2. 시간 출력
		//3. 시간 수정
		Scanner scan = new Scanner(System.in);
		int[] number = new int[3];
		int[] hour = new int[3];
		int[] min = new int[3];
		double[] sec = new double[3];
		String[] title = {"순번","시","분","초"}; 
		int search_time = 0;
		int search_num1 = 0; // 찾을 순번 번호변수
		int search_num2 = 0;  
		int num = 0; //찾을 시 분 초 번호변수
		
		while (true) {
			System.out.println("시간 프로그램");
			System.out.println("메뉴를 선택해 주세요. 1.시간추가 2.시간출력 3.시간수정");
			
			int choice = scan.nextInt(); 
			switch (choice) {
			case 1:
				System.out.println("시간추가메뉴입니다.");
				for (int i = 0; i < hour.length; i++) {
						number[i] =i+1;
						System.out.println("시를 입력하세요");
						hour[i] = scan.nextInt();
						System.out.println("분을 입력하세요");
						min[i] = scan.nextInt();
						System.out.println("초를 입력하세요");
						sec[i] = scan.nextDouble();
					
				}
				
				break;
			case 2: //출력
				System.out.println("시간 출력메뉴입니다.");
				for (int i = 0; i < title.length; i++) {
					System.out.print(title[i]+"\t");
				}
					System.out.println();
				for (int i = 0; i < hour.length; i++) {
					System.out.print(number[i]+"\t");
					System.out.print(hour[i]+"\t");
					System.out.print(min[i]+"\t");
					System.out.print(sec[i]+"\t");
					System.out.println();
				}
				
				break;
			case 3: //수정
				System.out.println("수정 메뉴입니다.");
				System.out.println("수정할 순번을 입력해주세요");
				search_time = scan.nextInt();
				
				//순번 검색
				search_num1 = -1; 
				
				for (int i = 0; i < hour.length; i++) {
					if (search_time == (number[i])) {
						num = i;
						search_num1 = 0;
						break; // 찾으면 for문 종료
					}
				}
				//찾고자하는 이름이 없으면
				if (search_num1 ==-1) {
					System.out.println("찾고자 하는 순번이 없습니다!");
					break;
				}
				System.out.println("수정할 시분초 선택");
				System.out.println("0.시 1.분 2.초");
				System.out.println("수정할 번호를 입력하세요");
				search_num2 = scan.nextInt();
				switch (search_num2) {
				case 0:
					System.out.println("현재 입력된 시 :"+hour[num]);
					System.out.println("수정 시분초 입력 : ");
					hour[num]=scan.nextInt();
					System.out.println("수정이 완료되었습니다.!");
					break;
				case 1:
					System.out.println("현재 입력된 시분초 :"+min[num]);
					System.out.println("수정 시분초 입력 : ");
					min[num]=scan.nextInt();
					System.out.println("수정이 완료되었습니다.!");
					break;
				case 2:
					System.out.println("현재 입력된 시분초 :"+sec[num]);
					System.out.println("수정 시분초 입력 : ");
					sec[num]=scan.nextInt();
					System.out.println("수정이 완료되었습니다.!");
					break;
					

				default:
					break;
				}
				
				break;

			default:
				break;
			}
		
		} //while
	}//main

}
