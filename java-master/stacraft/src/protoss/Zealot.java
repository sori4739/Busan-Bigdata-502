package protoss;

import starcraft.StarcraftUnit;
import zerg.Ultra;

public class Zealot extends ProtossUnit {
	private String name;
	private int st;// Ã¼·Â
	private int sh;// ½¯µå

	public static int attack = 16;
	public static int armor = 1;

	public Zealot(String name, int st, int sh) {
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
		int damage = attack - u1.getArmor();
		
		//protoss or zerg,terran
		try {
			ProtossUnit pu = (ProtossUnit)u1;
			int protossSh = pu.getSh();
			if(protossSh < 1) {
				int restSt = pu.getSt() - damage;
				pu.setSt(restSt);
			}else {
				int restSh = pu.getSh() - damage;
				pu.setSh(restSh);
				if(restSh < 0) {
					int restDamage = pu.getSt() + restSh;
					pu.setSt(restDamage);
				}
			}
			
		} catch (Exception e) {
			int restSt = u1.getSt() - damage;
			u1.setSt(restSt);
		}
		
		
	}

	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name =name;
	}

	@Override
	public int getSt() {
		return st;
	}

	@Override
	public void setSt(int st) {
		this.st =st; 
	}

	@Override
	public int getSh() {
		return sh;
	}

	@Override
	public void setSh(int sh) {
		this.sh =sh;
		
	}
	
	

}
