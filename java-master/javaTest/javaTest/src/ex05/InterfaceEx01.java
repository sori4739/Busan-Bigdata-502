package ex05;

//1.�������̽��� ��ü�� ���������.(�߻�޼��带 ������ ����)
//2.�������̽��� ���� ��� ������ public static final�� �����Ǿ���.
//3.�������̰��� ���� ��� �޼ҵ�� public abstract�� �����Ǿ��ִ�.
//4.�������̽��� �Ϲ� �޼��带 ���� �� ����.
//5.�������̽��� �����ϴ� Ŭ������ �߻�޼��带 ������ ���� �����ؾ��Ѵ�.
//6.�������̽��� ���� ������ �����ϴ�.(����� ���� ��ӺҰ�)
interface PhoneInterface{
	public static final String name = "�������̽�";
	
	public abstract void play();
}

interface MobileInterface{
	
}

class A implements PhoneInterface, MobileInterface{
		public void play() {
		
	}
}



public class InterfaceEx01 {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.name);
		
		System.out.println(PhoneInterface.name);
	}

}
