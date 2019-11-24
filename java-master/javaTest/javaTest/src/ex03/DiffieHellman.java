package ex03;

public class DiffieHellman {
	//1. int N , int G, int X
	public static void main(String[] args) {
		// �����︸ �˰���
		
		//1.������ ���� : �����(�Ҽ����� ��)
		int N = 11;
		
		//2.ȫ�浿�� ���ѻ� : ������(���λ�)
		int X = 2;
		
		//3.�嵿���� ���ѻ� : �Ķ���(���λ�)
		int Y = 3;
		
		//4.������ ����� ���λ��� ���� ��
		int R1,R2;

		//5.N���� ���� ������ �� G
		int G =5;
		
		//6.�˰���
		//R1 = G^X mod N (ȫ�浿)
		R1 = (G*G) % 11;
		//R2 = G^Y mod N (�嵿��)
		R2 = (G*G*G) % 11;
		
		int KEY1, KEY2; //����Ű
		//KEY1 = R2^X mod N
		KEY1 = (R2*R2) % 11;
		
		//KEY2 = R1^Y mod N
		KEY2 = (R1*R1*R1) % 11;
		
		System.out.println("KEY1 : "+KEY1);
		
		System.out.println("KEY2 : "+KEY2);
	}

}
