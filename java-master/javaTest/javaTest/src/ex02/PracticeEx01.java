package ex02;

public class PracticeEx01 {

	public static void main(String[] args) {
		final int MONEY = 2680;
		// 500 , 100 , 50 , 10
		int restMoney = 	MONEY;
		int count;
		//500�� ��������
		count = restMoney / 500;
		System.out.println("500�� ���� : "+count);
		//�����ݾ�
		restMoney = restMoney % 500;
		System.out.println("�����ݾ� : "+restMoney);
		//100�� ����
		 count = restMoney / 100;
		 System.out.println("100�� ���� : "+count);
		//�����ݾ�
		 restMoney = restMoney % 100;
		 System.out.println("�����ݾ� : "+restMoney);
		//50������
		count = restMoney / 50;
		System.out.println("50�� ���� : "+count);
		//�����ݾ�
		restMoney = restMoney % 50;
		System.out.println("�����ݾ� : "+restMoney);
		//10������
		count = restMoney / 10;
		System.out.println("10�� ���� : "+count);
		//�����ݾ�
		restMoney = restMoney % 10;
		System.out.println("�����ݾ� : "+restMoney);
		//restMoney�� ���� �����̱� ������ ���ذ��鼭 ���� ����Ѵ�
		
		
		
		
		
		
		
	}

}
