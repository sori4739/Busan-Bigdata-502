package ex04;

public class ValuePassing {
	//int m 은 increase함수가 가지고 있는 지역변수 
	static void increase(int m) {
		m = m + 1;
	}
	//int n은 main함수가 가지고 있는 지역변수
	public static void main(String[] args) {
		int n = 10;
		//함수의 호출 -> 함수명(인수)
		increase(n);
		System.out.println("n :"+n);
		
		

	}

}
