package terran;

public class Armery {
	public void upgradeAttack() {
		Scv.attack++;
		Tank.attack++;
		
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
		
		System.out.println("테란 공격력 업그레이드 완료");
	}
	
	public void upgradeArmor() {
		Scv.armor++;
		Tank.armor++;
		
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
		
		System.out.println("테란 방어력 업그레이드 완료");
	}
}
