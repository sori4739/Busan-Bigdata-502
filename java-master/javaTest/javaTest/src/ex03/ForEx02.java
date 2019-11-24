package ex03;

public class ForEx02 {

	public static void main(String[] args) {
//		*
//		**
//		***
//		****

		// *
		for (int i = 0; i < 1; i++) {
			System.out.print("*");
		}
		System.out.println();
		// **
		for (int i = 0; i < 2; i++) {
			System.out.print("*");
		}
		System.out.println();
		// ***
		for (int i = 0; i < 3; i++) {
			System.out.print("*");
		}
		System.out.println();
		// ****
		for (int i = 0; i < 4; i++) {
			System.out.print("*");
		}
		System.out.println();
		// *****
		for (int i = 0; i < 5; i++) {
			System.out.print("*");
		}
		System.out.println();

		// *****
		for (int i = 0; i < 6; i++) { //5번 내려쓰기
			for (int k = 0; k < i; k++) { //별을 찍는것
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 0; i < 6; i++) {
			for (int k = 5; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//* ** *** ** *
		for (int i = 1; i < 6; i++) {
			if(i<4) {
				for (int m = 0; m < i  ; m++) {
					System.out.print("*");
				}
			}else {
				for (int j = 6; j > i ; j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}// end of main

}
