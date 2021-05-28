package pack04;

public class Ex0526_01 {

	public static void main(String[] args) {
		//조상 : Product 
		//자손 : Refrigerator -"비스포크 300,30
		//Washer - "트럼",180,18
		//Conditioner - "무풍",230,23
		//Styler - "스타일러",130,13
		//초기보유금액 - 2000
		// 구매물품 - 비스포크 2대, 트럼 3대, 무풍 1대, 스타일러 2대
		// 총 구매금액 출력, 총구매 개수 출력, 총구매목록 출력
		
		Buyer b1 = new Buyer();
		b1.mem_id = "0001";
		b1.mem_pw = "1111";
		b1.name = "김대영";
		
		b1.buy(new Refrigerator());
		b1.buy(new Refrigerator());
		b1.buy(new Washer());
		b1.buy(new Washer());
		b1.buy(new Washer());
		b1.buy(new Conditioner());
		b1.buy(new Styler());
		b1.buy(new Styler());
		
		System.out.println("보유금액 : "+b1.money);
		System.out.println("보너스포인트 : "+b1.bonusPoint);
		
		int sum = 0;
		for (int i = 0; i < b1.count; i++) {
			sum = sum+b1.cart[i].price;
			System.out.println(b1.cart[i].product_name);
			System.out.println(b1.cart[i].bonusPoint);
			System.out.println(b1.cart[i].price);
		}
	}

}
