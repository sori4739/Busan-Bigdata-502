package ex03;

import java.util.Scanner;

public class Gugudan2 {
	 //만약 5단을 입력하면 5단만 출력하게 만들어라.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 :");
		int num = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.print(num+"*"+i+"="+num*i+", ");
			
		}

	}

}
