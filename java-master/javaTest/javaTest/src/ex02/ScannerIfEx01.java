package ex02;

import java.util.Scanner;


//Q.Scanner Ŭ������ �̿��Ͽ� ������ �� ���� �׼��� �Է¹޾� ���� ��� ��ȯ�Ǵ��� ����϶�.
public class ScannerIfEx01 {

		
	public static void main(String[] args) {
		int coin;
		int count;
		int restCoin;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ��� :");
		coin = sc.nextInt();
		
		count = coin / 50000;
		System.out.println("�������� : "+count+"��");
		restCoin = coin % 50000;
		
		count = restCoin / 10000;
		System.out.println("������ : "+count+"��");
		restCoin = restCoin % 10000;
		
		count = restCoin / 1000;
		System.out.println("õ���� : "+count+"��");
		restCoin = restCoin % 1000;
		
		count =restCoin / 100;
		System.out.println("��� : "+count+"����");
		restCoin = restCoin % 100;
		
		count = restCoin / 50;
		System.out.println("���ʿ� : "+count+"����");
		restCoin = restCoin % 50;
		
		count = restCoin / 10;
		System.out.println("�ʿ� : "+count+"����");
		restCoin = restCoin % 10;
		
		count = restCoin / 1;
		System.out.println("�Ͽ� : "+count+"����");
		restCoin = restCoin % 1;
		
		sc.close();
	}

}
