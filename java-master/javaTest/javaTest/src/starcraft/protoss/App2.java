package starcraft.protoss;

public class App2 {

	static void attack(Zealot z1, Zealot z2) {
		// z1 -> z2 를 공격
		if (z2.st > 0) {
			z2.st = z2.st - (z1.attack - z2.armor);
			System.out.println("두번째 질럿의 체력 :" + z2.st);
			if (z2.st <= 0) {
				System.out.println("질럿이 전사했습니다.");
			}
		} else {
			System.out.println("더이상 공격할 수 없습니다.");
		}
	}

	public static void main(String[] args) {
		Zealot z1 = new Zealot();
		Zealot z2 = new Zealot();

		App2.attack(z1, z2);
		App2.attack(z1, z2);
		App2.attack(z1, z2);
		App2.attack(z1, z2);
		App2.attack(z1, z2);
		App2.attack(z1, z2);
		App2.attack(z1, z2);
		App2.attack(z1, z2);
		App2.attack(z1, z2);
		App2.attack(z1, z2);
		App2.attack(z1, z2);
		App2.attack(z1, z2);
		App2.attack(z1, z2);
		App2.attack(z1, z2);
		App2.attack(z1, z2);
		App2.attack(z1, z2);
		App2.attack(z1, z2);
		App2.attack(z1, z2);
		App2.attack(z1, z2);
		App2.attack(z1, z2);
		App2.attack(z1, z2);
		
		App2.attack(z2, z1);
	}

}
