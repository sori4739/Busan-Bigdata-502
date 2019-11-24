package concert;

public class Concert {
	Seat[] sSeat;
	Seat[] aSeat;
	Seat[] bSeat;

	public Concert() {
		sSeat = new Seat[10];
		aSeat = new Seat[10];
		bSeat = new Seat[10];
		init(sSeat);
		init(aSeat);
		init(bSeat);
	}
	//�¼� �ʱ�ȭ
	public void init(Seat[] seat) {
		for (int i = 0; i < seat.length; i++) {
			seat[i] = new Seat();
		}
	}
	// ����
	public void reserve(int seatType, String name, int seatNum) {
		boolean reserveCheck = reserveCheck(seatType, seatNum);
		if(reserveCheck) {
			if(seatType==1) {
				sSeat[seatNum-1].name = name;
			}else if(seatType==2) {
				aSeat[seatNum-1].name = name;
			}else {
				bSeat[seatNum-1].name= name;
			}
		}else {
			System.out.println("�̹� ����� �ڸ��Դϴ�.");
		}
	}

	// �ش� �ڸ��� ������ �ִ��� Ȯ��("---") ����� �ڸ��� ������ false
	public boolean reserveCheck(int seatType, int seatNum) {
		if(seatType==1) {
			if(sSeat[seatNum-1].name.equals("---")) {	
				return true;
			}
		}else if(seatType==2) {
			if(aSeat[seatNum-1].name.equals("---")) {	
				return true;
			}
		}else {
			if(bSeat[seatNum-1].name.equals("---")) {	
			}
		}
		return false;
	}

	// ���
	public void cancel() {

	}

	// �ش� �ڸ��� ����� �̸��� �ִ��� Ȯ��("�̸�")
	public void cancelCheck() {

	}

	// ��ȸ
	public void serch(int seatType) {
		if (seatType == 1) {
			for (int i = 0; i < sSeat.length; i++) {
				System.out.println(sSeat[i].name + " ");
			}
			System.out.println();
		} else if (seatType == 2) {
			for (int i = 0; i < aSeat.length; i++) {
				System.out.println(aSeat[i].name + " ");
			}
			System.out.println();
		} else {
			for (int i = 0; i < bSeat.length; i++) {
				System.out.println(bSeat[i].name + " ");
			}
			System.out.println();
		}

	}
}
