
public class Ex0521_01 {

	public static void main(String[] args) {
		//기본생성자를 사용하여 객체 3개를 생성하시오.
		//white, auto,4        pink,auto,5        silber,auto,4
		//white, auto,4       black,auto,4       white,auto,4
		//white, auto,4       green,auto,5       white,auto,4
		
		Car[] c = new Car[10];
		
		c[0] = new Car();
		c[1] = new Car("pink","auto",5);
		c[2] = new Car();
		c[3] = new Car();
		c[4] = new Car();
		c[5] = new Car();
		c[6] = new Car();
		c[7] = new Car();
		c[8] = new Car();
		
		
		Car d = new Car("pink","auto",5);
		Car e = new Car("silber","auto",4);
		Car c1 = new Car();
		Car c2 = new Car();
		System.out.println(c1.color);
	}

}
