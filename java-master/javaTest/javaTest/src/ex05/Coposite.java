package ex05;

class Engine{
	String name = "����";
}
class Giar{
	String name = "���";
}
class Accel{
	String name = "����";
}
class Wheel{
	String name = "����";
}
class Car{
	Engine e;
	Giar g;
	Accel a;
	Wheel w;
	
	
	public Car(Engine e, Giar g, Accel a, Wheel w) {
		this.e = e;
		this.g = g;
		this.a = a;
		this.w = w;
	}
}


public class Coposite {
	public static void main(String[] args) {
		//��������
		Car c = new Car(
				new Engine(),
				new Giar(),
				new Accel(),
				new Wheel()
		);
	}
}
