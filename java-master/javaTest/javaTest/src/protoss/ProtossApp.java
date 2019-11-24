package protoss;

public class ProtossApp {

	public static void attack(Protoss z , Protoss d) {
		int damage = z.getAttack() - d.getArmor();
		d.setSh(d.getSh() - damage);
		System.out.println(d.getSh());
	}
	
	
	public static void main(String[] args) {
		//Gateway 积己
		Gateway gate1 = new Gateway();
		
		//龙返 2付府积己
		Zealot z1 = gate1.makeZealot();
		Zealot z2 = gate1.makeZealot();
		
		//靛扼焙 2付府 积己
		Dragoon d1 = gate1.makeDragoon();
		Dragoon d2 = gate1.makeDragoon();
		
		attack(z1,d1);
		attack(d1,z1);
	}

}
