
public class Student {
	
	static int count; //클래스변수
	
	String stu_number; //학생번호
	String name;
	int kor;
	int eng;
	int math;
	int total;
	Double avg;
	int rank;
	
	{
		stu_number = "S"+String.format("%03d", ++count);		
	}
	
	Student(){
	}//기본생성자
	
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
}
