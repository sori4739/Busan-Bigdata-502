
//S��, A��, B��
public class Group {
	private char type;//S,A,B
	private Seat[] seats;//���ڸ� ���� ������ 10�������. Seat ��ü ������ �ƴϴ�. �迭�� ����
	
	
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
