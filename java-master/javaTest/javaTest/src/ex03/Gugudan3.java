package ex03;

import java.util.Scanner;

public class Gugudan3 {
	//�Է� 5���� �Է��ϸ� 1~5�ܱ��� ��µǰ� ������.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� :");
		
		int num = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {//10�� num �ֱ�
			if(i<num+1) {
				for (int j = 1; j < 10; j++) {
					System.out.print(i+"*"+j+"="+i*j+", ");
				}
				System.out.println();
			}
		}

	}//end of main

}
