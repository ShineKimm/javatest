package p0511;

import java.util.Scanner;

public class Ex0511_05 {

	public static void main(String[] args) {

		
		//1~100���� ������ �����ؼ�
		//���ѹݺ��ؼ� ��ȣ�� ���⶧ break������ ������������
		//���� ���ڸ� ����Ͻÿ�
		Scanner scan = new Scanner(System.in);
		int score = (int)(Math.random()*100)+1; //1~10
		int num = 0;
		int count = 1; //Ƚ�� ����
		while (count <= 5) {
				System.out.println("���ڸ� �Է��ϼ���.>> ");
				 num = scan.nextInt();
				if(num==score) {
					System.out.println("�����Դϴ�.!");
					break;
				}else if(num>=score){
					System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �����ϼ���.");
					System.out.println(num +"�Է��� ���ں��� �������� �Է��ϼ���");
				}else {
					System.out.println(num +"�Է��� ���ں��� ū���� �Է��ϼ���");
				}
		} count++; //while 
		
		System.out.println("����" + score);
		
		
		
		
		
		//1~100��������
		//Ȧ���� ���ؼ� 200�Ѵ� sum ���� ������ȣ�� ����غ�����
//		int i = 1;
//		int sum = 0;
//		
//		while(true) {
//		if(sum>200) {
//			break;
//		}
//		i+=2;
//		sum = sum + i;
//	}
//	System.out.println("������ȣ :" + i);
//	System.out.println("�հ� :" + sum);
//		
		
		
		//
//		int i = 0;
//		int sum = 0;
//		
//		while(true) {
//			if(sum>500) {
//				break;
//			}
//			i++;
//			sum = sum + i;
//		}
//		System.out.println("������ȣ :" + i);
//		System.out.println("�հ� :" + sum);
		
//		int i = 0; //������ȣ
//		int sum = 0; //�հ��ʱ�ȭ
//		
//		while(true) {
//			if(sum>100) {
//				break;
//			}
//			i++;
//			sum = sum + i;
//		}
//		System.out.println("������ȣ : " + i);
//		System.out.println("�հ� : " + sum);
		
		
		
		//000
		//001
		//002
		//003
		//...
		//999
//		for(int i=0; i<=9; i++) {
//			for(int j=0; j<=9; j++) {
//				for(int k=0; k<=9; k++) {
//					System.out.println(""+i+j+k);
//				}
//			}
//		}
	}

}
