package coffeeShop;

public class Customer {
		public void order(String coffeeName, Menu menu, Brista brista) {
			String coffee = brista.makeCoffee(coffeeName, menu);
			System.out.println(coffee+"�� �޾ҽ��ϴ�.");
		}
}
