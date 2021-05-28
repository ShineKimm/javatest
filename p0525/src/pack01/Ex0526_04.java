package pack01;

public class Ex0526_04 {

	public static void main(String[] args) {
		Product p1 = null;
		Product p2 = new Product();
		Product p3 = null;
		
		Computer c1 = new Computer();
		Computer c2 = null;
		Computer c3 = null;
		
		SmartPhon s1 = new SmartPhon();
		SmartPhon s2 = null;
		SmartPhon s3 = null;
//		p2.production_year();
//		c1.cpuSpeed();
//		
//		
//		p1 = c1; //조상의 참조변수로 자손의 객체를 다루는것
//		p1 = s1;
		//c1 -> p1, p1->c2 
		//s1 -> p3, p3->s2 s2->p1, p1>s3
		p1 = c1;
		c2 = (Computer)p1;
		p3 = s1;
		s2 = (SmartPhon)p3;
		p1 = s2;
		s3 = (SmartPhon)p1;
		
	}

}
