package ex02;

public class OperatorEx02 {
	

	public static void main(String[] args) {
		//230초는 몇분이고 몇초인가
		int time = 230; //초
		int min = time / 60;
		System.out.println("분 : "+min); //결합연산자
		
		int sec = time - (min * 60);
		System.out.println("초 : "+sec);
		
		int sec2 = time % 60;
		System.out.println("초 : "+sec2);
	}
	
}
