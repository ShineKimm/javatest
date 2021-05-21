
public class Ex0521_05_01 {

	public static void main(String[] args) {
		String name ="";
		int count = 0;
		//S001,S002
//		System.out.printf("%d \n",5);
//		System.out.printf("￦%,07d \n",7812345);
//		System.out.printf("%07.2f \n",78.12345);
//		System.out.printf("%10s \n","더좋은");
//		String.format(name, args);
		String str_num = String.format("%04d", ++count);
		System.out.println(str_num);
	}

}
