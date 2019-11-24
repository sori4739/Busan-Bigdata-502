package protoss;

public class Dragoon extends Protoss {
	private String name;
	private int st;
	private int sh;
	private int attack;
	private int armor;
	
	public Dragoon() {
		this("µå¶ó±º",100,100,20,1);
	}
	
	public Dragoon(String name, int st, int sh, int attack, int armor) {
		super();
		this.name = name;
		this.st = st;
		this.sh = sh;
		this.attack = attack;
		this.armor = armor;
		
		System.out.println("I had returned");
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
