package starcraft.protoss;

class Animal {
	void play() {

	}
}

class Dog extends Animal {// extends)타입을 묶을때(일치) 사용한다.
	String sound = "멍멍";

	@Override //오버라이딩 (동적 바인딩)
	void play() {
		System.out.println(sound);
	}
}

class Cat extends Animal {
	String sound = "야옹";

	@Override
	void play() {
		System.out.println(sound);

	}

}

class Lion extends Animal {
	String sound = "어흥";

	@Override
	void play() {
		System.out.println(sound);

	}
}

public class App5 {

	static void start(Animal a) {
		a.play();
	}

	public static void main(String[] args) {
		Animal c1 = new Cat();
		Animal d1 = new Dog();
		Animal l1 = new Lion();
		start(c1);
		start(d1);
		start(l1);
		
		
	}

}
