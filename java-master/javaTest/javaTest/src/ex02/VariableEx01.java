package ex02;

public class VariableEx01 {

	public static void main(String[] args) {
		boolean check = false; //1bit=2
		byte b = 127; //8bit = 256
		char c = 105; //2Byte=16bit=65536
		char ch = '��';
		int num = 2000; //4Byte = 32bit = 42��9õ
		int n2 = '��'; 
		double d = 10.5; //8Byte = 64bit = ��
		double d2 = 2000000000.33;
		
		d = num; // d�� 8Byte, num�� 4Byte ������ ����ȯ 
		num = (int)d; // ����� ����ȯ = ������ num�� 4byte, d�� 8byte�̱� ���� ���������� ��ȯ�ؾ��Ѵ�.
		System.out.println();
		 }
	
}
