package p0511;
import java.util.Scanner;
public class Ex0511_01 {

	public static void main(String[] args) {
		// ���� 2.031457 �Է¹޾� 5�ڸ� �ݿø��ؼ� ��� �Ͻÿ�
		
		// TODO Auto-generated method stub
		//���� 1
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.>>");
		double num = scan.nextDouble();
		double result = Math.round(num*10000)/10000.0;
		System.out.println("result : " + result);
		//int num = scan.nextInt();
		
	}
}
//���ڸ� �Է¹޾� ¦������, Ȧ�� ���� ����Ͻÿ�. (if)
//���ڴ� �ް� ����Ű�� ����.
//		scan.nextInt(); //������
//		scan.nextDouble(); //�Ǽ���
//		scan.next(); //���ڿ� �Ÿ��� ��Ÿ� (���̶��� �������� ����)
//		scan.nextLine(); //���ڿ� �Ÿ��� ��Ÿ� (��� ����)  ����Ű���� ����.
//		System.out.println("���ڸ� �Է��ϼ���.>>");
//		String str = scan.next(); 
//		System.out.println("��� : " + num);
//		System.out.println("������� : " + str);
//		if(num%2==0) {
//			System.out.println("¦���Դϴ�.");
//		} else {
//			System.out.println("Ȧ���Դϴ�.");
//		}
//	}

