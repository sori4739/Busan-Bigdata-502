
public class Customer {
	public void order(String coffeeName, Menu menu, Cashier cashier, Barista barista) {
		
		String menuItem = menu.choose(coffeeName);
		
		Coffee coffee = cashier.completeOrder(menuItem, barista);
		
		System.out.println(coffee.getName()+"를 받았습니다.");
	} 
}
