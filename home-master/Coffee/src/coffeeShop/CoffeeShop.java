package coffeeShop;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeShop {
	public static void main(String[] args) {
		Customer customer = new Customer();
		System.out.println("CAFE 입장");
		System.out.println("===============");
		
		ArrayList<String> MenuList = new ArrayList<>();
		MenuList.add(CoffeeList.AMERICANO);
		MenuList.add(CoffeeList.CAFEMOCA);
		MenuList.add(CoffeeList.CAFERATTE);
		MenuList.add(CoffeeList.MAKIYATTO);
		
		System.out.println("<메뉴판입니다>");
		System.out.println(" ");
		
		for (String menu : MenuList) {
			System.out.println(menu);
			System.out.println("----------");
		}
		Menu menu = new Menu(MenuList);
		
		Brista brista = new Brista();
		
		while(true) {
			System.out.println("주문 하세요");
			Scanner sc =new Scanner(System.in);
			String coffeeName = sc.next();
			if (MenuList.toString().contains(coffeeName)) {
				customer.order(coffeeName, menu, brista);
				break;
			}else {
				System.out.println("없는 메뉴 입니다.");
				continue;
			}
		}
		
		
	}
}
