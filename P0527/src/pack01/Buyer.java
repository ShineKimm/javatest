package pack01;

import java.util.ArrayList;

public class Buyer {
	
	private String member_id;
	private String member_pw;
	private String name;
	private int money = 2000;
	private int bonusPoint;
	
//	private int count = 0;
	
	ArrayList list = new ArrayList(); //구매목록 저장
	
	
	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_pw() {
		return member_pw;
	}

	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = this.money + money;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

//	public int getCount() {
//		return count;
//	}
//
//	public void setCount(int count) {
//		this.count = count;
//	}

	
	//구매 메소드 -> 물품가격 차감, 보너스포인트 추가
	void buy(Product p) { //다형성: 부모의 참조변수로 자손의 객체를 다루는 것
		if(money <p.getPrice()) {
			System.out.println("잔액이 부족합니다. 잔액 보충을 해주세요");
			return; //메소드 return, for while, switch ->break, continue
		}
		money = money - p.getPrice();
		bonusPoint = bonusPoint + p.getBonusPoint();
		//cart[count++] = p;
		list.add(p);
		System.out.println(p.getProduct_name()+"구매하였습니다.");
	}
	void myInfo() {
		System.out.println("보유금액 : "+money);
		System.out.println("보너스포인트 : "+bonusPoint);
	}
	void summery() {
		String product_list ="";
		if (list.isEmpty()) {
			System.out.println("구매한 물품이 없습니다.");
			return;
		}
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			Product p = (Product)list.get(i); //Object 클래스로 리턴됨
			product_list = product_list+ p.getProduct_name()+" ";
			
			sum = sum + p.getPrice();
			
			//상품이름 pro_name
			//product_list = product_list + b1.cart[i].getProduct_name()+" ";
		}
		System.out.println("총구매 목록 개수 : "+list.size());
		System.out.println("총구매 금액" +sum );
		System.out.println("구매 목록 : "+product_list);
		
		
		
		
		
//		for (int i = 0; i < b1.getCount(); i++) {
//			product_list = product_list + b1.cart[i].getProduct_name()+" ";
//		}
//		System.out.println("총구매 목록 개수 : "+b1.getCount());
//		System.out.println("구매 목록 : "+product_list);
		myInfo();
	}

}
