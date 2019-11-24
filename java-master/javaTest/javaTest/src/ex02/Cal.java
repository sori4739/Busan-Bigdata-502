package ex02;

//스택안에는 메서드를 만들 수 없다.
//클래스 밖에는 아무것도 만들 수 없다.
//자동졍렬 = ctrl + shift + f
public class Cal {

	// add, minus, multiful, divide
	static int add(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}

	static int minus(int n1, int n2) {
		int sum = n1 - n2;
		return sum;
	}

	static int multiful(int n1, int n2) {
		int sum = n1 * n2;
		return sum;
	}

	static int divide(int n1, int n2) {
		int sum = n1 / n2;
		return sum;
	}

	public static void main(String[] args) {

		int result = add(5, 3);
		System.out.println(result);

		result = minus(5, 3);
		System.out.println(result);

		result = multiful(5, 3);
		System.out.println(result);

		result = divide(5, 3);
		System.out.println(result);

	}

}
