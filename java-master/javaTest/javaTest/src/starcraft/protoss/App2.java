package starcraft.protoss;

public class App2 {

	static void attack(Zealot z1, Zealot z2) {
		// z1 -> z2 �� ����
		if (z2.st > 0) {
			z2.st = z2.st - (z1.attack - z2.armor);
			System.out.println("�ι�° ������ ü�� :" + z2.st);
			if (z2.st <= 0) {
				System.out.println("������ �����߽��ϴ�.");
			}
		} else {
			System.out.println("���̻� ������ �� �����ϴ�.");
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
