package ex03;

import java.util.Scanner;

public class Gugudan3 {
	//입력 5단을 입력하면 1~5단까지 출력되게 만들어라.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 :");
		
		int num = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {//10에 num 넣기
			if(i<num+1) {
				for (int j = 1; j < 10; j++) {
					System.out.print(i+"*"+j+"="+i*j+", ");
				}
				System.out.println();
			}
		}

	}//end of main

}
