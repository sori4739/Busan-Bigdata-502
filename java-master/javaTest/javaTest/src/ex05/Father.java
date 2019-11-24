package ex05;

class Child extends Uncle{
	int speed = 20;
}

class Son extends Father{
	int speed = 12;
}

class Uncle{
	private int money =1000000;
	private int height = 160;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}

public class Father {
	protected int money =1000000000;
	protected int height = 188;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
