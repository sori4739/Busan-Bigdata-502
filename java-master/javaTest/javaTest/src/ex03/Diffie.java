package ex03;

public class Diffie {

	static int getR1(int g, int n, int x) {
		//// R1 = G^X mod N (홍길동)
		int r1 = g;
		for (int i = 1; i <= x - 1; i++) {
			g = g * r1; //G의 for문 실행횟수만큼의 곱
		}
		r1 = g % n;

		// r1을 완성

		return r1;
	}

	static int getR2(int g, int n, int y) {
		// R2 = G^Y mod N (장동건)
		int r2 = g;
		for (int i = 1; i <= (y - 1); i++) {
			g = g * r2;
		}
		r2 = g % n;
		// r2을 완성

		return r2;
	}

	// x는 개인숫자
	// n은 임의의 소수
	// g는 n-1이하의 수 < 10
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

		// 1.공개된 색깔 : 노란색(소수여야 함)
		int N = 11;

		// 2.홍길동이 정한색 : 빨간색(개인색)
		int X = 2;

		// 3.장동건이 정한색 : 파란색(개인색)
		int Y = 3;

		// 4.공개된 색깔과 개인색을 섞은 색
		int R1, R2;

		// 5.N보다 작은 임의의 수 G
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
