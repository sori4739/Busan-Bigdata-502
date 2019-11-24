package ex03;

public class Diffie {

	static int getR1(int g, int n, int x) {
		//// R1 = G^X mod N (ȫ�浿)
		int r1 = g;
		for (int i = 1; i <= x - 1; i++) {
			g = g * r1; //G�� for�� ����Ƚ����ŭ�� ��
		}
		r1 = g % n;

		// r1�� �ϼ�

		return r1;
	}

	static int getR2(int g, int n, int y) {
		// R2 = G^Y mod N (�嵿��)
		int r2 = g;
		for (int i = 1; i <= (y - 1); i++) {
			g = g * r2;
		}
		r2 = g % n;
		// r2�� �ϼ�

		return r2;
	}

	// x�� ���μ���
	// n�� ������ �Ҽ�
	// g�� n-1������ �� < 10
	static int getKey1(int x, int n, int r2) {
		// KEY1 = R2^X mod N
		int key1 = r2;
		for (int i = 1; i <= x - 1; i++) {
			key1 = r2 * key1;// (r2*r2)
		}
		key1 = key1 % n;
		return key1;
	}

	static int getKey2(int x, int n, int r1) {
		//// KEY2 = R1^Y mod N
		int key2 = r1;
		for (int i = 1; i <= (x - 1); i++) {
			key2 = key2 * r1;
		}
		key2 = key2 % n;
		return key2;
	}
	public static void main(String[] args) {

		// 1.������ ���� : �����(�Ҽ����� ��)
		int N = 11;

		// 2.ȫ�浿�� ���ѻ� : ������(���λ�)
		int X = 2;

		// 3.�嵿���� ���ѻ� : �Ķ���(���λ�)
		int Y = 3;

		// 4.������ ����� ���λ��� ���� ��
		int R1, R2;

		// 5.N���� ���� ������ �� G
		int G = 5;

		R1 = getR1(5, 11, 2);
		R2 = getR2(5, 11, 3);

		System.out.println("R1 : " + R1);
		System.out.println("R2 : " + R2);

		int KEY1, KEY2;
		KEY1 = getKey1(X, N, R2);
		KEY2 = getKey2(Y, N, R1);

		System.out.println("KEY1 : " + KEY1);
		System.out.println("KEY2: " + KEY2);

	}

}
