package ex02;

//���þȿ��� �޼��带 ���� �� ����.
//Ŭ���� �ۿ��� �ƹ��͵� ���� �� ����.
//�ڵ����� = ctrl + shift + f
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
