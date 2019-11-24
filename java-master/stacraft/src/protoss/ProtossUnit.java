package protoss;

import starcraft.StarcraftUnit;

public abstract class ProtossUnit implements StarcraftUnit{
	
	public abstract int getSh();
	public abstract void setSh(int sh);
	
	public static void protossAttackOrArmorPrint() {
		System.out.println("질럿 공격력 :"+Zealot.attack);
		System.out.println("드라군 공격력 :"+Dragoon.attack);
		System.out.println("다크템플러 공격력 :"+DarkTempler.attack);
		System.out.println("질럿 방어력 :"+Zealot.armor);
		System.out.println("드라군 방어력 :"+Dragoon.armor);
		System.out.println("다크템플러 방어력 :"+DarkTempler.armor);
		
		
	}
	
}
