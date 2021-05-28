
public class Card {
	
	
	
	
	int kind; //spade, diamond, heart, clover
	int number;
	
	Card(){
		this(1,1);
	}//기본생성자
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
}
