package ex03;

import java.util.Scanner;

public class Gugudan2 {
	 //���� 5���� �Է��ϸ� 5�ܸ� ����ϰ� ������.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ��� :");
		int num = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.print(num+"*"+i+"="+num*i+", ");
			
		}

	}

}
