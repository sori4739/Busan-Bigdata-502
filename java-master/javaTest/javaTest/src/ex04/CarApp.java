package ex04;

public class CarApp {

	public static void main(String[] args) {
		
		Car car = new Car("티코",1500,"소형차");
		System.out.println(car.getName());
		System.out.println(car.getPower());
		System.out.println(car.getType());
		System.out.println();
		
		Car c = new Car();
		c.setName("페라리");
		c.setPower(4000);
		c.setType("스포츠카");
		
		System.out.println(c.getName());
		System.out.println(c.getPower());
		System.out.println(c.getType());
		
		Car c2 = new Car();
		c2.setName("벤츠");
		c2.setPower(2000);
		c2.setType("세단");
		
		System.out.println(c2.getName());
		System.out.println(c2.getPower());
		System.out.println(c2.getType());
		
		Car c3 = new Car();
		c3.setName("산타페");
		c3.setPower(3000);
		c3.setType("suv");
		
		System.out.println(c3.getName());
		System.out.println(c3.getPower());
		System.out.println(c3.getType());
		
		
	}

}
