package ex02;

import java.util.Scanner;
//1.��ĳ�ʿ� ���콺 �ø���
//2.ctrl + shift + o = import ����Ű
public class SuccessOrFail {

	public static void main(String[] args) {
		//����� �Է��� �޴� Ŭ����
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("������ �Է��Ͻÿ�. ");
		int score = scanner.nextInt(); //�����Է� ���
		
		if(score>=80) {
			System.out.println("�����մϴ�! �հ��Դϴ�.");
		}else {
			System.out.println("���հ��Դϴ�.");
		}
		
		scanner.close();
	}

}
