package concert;

import java.util.Scanner;

public class CocertApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		Concert concert = new Concert();
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			int n1 = sc.nextInt();
			switch (n1) {
			case 1:
				System.out.print("좌석구분 S(1), A(2), B(3)>>");
				int seatType = sc.nextInt();
				concert.serch(seatType);
				System.out.println("이름>>");
				String name = sc.next();
				System.out.println("번호>>");
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
