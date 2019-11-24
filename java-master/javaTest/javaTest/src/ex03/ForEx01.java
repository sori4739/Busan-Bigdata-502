package ex03;

public class ForEx01 {

	public static void main(String[] args) {
		//for+ctrl+space
		// 1번 초기값 int i = 0;
		// 2번 조건문 i<5;
		// 3번 조건이 참이면 스택이 실행이 됨.
		// 4번 증감식 i++;
		// 5번 조건문 i<5;
		// 6번 조건이 참이면 스택이 실행이 됨.
		// 7번 증감식 i++;
		// 8번 조건문 i<5;
		// 9번 조건이 참이면 스택이 실행이 됨.
		for (int i = 2; i < 11; i = i + 2) {
			if (i != 4) {
				System.out.println(i);
			}

		}
		//1부터 100까지 출력하는 for문을 만드시오.
		for (int a = 1; a < 101; a++) {
			System.out.print(a+" ");
			
			if(a % 10 ==0) {
				System.out.println();
			}
		}
		//1부터 100까지의 수 중 짝수만 출력하시오.
		for (int i = 1; i < 101; i++) {
			if(i % 2 ==0) {
				System.out.println(i+" ");
			}
		}
		
		//1부터 100까지의 합을 구하는 for문
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum = sum + i;
		}
		System.out.println("sum : "+sum);
		//1부터 10까지의 수 중 홀수의 합을구하는 for문
		int sum2 =0;
		for (int i = 1; i < 11; i++) {
			if(i % 2 !=0 ) {
				sum2 = sum2 + i;
			}
		}
		System.out.println("sum2 :"+sum2);
	}//end of main

}
