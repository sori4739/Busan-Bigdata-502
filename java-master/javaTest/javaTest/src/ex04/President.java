package ex04;

public class President {
	private String name;
	private int age;
	
	//싱글톤 패턴 => 객체를 하나만 만드는 것을 보장
	private static President p = new President();
	
	public static President getInstance() {
		return p;
	}
	
	private President() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
