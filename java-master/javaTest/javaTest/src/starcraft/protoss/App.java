package starcraft.protoss;

public class App {

	public static void main(String[] args) {
		Zealot z1 = new Zealot();
		Zealot z2 = new Zealot();

		//z1 -> z2 를 공격
		z2.st  = z2.st - (z1.attack - z2.armor);
		System.out.println("두번째 질럿의 체력 :"+z2.st);

		//z1 -> z2 를 공격
		z2.st  = z2.st - (z1.attack - z2.armor);
		System.out.println("두번째 질럿의 체력 :"+z2.st);
				
		//z1 -> z2 를 공격
		z2.st  = z2.st - (z1.attack - z2.armor);
		System.out.println("두번째 질럿의 체력 :"+z2.st);
				
		//z1 -> z2 를 공격
		z2.st  = z2.st - (z1.attack - z2.armor);
		System.out.println("두번째 질럿의 체력 :"+z2.st);
				
		//z1 -> z2 를 공격
		z2.st  = z2.st - (z1.attack - z2.armor);
		System.out.println("두번째 질럿의 체력 :"+z2.st);
		
		
	}

}
