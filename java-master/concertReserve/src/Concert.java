
//�ܼ�Ʈ  ��ü!!
public class Concert {

	private final String HALLNAME = "��ǰ�ܼ�ƮȦ";
	private Group[] group;

	public Concert() {
		group = new Group[3];
		group[0] = new Group('S');
		group[1] = new Group('A');
		group[2] = new Group('B');
	}

	public void reserve(char c, String username, int seatNum) {// ����
		//�ش� �迭�� ã��(c)
		if(c=='S') {
			Seat seat[] = group[0].getSeats();//�ش�迭�� Ư���ڸ��� ���� �ִ��� Ȯ��(seatNum)
			String value = seat[seatNum-1].getName();
			if(value.equals("---")) {
				//��������
				 seat[seatNum-1].setName(username);
			}else {
				//����Ұ�
				System.out.println("����� �¼��Դϴ�.");
			}
		}else if(c=='A') {
			Seat seat[] = group[1].getSeats();
			String value = seat[seatNum-1].getName();
			if(value.equals("---")) {
				seat[seatNum-1].setName(username);
			}else {
				System.out.println("����� �¼��Դϴ�.");
			}
		}else {
			Seat seat[] = group[2].getSeats();
			String value = seat[seatNum-1].getName();
			if(value.equals("---")) {
				seat[seatNum-1].setName(username);
			}else {
				System.out.println("����� �¼��Դϴ�.");
			}
		}
		//username�� �Է����ָ� ��.
		
	}

	public void search(char c) {// ��ȸ
		if (c == 'S') {
			Seat seat[] = group[0].getSeats();
			System.out.print(c+">>");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i].getName() + " ");
			}
			System.out.println();
		} else if (c == 'A') {
			Seat seat[] = group[1].getSeats();
			System.out.print(c+">>");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i].getName() + " ");
			}
			System.out.println();
		} else {
			Seat seat[] = group[2].getSeats();
			System.out.print(c+">>");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i].getName() + " ");
			}
			System.out.println();
		}
	}

	public void cancel(String username, int groupNum) {// ���
		//� �迭���� Ȯ��
		boolean check = false;
		Seat seat[] = group[groupNum].getSeats();
		for (int i = 0; i < seat.length; i++) {
			if(seat[i].getName().equals(username)) {
				seat[i].setName("---");
				check = true;
			}
		}
		if(check==false) {
			System.out.println("�ش��̸����� �����Ͻ� �¼��� �����ϴ�.");
		}
		
	}

	public String getHALLNAME() {
		return HALLNAME;
	}

}
