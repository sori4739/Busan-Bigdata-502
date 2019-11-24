import java.util.Scanner;

public class CocertsApp {

	public static void main(String[] args) {
		Concert concert = new Concert();
		Scanner sc = new Scanner(System.in);
		System.out.println(concert.getHALLNAME()+"예약 시스템입니다.");
		
		while(true) {
			System.out.print("예약:1 , 조회:2, 취소:3, 끝내기:4>>");
			
			
			int n1 = sc.nextInt();
			if(n1==1) {
				System.out.print("좌석구분 S(1), A(2), B(3)>>");
				int n2 = sc.nextInt();
				if(n2==1) {
					concert.search('S');
					System.out.print("이름>>");
					String username = sc.next();
					System.out.print("번호>>");
					int seatNum = sc.nextInt();
					concert.reserve('S', username, seatNum);//S석, 이름 , 좌석 번호
				}else if(n2==2) {
					concert.search('A');
					System.out.print("이름>>");
					String username = sc.next();
					System.out.print("번호>>");
					int seatNum = sc.nextInt();
					concert.reserve('A', username, seatNum);
				}else {
					concert.search('B');
					System.out.print("이름>>");
					String username = sc.next();
					System.out.print("번호>>");
					int seatNum = sc.nextInt();
					concert.reserve('B', username, seatNum);
				}
			}else if(n1==2) {//전체 조회
				concert.search('S');
				concert.search('A');
				concert.search('B');
			}else if(n1==3) {//취소
				System.out.print("좌석 S:1, A:2, B:3>>");
				int n2 = sc.nextInt();
				if(n2==1) {
					concert.search('S');
				}else if(n2==2) {
					concert.search('A');
				}else {
					concert.search('B');
				}
				
				System.out.print("이름>>");
				String username = sc.next();
				concert.cancel(username,n2-1);
			}else {//종료
				break;//프로그램 종료
			}

		}
		
	}

}
