package protoss;

class Earth {
	 String name = "������";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Asia extends Earth{
	 String name = "�ƽþ���";
	 @Override
	public String getName() {
		return name;
	}
}

class Korea extends Asia{
	 String name = "�ѱ���";
	 @Override
	public String getName() {
		return name;
	}

}

class Busan extends Korea{
	 String name = "�λ���";
	 @Override
	public String getName() {
		return name;
	}
}

public class BindApp {

	public static void main(String[] args) {
		Earth e = new Korea();
		System.out.println("���� ���� :"+e.name);
		System.out.println("�Լ� ���� :"+e.getName());

	}

}
