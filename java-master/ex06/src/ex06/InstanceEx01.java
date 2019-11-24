package ex06;

class Starcraft{}
class Protoss extends Starcraft{}
class Zealot extends Protoss{}
class Zerg extends Starcraft{
	void play() {}
}
class Hydra extends Zerg{}

	
//타입 변환이 가능한지 체크할 수 있는 함수
public class InstanceEx01 {

	public static void main(String[] args) {
		Starcraft s1 = new Zealot();//다형성
		Protoss p1 = (Protoss)s1;
		Starcraft s2 = p1;
		
		if (s1 instanceof Zerg) {
			Zerg z1 = (Zerg)s1;
			z1.play();
		}else {
			System.out.println("타입이 다릅니다.");
		}
		if(s1 instanceof Protoss) {
			System.out.println("s1 은 프로토스 타입입니다.");
		}
	}
}
