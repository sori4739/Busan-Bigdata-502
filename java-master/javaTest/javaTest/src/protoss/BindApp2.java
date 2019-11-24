package protoss;
//Ŭ�����ε� ����������� �������̽�������ϸ� �Ǽ��� �����ʴ´�. �������̽��� �߻����ΰ��� ����Ѵ�.

interface Animal{
	public void sound();
}

class Tiger implements Animal{
	public void sound() {
		System.out.println("����");
	}
}

class Dog implements Animal{
	public void sound() {
		System.out.println("�۸�");
	}
}

class Cat implements Animal{
	public void sound() {
		System.out.println("�߿�");
	}
}

class Fish implements Animal{
	public void sound() {
		System.out.println("���ݻ���");
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
