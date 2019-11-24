package ex02;

public class MemoryEx01 {

	String name = "ÄÚ½º";

	void sound() {
		int sum = 100;
		System.out.println("sum : "+sum);
		
	}

	static void hello() {
		int num = 10;
		System.out.println("num : "+num);
	}
	public static void main(String[] args) {
		MemoryEx01 m = new MemoryEx01();
		MemoryEx01 f  =m;
		System.out.println(m.name);
		System.out.println(f.name);
		m.sound();
		MemoryEx01.hello();
	}

}
