package ex06;

public class WrapperEx01 {

	public static void main(String[] args) {
		byte b = 10; // ���ڿ��� ���� !
		String s = b+"";
		
		Byte b2 = 10;
		String s2 = b2.toString();
		//System.out.println(s2);
		int num = b2;
		
		
		
		int data = 20;
		//���ڸ� ����ȭ
		//1.
		String ss = data + "";//���տ�����
		//2.
		Integer iData = data;//wrapper Ŭ������ ��ȯ -> toString()
		String ss2 = iData.toString();
		System.out.println(ss2);
		//3.
		String ss3 = String.valueOf(data);//�Լ��� �̿��ϴ°� 
		System.out.println(ss3);
		//���ڸ� ����ȭ , �߿� !
		String r = "20";
		int n1 = Integer.parseInt(r);
	}

}
