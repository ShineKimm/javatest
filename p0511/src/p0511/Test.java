package p0511;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		// �μ��ڸ� �Է¹޾�
		// ��Ģ����(+.-,*,/)�� �����ϸ� ���� ����Ͻÿ�.
		// ���� : �Ҽ��� ��°��� 10,3,/ -> 3.33333
		// switch�� ����Ұ�
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ù��° �����Է�");
		double num1 = scan.nextDouble();
		System.out.println("�ι�° �����Է�");
		double num2 = scan.nextDouble();
		double result = 0.0;
		String str = "";
		char input = scan.next().charAt(0);
		
		switch(input) {
		case '+':
			str = "���ϱ�";
			result = num1 + num2;
			break;
		case '-':
			str ="����";
			result = num1 - num2;
			break;
		case '/':
			str = "������";
			result = num1 / num2;
			break;
		}
		System.out.println("�Է°� : " + num1 +","+num2);
		System.out.println("��Ģ���� : "+str);
		System.out.println("����� : " +result);
	}
}
