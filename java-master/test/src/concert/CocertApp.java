package concert;

import java.util.Scanner;

public class CocertApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		Concert concert = new Concert();
		while(true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			int n1 = sc.nextInt();
			switch (n1) {
			case 1:
				System.out.print("�¼����� S(1), A(2), B(3)>>");
				int seatType = sc.nextInt();
				concert.serch(seatType);
				System.out.println("�̸�>>");
				String name = sc.next();
				System.out.println("��ȣ>>");
				int seatNum = sc.nextInt();
				concert.reserve(seatType,name,seatNum);
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			default:
				break;
			}
		}
		
			
		

	}

}
