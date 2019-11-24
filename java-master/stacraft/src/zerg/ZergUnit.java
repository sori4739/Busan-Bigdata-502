package zerg;

import starcraft.StarcraftUnit;
import terran.Scv;
import terran.Tank;

public abstract class ZergUnit implements StarcraftUnit {
	public static void zergAttackOrArmor() {
		System.out.println("히드라 공격력 :"+Hydra.attack);
		System.out.println("울트라 공격력 :"+Ultra.attack);
		System.out.println("히드라 방어력 :"+Hydra.armor);
		System.out.println("울트라 방어력 :"+Ultra.armor);	
	}
}
