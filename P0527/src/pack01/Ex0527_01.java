package pack01;

import java.util.Scanner;

public class Ex0527_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Buyer b1 = new Buyer();
		
		while(true) {
			System.out.println("[쇼핑몰 프로그램]");
			System.out.println("1. 맥북노트북 구매");
			System.out.println("2. 아이폰 구매");
			System.out.println("3. OLEDTV 구매");
			System.out.println("4. 구매목록 보기");
			System.out.println("5. 현금충전");
			System.out.println("--------------------");
			System.out.println("원하는 번호를 입력하세요.>");
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1: // 맥북노트북 구매
				b1.buy(new Computer());
				b1.myInfo();
				break;
			case 2: // 아이폰 구매
				b1.buy(new SmartPhone());
				b1.myInfo();
				break;
			case 3: // OLEDTV 구매
				b1.buy(new Tv());
				b1.myInfo();
				break;

			case 4: //구매목록 보기
				b1.summery();
				break;
				
			case 5: //현금충전
				//얼마충전할거야? 결제는 카드로? 현금으로?
				System.out.println("얼마를 충전하시겠습니까?(0.상위메뉴로 이동)" );
				
				int cash = scan.nextInt();
				if (cash == 0) {
					System.out.println("상위메뉴로 이동합니다.");
				}
				//cash = cash + b1.getMoney();
				b1.setMoney(cash);
				System.out.println(cash+"이 충전되었습니다.");
				break;
				
			}//switch
		}
		
		
		
//		String name = scan.next();
//		Product p = new Product();
//		p.setPrice(100);
//		System.out.println(p.getPrice());
//		p.setBonusPoint(50);
//		System.out.println(p.getBonusPoint());
//		p.setProduct_name(name);
//		System.out.println(p.getProduct_name());
	}

}
