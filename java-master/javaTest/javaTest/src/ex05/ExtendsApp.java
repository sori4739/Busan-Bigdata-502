package ex05;

public class ExtendsApp {

	public static void main(String[] args) {
		Son s = new Son();
		System.out.println(s.speed);
		System.out.println(s.money);
		System.out.println(s.height);
		
		Child c = new Child();
		System.out.println(c.speed);
	}

}
