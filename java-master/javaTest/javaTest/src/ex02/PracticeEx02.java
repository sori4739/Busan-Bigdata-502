package ex02;

public class PracticeEx02 {
	
	//void�� return���� �ʰڴ�.
	static int coin(int r,int coin) {
		//500�� ��������
		int count = r / coin;
		System.out.println(coin+"�� ���� : "+count);
		//�����ݾ�
		r = r % coin;
		System.out.println("�����ݾ� : "+r);
		return r;
	}

	public static void main(String[] args) {
		final int MONEY = 2680;
		// 500 , 100 , 50 , 10
		int restMoney = 	MONEY;
		//�Լ� ȣ��
		restMoney = coin(restMoney,500);
		restMoney = coin(restMoney,100);
		restMoney = coin(restMoney,50);
		restMoney = coin(restMoney,10);
		
		
	
		
	}

}
