package ex02;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~99������ ������ �Է��Ͻÿ� :");
		int num =sc.nextInt();
		
		int temp1 = num/10;
		System.out.println(temp1);
		
		int temp2 = num%10;
		System.out.println(temp2);
		
		if(num >=10) {//���ڸ���
			if(temp1%3==0 && temp2 % 3==0) {
				if(temp2 ==0) {
					System.out.println("�ڼ� ¦");
				}else {
					System.out.println("�ڼ� ¦¦");
				}
			}else if(temp1%3==0 || temp2%3==0) {
				System.out.println("�ڼ�¦");
			}
			}else {//���ڸ��� 1~9
				if(temp2%3==3) {//3 6 9
					System.out.println("�ڼ�¦");
				}
			}
				
			}

	}


