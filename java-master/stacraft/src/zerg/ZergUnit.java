package zerg;

import starcraft.StarcraftUnit;
import terran.Scv;
import terran.Tank;

public abstract class ZergUnit implements StarcraftUnit {
	public static void zergAttackOrArmor() {
		System.out.println("����� ���ݷ� :"+Hydra.attack);
		System.out.println("��Ʈ�� ���ݷ� :"+Ultra.attack);
		System.out.println("����� ���� :"+Hydra.armor);
		System.out.println("��Ʈ�� ���� :"+Ultra.armor);	
	}
}
