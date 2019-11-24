package zerg;

import starcraft.StarcraftUnit;

public class Hydra extends ZergUnit{
	private String name;
	private int st;// Ã¼·Â

	public static int attack = 10;
	public static int armor = 1;

	public Hydra(String name, int st) {
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
