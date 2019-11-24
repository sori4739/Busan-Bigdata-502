package zerg;

import starcraft.StarcraftUnit;

public class Ultra extends ZergUnit {
	private String name;
	private int st;// Ã¼·Â

	public static int attack = 30;
	public static int armor = 1;

	public Ultra(String name, int st) {
		this.name = name;
		this.st = st;
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
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public int getSt() {
		return st;
	}

	@Override
	public void setSt(int st) {
		this.st = st;
		
	}


}
