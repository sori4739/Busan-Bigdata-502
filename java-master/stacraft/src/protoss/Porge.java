package protoss;

public class Porge {
	public void upgradeAttack() {
		Zealot.attack++;
		DarkTempler.attack++;
		Dragoon.attack++;
		
		try {
			System.out.println("---30%");
			Thread.sleep(1000);
			System.out.println("---60%");
			Thread.sleep(1000);
			System.out.println("---90%");
			Thread.sleep(1000);
			System.out.println("---100%");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}//1000 = 1��
		
		System.out.println("�����佺 ���ݷ� ���׷��̵� �Ϸ�");
	}
	
	public void upgradeArmor() {
		Zealot.armor++;
		DarkTempler.armor++;
		Dragoon.armor++;
		
		try {
			System.out.println("---30%");
			Thread.sleep(1000);
			System.out.println("---60%");
			Thread.sleep(1000);
			System.out.println("---90%");
			Thread.sleep(1000);
			System.out.println("---100%");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}//1000 = 1��
		
		System.out.println("�����佺 ���� ���׷��̵� �Ϸ�");
	}
	
}
