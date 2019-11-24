package ex03;

import java.util.Random;
import java.util.Scanner;

public class Page159 {

	public static void main(String[] args) {
		while (true) {
			Random r = new Random();
			Scanner sc = new Scanner(System.in);
			System.out.println("정답을 입력하세요 ");
			int n = 1;
			int num = r.nextInt(100);
			System.out.println(num);
			while (true) {
				System.out.println(n+"->");
				int an = sc.nextInt();
				if (an < num) {
					System.out.println("더 높게");
					n++;

				} else if (an > num) {
					System.out.println("더 낮게");
					n++;

				} else {
					System.out.println("맞았습니다.");
					break;
				}
			}//end of while2
			System.out.println("계속하시겠습니까 (y/n)");
			String answer = sc.next();
			if (answer.equals("y")) {
				continue;
			} else {
				break;
			}
		}//end of while1
		
	}// end of main

}
