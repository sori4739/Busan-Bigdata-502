package ex03;

import java.util.Random;

public class WhileEx02 {

	public static void main(String[] args) {
		//난수 발생기
		Random r = new Random();
		
		
		while(true) {
			int num = r.nextInt(10)+1; //1~10
			System.out.println("num : "+num);
			
			if(num < 6) {
				break;
			}else {
				continue;
			}
			//System.out.println("while 끝"); 도달할 수 없음.
		}
	}

}
