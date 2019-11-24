import java.util.ArrayList;
import java.util.List;

public class CoffeeApp {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Barista barista = new Barista();
		
		Cashier cashier = new Cashier();
		
		
		List<String> items = new ArrayList<>();
		items.add(CoffeeList.AMERICANO);
		items.add(CoffeeList.CAFEMOCA);
		items.add(CoffeeList.CAFERATTE);
		items.add(CoffeeList.MAKIYATTO);
		
		Menu menu = new Menu(items);
		
		customer.order(CoffeeList.CAFEMOCA, menu, cashier, barista);
		customer.order(CoffeeList.AMERICANO, menu, cashier, barista);
		customer.order(CoffeeList.CAFERATTE, menu, cashier, barista);
		customer.order(CoffeeList.MAKIYATTO, menu, cashier, barista);
		
		System.out.println("오늘의 주문목록");
		for (String item : cashier.orderList) {
			System.out.println(item+" ");
		}

	}

}
