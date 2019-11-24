package ex05;

class Engine{
	String name = "¿£Áø";
}
class Giar{
	String name = "±â¾î";
}
class Accel{
	String name = "¿¢¼¿";
}
class Wheel{
	String name = "¹ÙÄû";
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
		//ÄÞÆ÷Áö¼Ç
		Car c = new Car(
				new Engine(),
				new Giar(),
				new Accel(),
				new Wheel()
		);
	}
}
