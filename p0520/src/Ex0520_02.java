
public class Ex0520_02 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main x:"+d.x);
	}

	static void chage(Data d) {
		d.x = 1000;
	}
}
