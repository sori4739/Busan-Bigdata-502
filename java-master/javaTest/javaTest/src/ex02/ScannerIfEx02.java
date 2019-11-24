package ex02;

import java.util.Scanner;

public class ScannerIfEx02 {

	int coin(int restCoin,int num) {
		System.out.println(num+"원권"+restCoin/num+"매");
		return restCoin % num;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하라 : ");
		int nm = sc.nextInt();
		ScannerIfEx02 coin = new ScannerIfEx02();
		nm = coin.coin(nm, 50000);
		nm = coin.coin(nm, 10000);
		nm = coin.coin(nm, 1000);
		nm = coin.coin(nm, 100);
		nm = coin.coin(nm, 50);
		nm = coin.coin(nm, 10);
		nm = coin.coin(nm, 1);

	}

}
