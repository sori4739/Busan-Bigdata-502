package busancoffee;


//OOP에서는 모든 것이 캡슐화되어 있어야 한다.
//BindingTime은 최대한 늦게 가져가야 한다.
public class MenuItem {
	private String name;
	private int price;
	
	public MenuItem(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
