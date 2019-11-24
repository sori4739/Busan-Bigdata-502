package coffeeShop;

import java.util.Scanner;

public class Brista {
	public String makeCoffee(String coffeeName , Menu menu){
		Coffee coffee = new Coffee();
		coffee.setName(coffeeName);
		String orderCoffee = coffee.getName();
		return orderCoffee;
	}
}
