package ex02;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("������ �Է��ϼ���.(0~100): ");
		int score = sc.nextInt();
		System.out.println("�г��� �Է��ϼ���.(1~4): ");
		int year = sc.nextInt();

		if (score > 60) {
			if (year != 4) {
				System.out.println("�հ�");
			} else if (score > 70) {
				System.out.println("�հ�");
			} else {
				System.out.println("���հ�");
			}
		} else {
			System.out.println("���հ� !");
		}

	}
}