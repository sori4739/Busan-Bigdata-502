package busancoffee;

public class Customer {
	
	//책임
	public void order(String coffeeName,Barista barista, Menu menu) {
		//메세지1
		MenuItem menuItem = menu.choose(coffeeName);
		
		if(menuItem==null) {
			System.out.println("해당 커피가 없습니다.");
			return ;
		}
		
		//메세지2
		Coffee coffee = barista.makeCoffee(menuItem);
		
		System.out.println(coffee.getName()+"을 받았습니다.");
		System.out.println(coffee.getPrice()+"입니다.");
	}
}
