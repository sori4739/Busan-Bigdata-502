
//S석, A석, B석
public class Group {
	private char type;//S,A,B
	private Seat[] seats;//의자를 만들 공간을 10개만든것. Seat 객체 생성이 아니다. 배열의 생성
	
	
	public Group(char type) {
		this.type = type;
		
		seats = new Seat[10];
		for (int i = 0; i < seats.length; i++) {
			seats[i] = new Seat("---");
		}
	}


	public char getType() {
		return type;
	}


	public void setType(char type) {
		this.type = type;
	}


	public Seat[] getSeats() {
		return seats;
	}


	public void setSeats(Seat[] seats) {
		this.seats = seats;
	}
	
	
}
