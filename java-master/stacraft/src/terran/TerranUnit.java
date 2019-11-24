package terran;

import protoss.DarkTempler;
import protoss.Dragoon;
import protoss.Zealot;
import starcraft.StarcraftUnit;

public abstract class TerranUnit implements StarcraftUnit{
		public static void terranAttackOrArmor() {
			System.out.println("Scv 공격력 :"+Scv.attack);
			System.out.println("탱크 공격력 :"+Tank.attack);
			System.out.println("Scv 방어력 :"+Scv.armor);
			System.out.println("탱크 방어력 :"+Tank.armor);	
		}
}
