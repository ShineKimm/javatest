package pack02;

public class Buyer {
	String mem_id;
	String mem_pw;
	String name;
	int money = 1000;
	double bonusPoint =0;
	int i = 0;
	Product[] cart = new Product[10]; //구매목록확인
	
	void buy(Product p) {
		if (money<p.price) {
			System.out.println("잔액이 부족합니다. 물품을 구매할수없습니다. 충전하세요.");
			return;
		}
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		System.out.println(p.pro_name+"가 구매되었습니다.");
		cart[i++] = p;
	}
//	void buy(Computer c) {
//		money = money - c.price;
//		bonusPoint = bonusPoint + c.bonusPoint;
//		System.out.println("MACBOOK이 구매되었습니다.");
//	}
//	void buy(Audio a) {
//		money = money - a.price;
//		bonusPoint = bonusPoint + a.bonusPoint;
//		System.out.println("Audio가 구매되었습니다.");
//	}
}
