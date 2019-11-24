package ex02;

public class PracticeEx01 {

	public static void main(String[] args) {
		final int MONEY = 2680;
		// 500 , 100 , 50 , 10
		int restMoney = 	MONEY;
		int count;
		//500원 동전개수
		count = restMoney / 500;
		System.out.println("500원 개수 : "+count);
		//남은금액
		restMoney = restMoney % 500;
		System.out.println("남은금액 : "+restMoney);
		//100원 개수
		 count = restMoney / 100;
		 System.out.println("100원 개수 : "+count);
		//남은금액
		 restMoney = restMoney % 100;
		 System.out.println("남은금액 : "+restMoney);
		//50원개수
		count = restMoney / 50;
		System.out.println("50원 개수 : "+count);
		//남은금액
		restMoney = restMoney % 50;
		System.out.println("남은금액 : "+restMoney);
		//10원개수
		count = restMoney / 10;
		System.out.println("10원 개수 : "+count);
		//남은금액
		restMoney = restMoney % 10;
		System.out.println("남은금액 : "+restMoney);
		//restMoney의 값은 변수이기 때문에 변해가면서 값을 출력한다
		
		
		
		
		
		
		
	}

}
