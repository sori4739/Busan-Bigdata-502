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
		}//1000 = 1초
		
		System.out.println("프로토스 공격력 업그레이드 완료");
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
		}//1000 = 1초
		
		System.out.println("프로토스 방어력 업그레이드 완료");
	}
	
}
