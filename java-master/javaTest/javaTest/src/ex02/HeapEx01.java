package ex02;

//1.모든 것들은 클래스안에 있어야 한다.
//2.스택안에 메서드를 만들 수없다.
//3.static은 JVM이 시작될 때 메모리에 올라온다.
//4.스택안에 만든 변수는 지역변수
public class HeapEx01 {

	int num = 10;
	String name = "코스";
	static int result = 20;
	
	void sound() {
		System.out.println("야옹");
	}
	
	static void play() {
		System.out.println("놀자");
		
	}
	
	public static void main(String[] args) {
		System.out.println(HeapEx01.result);
		
		//num을 heap에 올리기
		HeapEx01 h = new HeapEx01();
		System.out.println(h.num);
		System.out.println(h.name);
		h.sound();
		HeapEx01.play();
	}

}
