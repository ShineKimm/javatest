
public class Ex0524_06 {

	public static void main(String[] args) {
		Deck d = new Deck(); //52장의 카드가 만들어짐
		d.shuffle(); //카드섞기
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 6; j++) {
				d.c[13*i+j].card_print(i+1, j+1);
			}
		}
	}

}
