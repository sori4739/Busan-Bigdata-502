package ex02;

import java.util.Scanner;

public class GBB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������� �����Դϴ�. ����, ���� , �� �߿��� �Է��ϼ���");
		System.out.print("ö��>>");
		String a = sc.next();
		System.out.print("����>>");
		String b = sc.next();

		// ö���� ���忡�� ���������� ���� ����
		if (a.equals("����")) {// ���ڿ��� equals�� ���Ѵ�.
			if (b.equals("����")) {
				System.out.println("�����ϴ�.");
			} else if (b.equals("����")) {
				System.out.println("���� �̰���ϴ�.");
			} else {
				System.out.println("ö���� �̰���ϴ�.");
			}
		} else if (a.equals("����")) {
			if (b.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			} else if (b.equals("����")) {
				System.out.println("�����ϴ�.");
			} else {
				System.out.println("���� �̰���ϴ�.");
			}
		} else {
			if (b.equals("����")) {
				System.out.println("���� �̰���ϴ�.");
			} else if (b.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			} else {
				System.out.println("�����ϴ�");
			}
			sc.close();
		}
	}
}
