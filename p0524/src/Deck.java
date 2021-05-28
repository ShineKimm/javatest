
public class Deck {
	final int CARD_NUM = 52;
	Card[] c = new Card[CARD_NUM];  //c[0],c[1]..c[51]
	
	Deck() { //기본생성자 - spade, diamond, heart, clover
		for(int i=1;i<=4; i++) {
			for (int j = 0; j < 13; j++) {
				c[13*i+j] = new Card(i,j+1);
			}
		}
	}
	
	void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int random_no = (int)(Math.random()*52);
			Card temp = c[0];
			c[0] = c[random_no];
			c[random_no] = temp;
			
		}
	}
	void card_print(Card c) {
		String[] kinds = {"","SPADE","DIAMOND","HEART","CLOVER"};
		String[] numbers = {"0","1","2","3","4","5","6","7","8","9","10"
							,"J","Q","K"};
		System.out.printf("카드종류 : %s,%s \n",kinds[c.kind],numbers[c.number]);
	}
}
