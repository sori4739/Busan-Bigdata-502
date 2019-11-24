package protoss;

class Earth {
	 String name = "지구인";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Asia extends Earth{
	 String name = "아시아인";
	 @Override
	public String getName() {
		return name;
	}
}

class Korea extends Asia{
	 String name = "한국인";
	 @Override
	public String getName() {
		return name;
	}

}

class Busan extends Korea{
	 String name = "부산사람";
	 @Override
	public String getName() {
		return name;
	}
}

public class BindApp {

	public static void main(String[] args) {
		Earth e = new Korea();
		System.out.println("변수 접근 :"+e.name);
		System.out.println("함수 접근 :"+e.getName());

	}

}
