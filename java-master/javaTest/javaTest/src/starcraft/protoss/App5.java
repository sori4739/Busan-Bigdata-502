package starcraft.protoss;

class Animal {
	void play() {

	}
}

class Dog extends Animal {// extends)Ÿ���� ������(��ġ) ����Ѵ�.
	String sound = "�۸�";

	@Override //�������̵� (���� ���ε�)
	void play() {
		System.out.println(sound);
	}
}

class Cat extends Animal {
	String sound = "�߿�";

	@Override
	void play() {
		System.out.println(sound);

	}

}

class Lion extends Animal {
	String sound = "����";

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
