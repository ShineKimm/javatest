package p0511;

import java.util.Scanner;

public class Ex0511_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�б��� ����� �Է����ּ���.>>");
		String input = scan.nextLine();
		if(input.equals("school")) {
			System.out.println("�����Դϴ�. : " + input);
		}else {
			System.out.println("�����Դϴ�. ���� : school, �Է� :"+ input);
		}
		
		String str ="";
		if(str !=null && !str.equals("")) {
			char ch = scan.next().charAt(0);
		}
		
		
		
		
//		char ch = scan.next().charAt(0);		
		//���� 1���� �Է¹޾� ���ĺ����� �ƴ����� ����Ͻÿ�.
		// ���ĺ��Դϴ�. ���ĺ��� �ƴմϴ�.
		// ��ҹ��� ��� ����.
//		if(ch >= 'a' && ch<='z' || ch>='A' && ch<='Z') {
//		System.out.println("���ĺ��Դϴ�.");
//	}else {
//		System.out.println("���ĺ��� �ƴմϴ�.");
//	}
//		
//		System.out.println("���ڸ� �Է��ϼ���.>>");
//		char ch = scan.next().charAt(0);  // Ÿ���� ĳ���ͷ� �ٲ�
//		if(ch=='X' || ch=='x') {
//			System.out.println("���α׷��� ����Ǿ����ϴ�.");
//		}else {
//			System.out.println("���α׷��� ������� �ʾҽ��ϴ�.");
//		}
//		if(ch>'0' && ch<='9') {
//			System.out.println("���� 1���� �Է��ϼ̽��ϴ�.");
//		}else {
//			System.out.println("���ڰ� �ƴմϴ�.");
//		}
//		String str = "abcdef";
//		str.charAt(0); //���ڸ� �߶���
//		char ch1 = str.charAt(3);
//		System.out.println(ch1);
//		Math.round(0);
	}

}
