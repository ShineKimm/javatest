
public class Ex0524_06 {

	public static void main(String[] args) {
		Deck d = new Deck(); //52장의 카드가 만들어짐
		d.shuffle(); //카드섞기
		//5장
		System.out.println("5장출력");
		for (int i = 0; i < 5; i++) {
				d.card_print(d.c[i]); //c[0],c[1]..c[52]
		}
		//전체출력
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				d.card_print(d.c[13*i+j]); //c[0],c[1]..c[52]
			}
		}
		//card_print(1,1);
	}

}
