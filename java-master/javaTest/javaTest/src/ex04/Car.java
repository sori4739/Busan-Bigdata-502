package ex04;

public class Car {
	private String name;
	private int power;
	private String type;
	
	//없어도 있는것 (생략되어 있음)
	public Car() {

	}
	
	//생성자 (필드가있는 생성자)
	public Car(String name, int power, String type) {
		this.name = name;
		this.power = power;
		this.type = type;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
