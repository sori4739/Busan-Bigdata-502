package ex04;

public class Life {
	private String name;//�̸�
	private int property;//���
	private int height;//Ű
	
	
	public Life(String name, int property, int height) {
		this.name = name;
		this.property = property;
		this.height = height;
	}
	
	public void marry() {
		System.out.println("��ȥ�Ͽ����ϴ�.");
		this.property = this.property - 500000;
	}
	
	public void getJob() {
		System.out.println("������ ������ �Ǿ����ϴ�.");
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
