package ex00;

public class InnerClassEx01 {

	class Son{
		int age = 17;
	}
	
	public static void main(String[] args) {
		InnerClassEx01 inner = new InnerClassEx01();
		Son s = inner.new Son();
		System.out.println(s.age);
		
		

	}

}
