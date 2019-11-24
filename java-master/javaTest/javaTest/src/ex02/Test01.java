package ex02;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~99사이의 정수를 입력하시오 :");
		int num =sc.nextInt();
		
		int temp1 = num/10;
		System.out.println(temp1);
		
		int temp2 = num%10;
		System.out.println(temp2);
		
		if(num >=10) {//두자리수
			if(temp1%3==0 && temp2 % 3==0) {
				if(temp2 ==0) {
					System.out.println("박수 짝");
				}else {
					System.out.println("박수 짝짝");
				}
			}else if(temp1%3==0 || temp2%3==0) {
				System.out.println("박수짝");
			}
			}else {//한자리수 1~9
				if(temp2%3==3) {//3 6 9
					System.out.println("박수짝");
				}
			}
				
			}

	}


