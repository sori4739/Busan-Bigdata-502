
//콘서트  객체!!
public class Concert {

	private final String HALLNAME = "명품콘서트홀";
	private Group[] group;

	public Concert() {
		group = new Group[3];
		group[0] = new Group('S');
		group[1] = new Group('A');
		group[2] = new Group('B');
	}

	public void reserve(char c, String username, int seatNum) {// 예약
		//해달 배열을 찾기(c)
		if(c=='S') {
			Seat seat[] = group[0].getSeats();//해당배열의 특정자리에 값이 있는지 확인(seatNum)
			String value = seat[seatNum-1].getName();
			if(value.equals("---")) {
				//예약진행
				 seat[seatNum-1].setName(username);
			}else {
				//예약불가
				System.out.println("예약된 좌석입니다.");
			}
		}else if(c=='A') {
			Seat seat[] = group[1].getSeats();
			String value = seat[seatNum-1].getName();
			if(value.equals("---")) {
				seat[seatNum-1].setName(username);
			}else {
				System.out.println("예약된 좌석입니다.");
			}
		}else {
			Seat seat[] = group[2].getSeats();
			String value = seat[seatNum-1].getName();
			if(value.equals("---")) {
				seat[seatNum-1].setName(username);
			}else {
				System.out.println("예약된 좌석입니다.");
			}
		}
		//username을 입력해주면 됨.
		
	}

	public void search(char c) {// 조회
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

	public void cancel(String username, int groupNum) {// 취소
		//어떤 배열인지 확인
		boolean check = false;
		Seat seat[] = group[groupNum].getSeats();
		for (int i = 0; i < seat.length; i++) {
			if(seat[i].getName().equals(username)) {
				seat[i].setName("---");
				check = true;
			}
		}
		if(check==false) {
			System.out.println("해당이름으로 예약하신 좌석이 없습니다.");
		}
		
	}

	public String getHALLNAME() {
		return HALLNAME;
	}

}
