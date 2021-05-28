

public class Deck {
	//52장의 카드생성
	//52장의 카드에 kind,number   4*13 = 52  // for문을 두번사용함
	//52장을 섞는 메소드
	//52장의 카드를 꺼내는 메소드
	String[] kinds = {"SPADE","DIAMOND","HEART","CLOVER"};
	String[] number = {"0","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
	Card[] c = new Card[52]; //52장의 카드생성
	Card[] myCard = new Card[7];
	Card[] comCard = new Card[7];
	
	Deck() { //기본생성자 13*i*j
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				c[13*i+j] = new Card(kinds[i],number[j]);
				
			}
		}
	}//Deck
	void shuffle() { // 섞는 메소드
		for (int i = 0; i < 1000; i++) {
			int random_no = (int)(Math.random()*52); //0~52
			Card temp = c[0];
			c[0] = c[random_no];
			c[random_no] = temp;
 		}
	}
	//1장의 카드 출력
	void print_1card(int index) {
		System.out.printf("카드 : %s, %s \n",c[index].kind,c[index].number);
	}
	
	//5장의 카드 출력
	void print_5card() {
		System.out.println("5장 출력");
		for (int i = 0; i < 5; i++) {
			System.out.printf("카드 : %s,%s \n",c[i].kind,c[i].number);
			
		}
	}
	//52장의 카드출력
	void print_52card() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				System.out.printf("카드 : %s, %s \n ",c[13*i+j].kind, c[13*i+j].number);
				c[13*i+j] = new Card(kinds[i],number[j]);
			}
		}
	}
	//7장 배분 메소드
	void handOut7card() {
		System.out.println("7장씩 카드 배분");
			for (int j = 0; j < 14; j++) {
				if (j<=6) {
					myCard[j] = new Card(c[j].kind,c[j].number);
					System.out.printf("my카드 : %s, %s \n ",myCard[j].kind, c[j].number);
				}else {
					comCard[j-7] = new Card(c[j].kind,c[j-7].number);
					System.out.printf("com카드 : %s, %s \n ",comCard[j-7].kind, c[j].number);
				}
			}
	}
	
	//메뉴출력
	void menu_print() {
		System.out.println("카드 프로그램");
		System.out.println("1.카드 1장 출력");
		System.out.println("2.카드 5장 출력");
		System.out.println("3.카드 52장 출력");
		System.out.println("4.카드 섞기");
		System.out.println("5.내카드 컴퓨터 카드 출력");
		System.out.println("0.종료");
		System.out.println("-------------------");
		System.out.println("원하는 번호를 입력하세요.");
	}
	//내카드 컴퓨터카드 배분
	void mycard_comcard() {
		System.out.println("내 카드 5장");
		for (int i = 0; i < 5; i++) {
			System.out.printf("카드 : %s,%s \n",c[i].kind,c[i].number);
		}
		System.out.println("컴퓨터 카드 5장");
		for (int i = 6; i < 11; i++) {
			System.out.printf("카드 : %s,%s \n",c[i].kind,c[i].number);
			
		}
	}
}
