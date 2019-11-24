package starcraft.protoss;

public class DarkTempler extends Unit {
	String name;
	int attack = 50;
	int armor = 5;
	int st = 100;
	
	public DarkTempler(String n) {
		name = n;
		System.out.println("Adun toridas");
	}
	//디폴트 생성자
	public DarkTempler() {
	
	}
	
}
