package busancoffee;

import java.util.List;

public class Menu {
	
	//콤포지션
	private List<MenuItem>items;
	
	public Menu(List<MenuItem> items) {
		this.items = items;
	}

	//책임
	public MenuItem choose(String coffeeName) {
		for (MenuItem menuItem : items) {
			if (menuItem.getName().equals(coffeeName)) {
				return menuItem;
			}
		}
		return null;
	}
}
