import java.util.Scanner;

public class CocertsApp {

	public static void main(String[] args) {
		Concert concert = new Concert();
		Scanner sc = new Scanner(System.in);
		System.out.println(concert.getHALLNAME()+"���� �ý����Դϴ�.");
		
		while(true) {
			System.out.print("����:1 , ��ȸ:2, ���:3, ������:4>>");
			
			
			int n1 = sc.nextInt();
			if(n1==1) {
				System.out.print("�¼����� S(1), A(2), B(3)>>");
				int n2 = sc.nextInt();
				if(n2==1) {
					concert.search('S');
					System.out.print("�̸�>>");
					String username = sc.next();
					System.out.print("��ȣ>>");
					int seatNum = sc.nextInt();
					concert.reserve('S', username, seatNum);//S��, �̸� , �¼� ��ȣ
				}else if(n2==2) {
					concert.search('A');
					System.out.print("�̸�>>");
					String username = sc.next();
					System.out.print("��ȣ>>");
					int seatNum = sc.nextInt();
					concert.reserve('A', username, seatNum);
				}else {
					concert.search('B');
					System.out.print("�̸�>>");
					String username = sc.next();
					System.out.print("��ȣ>>");
					int seatNum = sc.nextInt();
					concert.reserve('B', username, seatNum);
				}
			}else if(n1==2) {//��ü ��ȸ
				concert.search('S');
				concert.search('A');
				concert.search('B');
			}else if(n1==3) {//���
				System.out.print("�¼� S:1, A:2, B:3>>");
				int n2 = sc.nextInt();
				if(n2==1) {
					concert.search('S');
				}else if(n2==2) {
					concert.search('A');
				}else {
					concert.search('B');
				}
				
				System.out.print("�̸�>>");
				String username = sc.next();
				concert.cancel(username,n2-1);
			}else {//����
				break;//���α׷� ����
			}

		}
		
	}

}
