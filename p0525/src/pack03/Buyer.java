package pack03;

public class Buyer {
	
	String mem_id;
	String mem_pw;
	String name;
	int money = 2000;
	double bonusPoint = 0;
	int i = 0;
	Product[] cart = new Product[8];
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족합니다. 물품을 구매할수 없습니다.");
			return;
		}
		money = money - p.price;
		bonusPoint = bonusPoint+p.bonusPoint;
		System.out.println();
		cart[i++] = p;
	}
}
