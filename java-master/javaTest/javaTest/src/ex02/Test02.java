package ex02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��Ͻÿ� :");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ� :");
		int num2 = sc.nextInt();
		System.out.print("����° ���ڸ� �Է��Ͻÿ� :");
		int num3 = sc.nextInt();
		int second;

		if (num1 > num3 && num2 > num3 && num1 > num2) {
			second = num2;
			System.out.println(second);
		} else if (num1 > num3 && num3 > num2 && num1 > num2) {
			second = num3;
			System.out.println(second);
		} else if (num2 > num1 && num2 > num3 && num1 > num3) {
			second = num1;
			System.out.println(second);
		} else if (num2 > num1 && num2 > num3 && num3 > num1) {
			second = num3;
			System.out.println(second);
		} else if (num3 > num1 && num2 > num1 && num3 > num2) {
			second = num2;
			System.out.println(second);
		} else if (num3 > num1 && num1 > num2 && num3 > num2) {
			second = num1;
			System.out.println(second);
		}
		sc.close();
	}
}