
public class Ex0521_04 {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.product_name = "OLED TV";
		p1.price = 700;
		p1.bonusPoint = p1.price/100;
		Product p2 = new Product(); //냉장고 500 5;
		p2.product_name = "냉장고";
		Product p3 = new Product();
		
		System.out.println("p1 : "+p1.serialNo);
		System.out.println("p2 : "+p2.serialNo);
		System.out.println("p3 : "+p3.serialNo);
		System.out.println("전체count "+Product.count+"개");
		System.out.println(p1.bonusPoint);
		
		Product p4 = new Product("OLED TV",700,p1.price);
		System.out.println(p1.bonusPoint);
		System.out.println(p2.product_name);
		
		Product p5 = new Product("OLED TV",700,p1.price);
		System.out.println(p1.serialNo);
		System.out.println(p2.product_name);
		
	}

}
