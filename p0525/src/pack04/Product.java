package pack04;

public class Product {
	String product_name;
	int price;
	int bonusPoint;
	
	
	public Product() {
	}
	Product(String product_name,int price,int bonusPoint){
		this.product_name = product_name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
}
