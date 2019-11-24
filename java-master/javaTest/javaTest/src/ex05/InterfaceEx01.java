package ex05;

//1.인터페이스는 객체를 만들수없다.(추상메서드를 가졌기 때문)
//2.인터페이스가 가진 모든 변수는 public static final이 생략되었다.
//3.인터페이가가 가진 모든 메소드는 public abstract가 생략되어있다.
//4.인터페이스는 일반 메서드를 가질 수 없다.
//5.인터페이스를 구현하는 클래스는 추상메서드를 무조건 강제 구현해야한다.
//6.인터페이스는 다중 구현이 가능하다.(상속은 다중 상속불가)
interface PhoneInterface{
	public static final String name = "인터페이스";
	
	public abstract void play();
}

interface MobileInterface{
	
}

class A implements PhoneInterface, MobileInterface{
		public void play() {
		
	}
}



public class InterfaceEx01 {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.name);
		
		System.out.println(PhoneInterface.name);
	}

}
