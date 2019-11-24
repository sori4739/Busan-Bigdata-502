package ex02;

public class IncreaseEx01 {

	public static void main(String[] args) {
		int num = 10;
		num=num + 1;
		System.out.println(num);
		num=num + 3;
		System.out.println(num);
		num=num - 1;
		System.out.println(num);//많이 쓰이기 때문에 줄여쓸 수 있는 식이있다.
		
		num++; // 증감연산
		System.out.println(num);
		num--;  //
		System.out.println(num);
		
		int n = 10;
		
		int result = n++; //후위 연산자 = n값은 11,대입하고 연산한다.
		System.out.println(result);
		
		int n2 = 10;
		
		int result2 = ++n2;//전위 연산자 =연산을 먼저하고 대입을한다.
		System.out.println(result2);
		
		

	}

}
