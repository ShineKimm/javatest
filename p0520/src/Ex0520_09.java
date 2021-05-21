
public class Ex0520_09 {

	public static void main(String[] args) {
		int[] aa = new int[5];
		Mymath2 mm = new Mymath2();
		mm.a = 200;
		mm.b = 100;
		
		long c = mm.add();
		System.out.println(mm);
		System.out.println(c);
		
		
		long d = Mymath2.add(mm.a, mm.b);
		System.out.println(d);
		System.out.println(aa);
	}

}
