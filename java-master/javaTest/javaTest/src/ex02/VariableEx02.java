package ex02;

public class VariableEx02 {

	public static void main(String[] args) {
		int money;
		int price = 100;
		
		System.out.println(price);
		price = 200;
		System.out.println(price);
		
		//final 변수는 읽기 전용 변수, 변경할 수 없다.
		final double PI = 3.14; // 상수는 대문자로 만든다. 상수(변하지않는수).
		System.out.println(PI);
		
	}

}
