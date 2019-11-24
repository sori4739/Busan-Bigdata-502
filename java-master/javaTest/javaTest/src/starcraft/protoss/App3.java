package starcraft.protoss;



public class App3 {

	static void attack(Zealot u1,Zealot u2) {
		int damage = u1.attack - u2.armor;
		u2.st = u2.st - damage;
		System.out.println(u2.name+"체력:"+u2.st);
	}
	
	static void attack2(Zealot u1,Dragoon u2) {
		int damage = u1.attack - u2.armor;
		u2.st = u2.st - damage;
		System.out.println(u2.name+"체력:"+u2.st);
	}
	
	static void attack3(Dragoon u1,Zealot u2) {
		int damage = u1.attack - u2.armor;
		u2.st = u2.st - damage;
		System.out.println(u2.name+"체력:"+u2.st);
	}
	
	
	public static void main(String[] args) {
		Zealot z1 = new Zealot("첫번째질럿");
		Zealot z2 = new Zealot("두번째질럿");
		
		attack(z2,z1);
		attack(z1,z2);
		
		Dragoon d1 = new Dragoon("첫번째드라군");
		attack2(z1,d1);
		attack3(d1,z1);
	}

}
