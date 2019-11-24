package protoss;

public class ProtossApp {

	public static void attack(Protoss z , Protoss d) {
		int damage = z.getAttack() - d.getArmor();
		d.setSh(d.getSh() - damage);
		System.out.println(d.getSh());
	}
	
	
	public static void main(String[] args) {
		//Gateway ����
		Gateway gate1 = new Gateway();
		
		//���� 2��������
		Zealot z1 = gate1.makeZealot();
		Zealot z2 = gate1.makeZealot();
		
		//��� 2���� ����
		Dragoon d1 = gate1.makeDragoon();
		Dragoon d2 = gate1.makeDragoon();
		
		attack(z1,d1);
		attack(d1,z1);
	}

}
