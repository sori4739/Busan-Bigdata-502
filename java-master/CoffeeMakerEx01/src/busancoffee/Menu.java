package busancoffee;

import java.util.List;

public class Menu {
	
	//��������
	private List<MenuItem>items;
	
	public Menu(List<MenuItem> items) {
		this.items = items;
	}

	//å��
	public MenuItem choose(String coffeeName) {
		for (MenuItem menuItem : items) {
			if (menuItem.getName().equals(coffeeName)) {
				return menuItem;
			}
		}
		return null;
	}
}
