package pack01;

public class Ex0526_02 {

	public static void main(String[] args) {
		Car c1 = null; // 객체생성 없는 참조변수
		Car c2 = new Car(); //객체생성 있는 참조변수
		
		FireEngine f1 = null;
		FireEngine f2 = new FireEngine();
		
		Ambulance a1 = null;
		Ambulance a2 = new Ambulance();
		
		Car c3 = new FireEngine(); //다형성
		Car c4 = new Ambulance(); //다형성
		
//		FireEngine f3 = new Car(); //자손의 참조변수로 조상의 객체다루는것 안됨
		c1 = f1; //조상 객체가 선언되지 않은 참조변수
		c1 = f2; //다형성
		f1 = (FireEngine) c1; // 형변환필수
//		f1 = (FireEngine) c2; // 객체선언되어 있는 부모참조변수는 변환 불가능
		c1 = a1;
		c1 = a2;
		a1 = (Ambulance) c1;
//		a1 = (Ambulance) c2; //에러 부모객체선언되어 있음.
		System.out.println(a1);
//		f1 = (FireEngine) a1; 
		c1 = f1;
		a1 = c1;
	}

}
