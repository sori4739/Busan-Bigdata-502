package ex03;

public class ForEx01 {

	public static void main(String[] args) {
		//for+ctrl+space
		// 1�� �ʱⰪ int i = 0;
		// 2�� ���ǹ� i<5;
		// 3�� ������ ���̸� ������ ������ ��.
		// 4�� ������ i++;
		// 5�� ���ǹ� i<5;
		// 6�� ������ ���̸� ������ ������ ��.
		// 7�� ������ i++;
		// 8�� ���ǹ� i<5;
		// 9�� ������ ���̸� ������ ������ ��.
		for (int i = 2; i < 11; i = i + 2) {
			if (i != 4) {
				System.out.println(i);
			}

		}
		//1���� 100���� ����ϴ� for���� ����ÿ�.
		for (int a = 1; a < 101; a++) {
			System.out.print(a+" ");
			
			if(a % 10 ==0) {
				System.out.println();
			}
		}
		//1���� 100������ �� �� ¦���� ����Ͻÿ�.
		for (int i = 1; i < 101; i++) {
			if(i % 2 ==0) {
				System.out.println(i+" ");
			}
		}
		
		//1���� 100������ ���� ���ϴ� for��
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum = sum + i;
		}
		System.out.println("sum : "+sum);
		//1���� 10������ �� �� Ȧ���� �������ϴ� for��
		int sum2 =0;
		for (int i = 1; i < 11; i++) {
			if(i % 2 !=0 ) {
				sum2 = sum2 + i;
			}
		}
		System.out.println("sum2 :"+sum2);
	}//end of main

}
