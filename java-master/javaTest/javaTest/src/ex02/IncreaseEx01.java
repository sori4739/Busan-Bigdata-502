package ex02;

public class IncreaseEx01 {

	public static void main(String[] args) {
		int num = 10;
		num=num + 1;
		System.out.println(num);
		num=num + 3;
		System.out.println(num);
		num=num - 1;
		System.out.println(num);//���� ���̱� ������ �ٿ��� �� �ִ� �����ִ�.
		
		num++; // ��������
		System.out.println(num);
		num--;  //
		System.out.println(num);
		
		int n = 10;
		
		int result = n++; //���� ������ = n���� 11,�����ϰ� �����Ѵ�.
		System.out.println(result);
		
		int n2 = 10;
		
		int result2 = ++n2;//���� ������ =������ �����ϰ� �������Ѵ�.
		System.out.println(result2);
		
		

	}

}
