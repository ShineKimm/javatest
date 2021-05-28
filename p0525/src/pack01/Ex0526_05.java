package pack01;

public class Ex0526_05 {

	public static void main(String[] args) {
		//Product
		//p1에서 c1 참조변수 복사
		//c1에서 p1 참조변수 복사
		//p1에서 c2로 참조변수 복사
		//p1에서 s1로 참조변수 복사
		//s1에서 p1로 참조변수 복사
		//p1에서 s2로 참조변수 복사
		//p1의 참조변수가 누구것인지 instanceof 연산자를
		//사용해서 출력을 해보세요.
		
		Product p1 = null;
		Computer c1 = new Computer();
		Computer c2 = null;
		SmartPhon s1 = new SmartPhon();
		SmartPhon s2 = null;
		
		p1 = c1;
		c1 = (Computer)p1;
		c2 = c1;
		c2.cpuSpeed();
		
		if(p1 instanceof Computer) {
			System.out.println("p1의 참조변수는 computer 참조변수입니다.");
		}else {
			System.out.println("p1의 참조변수는 SmartPhone참조변수입니다.");
		}
		
		
		
		
//		Car c1 = null; // c1은 Car 참조변수
//		FireEngine f1 = new FireEngine();
//		FireEngine f2 = null;
//		FireEngine f3 = null;
//		Ambulance a1 = new Ambulance();
//		Ambulance a2 = null;
//		Ambulance a3 = null;
//		
//		c1 = a1;
//		if (c1 instanceof FireEngine) {
//			f3 = (FireEngine) c1;
//			System.out.println("fireEngine 참조변수에 복사했습니다.");
//		}else if(c1 instanceof Ambulance){
//			a3 = (Ambulance) c1;
//			System.out.println("FireEngine 참조변수입니다.");
//		}
//		if (c1 instanceof FireEngine) {
//		}
	}

}
