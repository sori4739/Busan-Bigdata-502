package ex02;

public class OperatorEx01 {

	public static void main(String[] args) {
		int time = 3; // 3시간
		int min = time * 60;
		int sec = min * 60;
		
		//String + int = 결합이 된다.
		//int + int = 연산이 된다.
		System.out.println("시간 : "+time);
		System.out.println("분 : "+min);
		System.out.println("초 : "+sec);
		
		
		//2의10승
		System.out.println(2*2*2*2*2*2*2*2*2*2);
		
		int sal = 1000000; //월급
		int comn = 300000; //보너스
		
		System.out.println(sal+comn);
		
		//빼기
		System.out.println(10-3);
		//System.out.println("10"-"3"); //오류-문자와 숫자는 뺄셈은 결합이안된다. 덧셈만 결합이 가능
		
		//나누기
		System.out.println(10/2);
		int n1 = 10;
		int n2 = 3;
		double n3 = 3;
		int result;
		double result2;
		double result3;
		int result4;
		result = n1 / n2;
		System.out.println(result); // int는 정수이기때문에 실수는 표현되지않는다.
		
		result2 =n1 / n2;
		System.out.println(result2);
		
		result3 = n1 / n3;
		System.out.println(result3);
		
		//result4 = n1 / n3; 오류 = double은 int에 대입안됨.
		//System.out.println(result4);
		
		
		
		

	}

}
