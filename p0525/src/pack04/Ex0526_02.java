package pack04;

public class Ex0526_02 {
public static void main(String[] args) {
	
	Buyer b1 = new Buyer();
	b1.mem_id = "member01";
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
	b1.buy(new Styler());
	b1.buy(new Styler());
	
	int sum =0;
	for (int i = 0; i < b1.count; i++) {
		sum = sum+b1.cart[i].price;
		System.out.print("구매목록 : "+b1.cart[i].product_name);
		System.out.println("구매가격 : "+b1.cart[i].price);
	}
	System.out.println("총구매가격 : "+sum);
}
	
}
