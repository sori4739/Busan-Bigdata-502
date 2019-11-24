package coffeeShop;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeShop {
	public static void main(String[] args) {
		Customer customer = new Customer();
		System.out.println("CAFE ����");
		System.out.println("===============");
		
		ArrayList<String> MenuList = new ArrayList<>();
		MenuList.add(CoffeeList.AMERICANO);
		MenuList.add(CoffeeList.CAFEMOCA);
		MenuList.add(CoffeeList.CAFERATTE);
		MenuList.add(CoffeeList.MAKIYATTO);
		
		System.out.println("<�޴����Դϴ�>");
		System.out.println(" ");
		
		for (String menu : MenuList) {
			System.out.println(menu);
			System.out.println("----------");
		}
		Menu menu = new Menu(MenuList);
		
		Brista brista = new Brista();
		
		while(true) {
			System.out.println("�ֹ� �ϼ���");
			Scanner sc =new Scanner(System.in);
			String coffeeName = sc.next();
			if (MenuList.toString().contains(coffeeName)) {
				customer.order(coffeeName, menu, brista);
				break;
			}else {
				System.out.println("���� �޴� �Դϴ�.");
				continue;
			}
		}
		
		
	}
}
