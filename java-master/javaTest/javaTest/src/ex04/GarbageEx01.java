package ex04;

public class GarbageEx01 {

	public static void main(String[] args) {
		String a = new String("Good");//heap
		String b = new String("Bad");//heap
		String c = new String("Normal");//heap
		 
		//a -> 500���� ->Good
		//b -> 700���� ->Bad
		//c -> 800���� ->Normal
		
		//���۷��� ������ ���� �ϸ� �ʱⰪ null
		String d;
		String e;
		
		a =null;//a�� �������÷���
		d =c;
		
		c =null; 
	}

}
