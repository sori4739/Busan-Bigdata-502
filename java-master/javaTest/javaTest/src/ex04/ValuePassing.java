package ex04;

public class ValuePassing {
	//int m �� increase�Լ��� ������ �ִ� �������� 
	static void increase(int m) {
		m = m + 1;
	}
	//int n�� main�Լ��� ������ �ִ� ��������
	public static void main(String[] args) {
		int n = 10;
		//�Լ��� ȣ�� -> �Լ���(�μ�)
		increase(n);
		System.out.println("n :"+n);
		
		

	}

}
