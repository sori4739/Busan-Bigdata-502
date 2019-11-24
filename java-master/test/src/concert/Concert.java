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
	//좌석 초기화
	public void init(Seat[] seat) {
		for (int i = 0; i < seat.length; i++) {
			seat[i] = new Seat();
		}
	}
	// 예약
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
			System.out.println("이미 예약된 자리입니다.");
		}
	}

	// 해당 자리에 예약이 있는지 확인("---") 예약된 자리가 있으면 false
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

	// 취소
	public void cancel() {

	}

	// 해당 자리에 예약된 이름이 있는지 확인("이름")
	public void cancelCheck() {

	}

	// 조회
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
