package ex02;

public class OperatorEx01 {

	public static void main(String[] args) {
		int time = 3; // 3�ð�
		int min = time * 60;
		int sec = min * 60;
		
		//String + int = ������ �ȴ�.
		//int + int = ������ �ȴ�.
		System.out.println("�ð� : "+time);
		System.out.println("�� : "+min);
		System.out.println("�� : "+sec);
		
		
		//2��10��
		System.out.println(2*2*2*2*2*2*2*2*2*2);
		
		int sal = 1000000; //����
		int comn = 300000; //���ʽ�
		
		System.out.println(sal+comn);
		
		//����
		System.out.println(10-3);
		//System.out.println("10"-"3"); //����-���ڿ� ���ڴ� ������ �����̾ȵȴ�. ������ ������ ����
		
		//������
		System.out.println(10/2);
		int n1 = 10;
		int n2 = 3;
		double n3 = 3;
		int result;
		double result2;
		double result3;
		int result4;
		result = n1 / n2;
		System.out.println(result); // int�� �����̱⶧���� �Ǽ��� ǥ�������ʴ´�.
		
		result2 =n1 / n2;
		System.out.println(result2);
		
		result3 = n1 / n3;
		System.out.println(result3);
		
		//result4 = n1 / n3; ���� = double�� int�� ���Ծȵ�.
		//System.out.println(result4);
		
		
		
		

	}

}
