package terran;

import starcraft.StarcraftUnit;

public class Scv extends TerranUnit {
	private String name;
	private int st;// Ã¼·Â

	public static int attack = 5;
	public static int armor = 1;

	public Scv(String name, int st) {
		this.name = name;
		this.st = st;
	}
	@Override
	public int getArmor() {
		// TODO Auto-generated method stub
		return armor;
	}
	
	public void repair() {
		
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


}
