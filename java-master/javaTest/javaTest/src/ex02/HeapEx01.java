package ex02;

//1.��� �͵��� Ŭ�����ȿ� �־�� �Ѵ�.
//2.���þȿ� �޼��带 ���� ������.
//3.static�� JVM�� ���۵� �� �޸𸮿� �ö�´�.
//4.���þȿ� ���� ������ ��������
public class HeapEx01 {

	int num = 10;
	String name = "�ڽ�";
	static int result = 20;
	
	void sound() {
		System.out.println("�߿�");
	}
	
	static void play() {
		System.out.println("����");
		
	}
	
	public static void main(String[] args) {
		System.out.println(HeapEx01.result);
		
		//num�� heap�� �ø���
		HeapEx01 h = new HeapEx01();
		System.out.println(h.num);
		System.out.println(h.name);
		h.sound();
		HeapEx01.play();
	}

}
