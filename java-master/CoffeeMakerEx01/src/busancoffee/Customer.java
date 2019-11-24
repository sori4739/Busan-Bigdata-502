package busancoffee;

public class Customer {
	
	//å��
	public void order(String coffeeName,Barista barista, Menu menu) {
		//�޼���1
		MenuItem menuItem = menu.choose(coffeeName);
		
		if(menuItem==null) {
			System.out.println("�ش� Ŀ�ǰ� �����ϴ�.");
			return ;
		}
		
		//�޼���2
		Coffee coffee = barista.makeCoffee(menuItem);
		
		System.out.println(coffee.getName()+"�� �޾ҽ��ϴ�.");
		System.out.println(coffee.getPrice()+"�Դϴ�.");
	}
}
