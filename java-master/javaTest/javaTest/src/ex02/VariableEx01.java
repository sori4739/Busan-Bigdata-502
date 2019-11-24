package ex02;

public class VariableEx01 {

	public static void main(String[] args) {
		boolean check = false; //1bit=2
		byte b = 127; //8bit = 256
		char c = 105; //2Byte=16bit=65536
		char ch = '가';
		int num = 2000; //4Byte = 32bit = 42억9천
		int n2 = '까'; 
		double d = 10.5; //8Byte = 64bit = 경
		double d2 = 2000000000.33;
		
		d = num; // d는 8Byte, num은 4Byte 묵시적 형변환 
		num = (int)d; // 명시적 형변환 = 강제성 num은 4byte, d는 8byte이기 때문 강제적으로 변환해야한다.
		System.out.println();
		 }
	
}
