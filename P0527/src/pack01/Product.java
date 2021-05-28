package pack01;

public class Product {
	String product_name; //인스턴스 변수
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
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
