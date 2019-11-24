package protoss;
//클래스로도 만들수있지만 인터페이스를사용하면 실수를 하지않는다. 인터페이스는 추상적인것을 사용한다.

interface Animal{
	public void sound();
}

class Tiger implements Animal{
	public void sound() {
		System.out.println("어흥");
	}
}

class Dog implements Animal{
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat implements Animal{
	public void sound() {
		System.out.println("야옹");
	}
}

class Fish implements Animal{
	public void sound() {
		System.out.println("뻐금뻐금");
	}
}

public class BindApp2 {
	
	static void play(Animal a) {
		a.sound();
	}

	public static void main(String[] args) {
		Cat c =new Cat();
		play(c);
		
		Dog d = new Dog();
		play(d);

		Tiger t = new Tiger();
		play(t);
		
		Fish f = new Fish();
		play(f);
		
	}

}
