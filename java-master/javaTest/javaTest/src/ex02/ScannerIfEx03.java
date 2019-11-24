package ex02;

import java.util.Scanner;

public class ScannerIfEx03 {

	public static void main(String[] args) {
		String result ="박수 짝";
		Scanner sc = new Scanner(System.in);
		System.out.println("1~99사이의 정수를 입력하시오 :");
		int num = sc.nextInt();
		
		int num1=num%10;
		int num10=num/10;
		int clap = 0;
		if(num1==3 || num1==6 || num1==9) {
			clap++;
		}
		if(num10==3 || num10==6 || num10==9) {
			clap++;
		}
		if(clap==1)
			System.out.println("박수 짝");
		else if(clap==2) {
			System.out.println("박수 짝짝");
		}
		else {
			System.out.println(num);
		}
		sc.close();
		}
	}


