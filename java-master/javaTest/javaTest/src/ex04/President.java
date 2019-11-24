package ex04;

public class President {
	private String name;
	private int age;
	
	//�̱��� ���� => ��ü�� �ϳ��� ����� ���� ����
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
