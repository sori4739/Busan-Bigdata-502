package ex02;

public class IfEx01 {

	public static void main(String[] args) {
		if(true) {
			System.out.println("실행");
			
		}
		if(!false) {
			System.out.println("실행안됨");
		}
		
		if(2/2==1) {
			System.out.println("1입니다.");
		}
		if(2%2==0) {
		System.out.println("0입니다.");	
		}
		
		if(10>3) {
			System.out.println("10은 3보다크다.");
		}else {
			System.out.println("10은 3보다작다.");
		}
	}

}
