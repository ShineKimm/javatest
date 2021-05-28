package pack02;

public class Ex0526_002 {

	public static void main(String[] args) {
		Buyer b1 = new Buyer();
		b1.mem_id = "member01";
		b1.name = "홍길동";
		
		b1.buy(new Tv());
		b1.buy(new Computer());
		b1.buy(new Audio());
		b1.buy(new Computer());
		b1.buy(new Computer());
		b1.buy(new Computer());
		b1.buy(new Computer());
		b1.buy(new Computer());
		b1.buy(new Computer());
		b1.buy(new Computer());
		b1.buy(new Computer());
		
		
		System.out.println("보유금액 : "+b1.money);
		System.out.println("보너스포인트 : "+b1.bonusPoint);
		
		int sum = 0 ,bonus = 0;
		String buy_print = "";
		for (int j = 0; j < b1.cart.length; j++) {
			sum = sum + b1.cart[j].price;
			System.out.println(b1.cart[j].pro_name+" ");
			System.out.println(b1.cart[j].bonusPoint+" ");
		}
	}

}
