package pack01;

public class Ex0526 {

	public static void main(String[] args) {
		Tv t = new Tv();
		CaptionTv ctv= new CaptionTv();
		ctv.text = "aaa";
		
		t = ctv;
//		ctv = t; //자손의객체로 조상의 참조변수xx
		Tv tt = null;
	}

}
