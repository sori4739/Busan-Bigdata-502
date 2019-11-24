 package ex04;

public class PresidentApp {

	public static void main(String[] args) {
		President pp = President.getInstance();
		
		pp.setName("πÆ¿Á¿Œ");
		pp.setAge(60);
		
		System.out.println(pp.getName());
		System.out.println(pp.getAge());

		
	}

}
