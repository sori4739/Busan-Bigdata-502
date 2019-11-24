package ex06;

public class WrapperEx01 {

	public static void main(String[] args) {
		byte b = 10; // 문자열로 변경 !
		String s = b+"";
		
		Byte b2 = 10;
		String s2 = b2.toString();
		//System.out.println(s2);
		int num = b2;
		
		
		
		int data = 20;
		//숫자를 문자화
		//1.
		String ss = data + "";//결합연산자
		//2.
		Integer iData = data;//wrapper 클래스로 변환 -> toString()
		String ss2 = iData.toString();
		System.out.println(ss2);
		//3.
		String ss3 = String.valueOf(data);//함수를 이용하는것 
		System.out.println(ss3);
		//문자를 숫자화 , 중요 !
		String r = "20";
		int n1 = Integer.parseInt(r);
	}

}
