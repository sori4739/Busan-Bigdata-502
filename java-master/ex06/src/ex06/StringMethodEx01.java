package ex06;

public class StringMethodEx01 {

	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "BCD";
		String s3 = "ABC";
		
		//int compareTo // 0 or ��� or ����
		int r1 =s1.compareTo(s3);
		System.out.println(r1);//0�� ����
		
		int r2 =s1.compareTo(s2);
		System.out.println(r2);
		
		//contains() ���ڿ� �� true of false
		if(s1.contains(s3)) {
			System.out.println("���� ���ڿ��Դϴ�.");
		}
		//toLowerCase() �ҹ��ڷ� ��ȯ
		String r3 =s1.toLowerCase();
		System.out.println(r3);
		
		//replace() ���ڿ� ��ȯ
		String r4 = s1.replace('A', 'F');
		System.out.println(r4);
		
		//subString() ���ڿ� �ڸ���(���� ������ 0�̰�, ���� ���� �ε�������
		String r5 = s1.substring(0, 2);
		System.out.println(r5);
		
		String test1 = "���ع��� ��λ��� ������";//���ع��� ��λ�
		String r6 = test1.substring(0, 8);
		System.out.println(r6);
		
		//split() Ư�� ���ڿ��� ���� return���� �迭(���ڿ�)
	}

}
