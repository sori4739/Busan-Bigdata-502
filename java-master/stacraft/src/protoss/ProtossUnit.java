package protoss;

import starcraft.StarcraftUnit;

public abstract class ProtossUnit implements StarcraftUnit{
	
	public abstract int getSh();
	public abstract void setSh(int sh);
	
	public static void protossAttackOrArmorPrint() {
		System.out.println("���� ���ݷ� :"+Zealot.attack);
		System.out.println("��� ���ݷ� :"+Dragoon.attack);
		System.out.println("��ũ���÷� ���ݷ� :"+DarkTempler.attack);
		System.out.println("���� ���� :"+Zealot.armor);
		System.out.println("��� ���� :"+Dragoon.armor);
		System.out.println("��ũ���÷� ���� :"+DarkTempler.armor);
		
		
	}
	
}
