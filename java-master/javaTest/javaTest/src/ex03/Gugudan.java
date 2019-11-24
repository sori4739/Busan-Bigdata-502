package ex03;

public class Gugudan {

	public static void main(String[] args) {
		//2*1 = 2 2*2 = 4 2*3 = 6 2*4 = 8....

		//반복횟수 9번!!
		for (int i = 1; i < 10; i++) {
			System.out.print("2*"+i+"="+2*i+", ");
		}
		System.out.println();
		
		for (int i = 1; i < 10; i++) {
			System.out.print("3*"+i+"="+3*i+", ");
		}
		System.out.println();
		
		for (int i = 1; i < 10; i++) {
			System.out.print("9*"+i+"="+9*i+", ");
		}
		System.out.println();
		
		//구구단 만들기
		for (int k = 2; k < 10; k++) {
			for (int i = 1; i < 10; i++) {
				System.out.print(k+"*"+i+"="+k*i+", ");
			}
			System.out.println();
		}
		
	}

}
