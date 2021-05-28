
public class Singleton {
	private static Singleton s = new Singleton();
	
	static int count;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	int stu_num;
	String name;
	
	{
		count++;
		stu_num = count;
	}
	
	//같은 시간을 사용해야할때 싱글톤을 사용한다.
	private Singleton() {} 
	
	public static Singleton getInstance() {
		if(s==null) { // 메모리에 없을시 새롭게 생성해서 리턴
			s= new Singleton();
		}
		return s;
	}
}
