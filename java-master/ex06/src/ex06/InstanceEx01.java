package ex06;

class Starcraft{}
class Protoss extends Starcraft{}
class Zealot extends Protoss{}
class Zerg extends Starcraft{
	void play() {}
}
class Hydra extends Zerg{}

	
//Ÿ�� ��ȯ�� �������� üũ�� �� �ִ� �Լ�
public class InstanceEx01 {

	public static void main(String[] args) {
		Starcraft s1 = new Zealot();//������
		Protoss p1 = (Protoss)s1;
		Starcraft s2 = p1;
		
		if (s1 instanceof Zerg) {
			Zerg z1 = (Zerg)s1;
			z1.play();
		}else {
			System.out.println("Ÿ���� �ٸ��ϴ�.");
		}
		if(s1 instanceof Protoss) {
			System.out.println("s1 �� �����佺 Ÿ���Դϴ�.");
		}
	}
}
