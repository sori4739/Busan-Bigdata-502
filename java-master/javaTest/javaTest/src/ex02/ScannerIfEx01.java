package ex02;

import java.util.Scanner;


//Q.Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 각각 몇개로 변환되는지 출력하라.
public class ScannerIfEx01 {

		
	public static void main(String[] args) {
		int coin;
		int count;
		int restCoin;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요 :");
		coin = sc.nextInt();
		
		count = coin / 50000;
		System.out.println("오만원권 : "+count+"매");
		restCoin = coin % 50000;
		
		count = restCoin / 10000;
		System.out.println("만원권 : "+count+"매");
		restCoin = restCoin % 10000;
		
		count = restCoin / 1000;
		System.out.println("천원권 : "+count+"매");
		restCoin = restCoin % 1000;
		
		count =restCoin / 100;
		System.out.println("백원 : "+count+"개수");
		restCoin = restCoin % 100;
		
		count = restCoin / 50;
		System.out.println("오십원 : "+count+"개수");
		restCoin = restCoin % 50;
		
		count = restCoin / 10;
		System.out.println("십원 : "+count+"개수");
		restCoin = restCoin % 10;
		
		count = restCoin / 1;
		System.out.println("일원 : "+count+"개수");
		restCoin = restCoin % 1;
		
		sc.close();
	}

}
