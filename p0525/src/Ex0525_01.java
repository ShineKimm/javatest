

import java.util.Scanner;

public class Ex0525_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Deck d = new Deck(); //52장 카드 생성 후 kimd, number 입력완료
		//무한반복
		loop1:while (true) {
			d.menu_print(); //메뉴 출력
			int choice = scan.nextInt();
			
			//0인지 확인 - 프로그램 종료
			if (choice == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			switch (choice) {
			case 1:
				System.out.println("카드번호를 입력하세요.(0-51)>>");
				int num = scan.nextInt();
				d.print_1card(num);
				break;
				
			case 2://카드 5장 출력
				d.print_5card();;
				break;
				
			case 3:
				d.print_52card();
				break;
			case 4:
				d.shuffle();
				break;
			case 5:
				// 카드7장을 내것과 컴퓨터 것을 출력시키는 메소드를 작성해보세요.
				// mycard : spade, 1 heart,9 ...
				// 컴퓨터card : spade,j   diamond,k
				//d.mycard_comcard();
				d.handOut7card();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop1;
			
			default:
				break;
			}
		}
	}

}
