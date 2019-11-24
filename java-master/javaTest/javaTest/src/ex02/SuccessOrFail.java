package ex02;

import java.util.Scanner;
//1.스캐너에 마우스 올리기
//2.ctrl + shift + o = import 단축키
public class SuccessOrFail {

	public static void main(String[] args) {
		//사용자 입력을 받는 클래스
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("점수를 입력하시오. ");
		int score = scanner.nextInt(); //정수입력 대기
		
		if(score>=80) {
			System.out.println("축하합니다! 합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		
		scanner.close();
	}

}
