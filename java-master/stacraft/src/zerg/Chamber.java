package zerg;

public class Chamber {
	public void upgradeAttack() {
		Hydra.attack++;
		Ultra.attack++;
		
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
		
		System.out.println("���� ���ݷ� ���׷��̵� �Ϸ�");
	}
	
	public void upgradeArmor() {
		Hydra.armor++;
		Ultra.armor++;
		
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
		
		System.out.println("���� ���� ���׷��̵� �Ϸ�");
	}
}
