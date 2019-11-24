package starcraft.protoss;

public class Dragoon extends Unit {
	String name;
	int attack = 15;
	int armor = 5;
	int st = 100;
	
	public Dragoon(String n) {
		name = n;
		System.out.println("I have return");
	}
	//디폴트 생성자
	public Dragoon() {
	
	}
	
}
