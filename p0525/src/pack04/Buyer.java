package pack04;

public class Buyer {
	
	String mem_id;
	String mem_pw;
	String name;
	int money = 2000;
	double bonusPoint = 0;
	int count = 0;
	Product[] cart = new Product[10];
	
	void buy(Product p) {
		if (money<p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money = money - p.price;
		bonusPoint = bonusPoint+p.bonusPoint;
		System.out.println();
		cart[count++] = p;
		
	}
}
