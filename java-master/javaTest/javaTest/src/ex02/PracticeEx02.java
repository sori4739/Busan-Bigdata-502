package ex02;

public class PracticeEx02 {
	
	//void는 return하지 않겠다.
	static int coin(int r,int coin) {
		//500원 동전개수
		int count = r / coin;
		System.out.println(coin+"원 개수 : "+count);
		//남은금액
		r = r % coin;
		System.out.println("남은금액 : "+r);
		return r;
	}

	public static void main(String[] args) {
		final int MONEY = 2680;
		// 500 , 100 , 50 , 10
		int restMoney = 	MONEY;
		//함수 호출
		restMoney = coin(restMoney,500);
		restMoney = coin(restMoney,100);
		restMoney = coin(restMoney,50);
		restMoney = coin(restMoney,10);
		
		
	
		
	}

}
