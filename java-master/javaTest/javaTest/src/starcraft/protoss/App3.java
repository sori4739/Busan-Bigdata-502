package starcraft.protoss;



public class App3 {

	static void attack(Zealot u1,Zealot u2) {
		int damage = u1.attack - u2.armor;
		u2.st = u2.st - damage;
		System.out.println(u2.name+"ü��:"+u2.st);
	}
	
	static void attack2(Zealot u1,Dragoon u2) {
		int damage = u1.attack - u2.armor;
		u2.st = u2.st - damage;
		System.out.println(u2.name+"ü��:"+u2.st);
	}
	
	static void attack3(Dragoon u1,Zealot u2) {
		int damage = u1.attack - u2.armor;
		u2.st = u2.st - damage;
		System.out.println(u2.name+"ü��:"+u2.st);
	}
	
	
	public static void main(String[] args) {
		Zealot z1 = new Zealot("ù��°����");
		Zealot z2 = new Zealot("�ι�°����");
		
		attack(z2,z1);
		attack(z1,z2);
		
		Dragoon d1 = new Dragoon("ù��°���");
		attack2(z1,d1);
		attack3(d1,z1);
	}

}
