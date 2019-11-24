package ex04;

public class Life {
	private String name;//이름
	private int property;//재산
	private int height;//키
	
	
	public Life(String name, int property, int height) {
		this.name = name;
		this.property = property;
		this.height = height;
	}
	
	public void marry() {
		System.out.println("결혼하였습니다.");
		this.property = this.property - 500000;
	}
	
	public void getJob() {
		System.out.println("직장을 가지게 되었습니다.");
		this.property = this.property + 1000000;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getProperty() {
		return property;
	}


	public void setProperty(int property) {
		this.property = property;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}	
	
	
	
}
