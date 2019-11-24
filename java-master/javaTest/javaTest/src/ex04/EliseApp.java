package ex04;

public class EliseApp {

	public static void main(String[] args) {
		//클래스 = Elise = 설계도(상태,행위)
		Elise e = new Elise();
		e.drink();
		e.drink();
		System.out.println(e.getHeight());

	}

}
