package protoss;

import starcraft.StarcraftUnit;

public class DarkTempler extends ProtossUnit{
	private String name;
	private int st;// Ã¼·Â
	private int sh;// ½¯µå

	public static int attack = 20;
	public static int armor = 1;

	public DarkTempler(String name, int st, int sh) {
		this.name = name;
		this.st = st;
		this.sh = sh;
	}
	@Override
	public int getArmor() {
		// TODO Auto-generated method stub
		return armor;
	}

	@Override
	public void attack(StarcraftUnit u1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSt() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSt(int st) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSh() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSh(int sh) {
		// TODO Auto-generated method stub
		
	}
	
}
