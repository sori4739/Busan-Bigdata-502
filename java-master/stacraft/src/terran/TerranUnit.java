package terran;

import protoss.DarkTempler;
import protoss.Dragoon;
import protoss.Zealot;
import starcraft.StarcraftUnit;

public abstract class TerranUnit implements StarcraftUnit{
		public static void terranAttackOrArmor() {
			System.out.println("Scv ���ݷ� :"+Scv.attack);
			System.out.println("��ũ ���ݷ� :"+Tank.attack);
			System.out.println("Scv ���� :"+Scv.armor);
			System.out.println("��ũ ���� :"+Tank.armor);	
		}
}
