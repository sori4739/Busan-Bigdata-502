package ex03;

public class DiffieHellman {
	//1. int N , int G, int X
	public static void main(String[] args) {
		// 디피헬만 알고리즘
		
		//1.공개된 색깔 : 노란색(소수여야 함)
		int N = 11;
		
		//2.홍길동이 정한색 : 빨간색(개인색)
		int X = 2;
		
		//3.장동건이 정한색 : 파란색(개인색)
		int Y = 3;
		
		//4.공개된 색깔과 개인색을 섞은 색
		int R1,R2;

		//5.N보다 작은 임의의 수 G
		int G =5;
		
		//6.알고리즘
		//R1 = G^X mod N (홍길동)
		R1 = (G*G) % 11;
		//R2 = G^Y mod N (장동건)
		R2 = (G*G*G) % 11;
		
		int KEY1, KEY2; //공유키
		//KEY1 = R2^X mod N
		KEY1 = (R2*R2) % 11;
		
		//KEY2 = R1^Y mod N
		KEY2 = (R1*R1*R1) % 11;
		
		System.out.println("KEY1 : "+KEY1);
		
		System.out.println("KEY2 : "+KEY2);
	}

}
