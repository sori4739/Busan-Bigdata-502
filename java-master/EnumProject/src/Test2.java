//ø‰¿œ 0, 1, 2, 3, 4, 5, 6
enum Day{
	MON(1), TUE(2), WEN(3), THU(4), FRI(5), SAT(6), SUN(7);
	
	final int NUM;
	
	private Day(int NUM) {
		this.NUM = NUM;
	}
}



public class Test2 {

	public static void main(String[] args) {
		System.out.println(Day.MON);
		System.out.println(Day.MON.ordinal());
		System.out.println(Day.SUN.ordinal());
		System.out.println(Day.MON.NUM);
		System.out.println();
		for (Day d : Day.values()) {
			System.out.println(d);
		}
	}
}
