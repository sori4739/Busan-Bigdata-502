package ex02;

import java.util.Scanner;

public class GBB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보 게임입니다. 가위, 바위 , 보 중에서 입력하세요");
		System.out.print("철수>>");
		String a = sc.next();
		System.out.print("영희>>");
		String b = sc.next();

		// 철수의 입장에서 가위바위보 게임 시작
		if (a.equals("가위")) {// 문자열은 equals로 비교한다.
			if (b.equals("가위")) {
				System.out.println("비겼습니다.");
			} else if (b.equals("바위")) {
				System.out.println("영희가 이겼습니다.");
			} else {
				System.out.println("철수가 이겼습니다.");
			}
		} else if (a.equals("바위")) {
			if (b.equals("가위")) {
				System.out.println("철수가 이겼습니다.");
			} else if (b.equals("바위")) {
				System.out.println("비겼습니다.");
			} else {
				System.out.println("영희가 이겼습니다.");
			}
		} else {
			if (b.equals("가위")) {
				System.out.println("영희가 이겼습니다.");
			} else if (b.equals("바위")) {
				System.out.println("철수가 이겼습니다.");
			} else {
				System.out.println("비겼습니다");
			}
			sc.close();
		}
	}
}
