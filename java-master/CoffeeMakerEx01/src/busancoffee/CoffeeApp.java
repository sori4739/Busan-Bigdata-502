package busancoffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeApp {

	public static void main(String[] args) {
		//커피 생성을 위한 객체지향 설계
		Customer customer = new Customer();
		Barista barista = new Barista();
		
		MenuItem m1 = new MenuItem("아메리카노", 1500);
		MenuItem m2 = new MenuItem("에스프레소", 2000);
		MenuItem m3 = new MenuItem("카푸치노", 3000);
		MenuItem m4 = new MenuItem("카페모카", 3500);
		List<MenuItem> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		
		Menu menu = new Menu(list);
		
		//1.커피를 주문하라(메시지)
		customer.order(Type.AMERICANO, barista, menu);

	}

}
