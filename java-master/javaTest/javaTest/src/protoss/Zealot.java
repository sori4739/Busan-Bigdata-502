package protoss;

public class Zealot extends Protoss {
	private String name;
	private int st; // Ã¼·Â
	private int sh;// ½¯µå
	private int attack;
	private int armor;
	
	public Zealot() {
		this("Áú·µ",100,100,16,1);
	}
	
	public Zealot(String name, int st, int sh, int attack, int armor) {
		this.name = name;
		this.st = st;
		this.sh = sh;
		this.attack = attack;
		this.armor = armor;
		
		System.out.println("My Life Aior");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSt() {
		return st;
	}

	public void setSt(int st) {
		this.st = st;
	}

	public int getSh() {
		return sh;
	} 

	public void setSh(int sh) {
		this.sh = sh;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	
}
